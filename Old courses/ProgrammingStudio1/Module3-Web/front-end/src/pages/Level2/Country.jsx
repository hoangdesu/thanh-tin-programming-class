import { useQuery } from "@tanstack/react-query";
import React, { useEffect, useState } from "react";
import axios from "../../config/axios";
import styled from "styled-components";
import { Button, Form, Table } from "react-bootstrap";

const Wrapper = styled.div`
  & {
    font-size: 22px;
    color: #cf6452;
    margin-top: 100px;
    min-height: 60vh;
  }

  select {
    border: black;
    border-color: black;
    border-width: 16px;
    border-style: solid;
    border-width: 1px;
    border-radius: 8px;
    padding: 8px;
  }
`;

const Country = () => {
  const {
    // isLoading,
    // error,
    data: years,
    // refetch,
  } = useQuery({
    queryKey: ["years"],
    queryFn: () => axios.get(`/level2/world/years`).then((res) => res.data),
  });

  const [startYear, setStartYear] = useState(1750);
  const [endYear, setEndYear] = useState(1751);

  const [data, setData] = useState(null);

  const [countries, setAllCountries] = useState(null);

  const [selectedCountry, setSelectedCountry] = useState(null);
  const [selectedCountries, setSelectedCountries] = useState([]);

  const [selectedRegionType, setSelectedRegionType] = useState("states"); // 'states' | 'cities'

  const [selectedStatistic, setSelectedStatistic] = useState("average"); // 'average' | 'minimum' | 'maximum'

  useEffect(() => {
    const getAllCountries = async () => {
      const { data } = await axios.get("/level2/countries/all");
      setAllCountries(data.filter((c) => c !== "World"));
    };
    getAllCountries();
  }, []);

  const onFormSubmit = async (e) => {
    e.preventDefault();

    const requestBody = {
      startYear,
      endYear,
      country: selectedCountry,
      regionType: selectedRegionType,
      statistic: selectedStatistic,
    };

    const { data } = await axios.post(
      "/level2/country/tempchange",
      requestBody
    );

    console.log(data);
    setData(data);
  };

  const onSelectCountries = (e) => {
    e.preventDefault();
    // console.log(selectedCountries);
    const updatedSelectedCountries = [...selectedCountries, selectedCountry];
    // console.log("updatedSelectedCountries", updatedSelectedCountries);
    setSelectedCountries(updatedSelectedCountries);
    const updatedCountries = countries.filter((c) => c !== selectedCountry);
    setAllCountries(updatedCountries);
  };

  const archived = (
    <form action="">
      <div className="flex flex-row gap-32 justify-center">
        <div className="flex gap-3 items-center">
          <label htmlFor="">Start year</label>
          <select
            onChange={(e) => {
              setStartYear(e.target.value);
              // setData(null);
            }}
          >
            {years &&
              years.map((y) => (
                <option key={y} value={y}>
                  {y}
                </option>
              ))}
          </select>
        </div>

        <div className="flex gap-3 items-center">
          <label htmlFor="">End year</label>
          <select
            onChange={(e) => {
              setEndYear(e.target.value);
              // setData(null);
            }}
          >
            {years &&
              years.map((y) => (
                <option key={y} value={y}>
                  {y}
                </option>
              ))}
          </select>
        </div>
      </div>

      <div className="flex flex-col items-center justify-center mt-20 gap-5">
        <div className="flex gap-3 items-center">
          <label htmlFor="">Countries</label>
          <select
            onChange={(e) => {
              setSelectedCountry(e.target.value);
            }}
          >
            {countries &&
              countries.map((country) => (
                <option key={country} value={country}>
                  {country}
                </option>
              ))}
          </select>
          <Button onClick={(e) => onSelectCountries(e)} color="secondary">
            Select
          </Button>
          <Button
            variant="danger"
            onClick={() => {
              setSelectedCountries([]);
            }}
          >
            Clear
          </Button>
        </div>
        <div>
          {selectedCountries.length > 0 ? (
            <>
              <p>Selected countries: {selectedCountries.length}</p>
              <ul className="list-disc">
                {selectedCountries.map((country) => (
                  <li key={country}>{country}</li>
                ))}
              </ul>
            </>
          ) : (
            <p>All countries</p>
          )}
        </div>
      </div>

      <div className="flex items-center justify-center text-center mt-16">
        <button
          onClick={(e) => onFormSubmit(e)}
          className="text-white bg-orange-400 px-20 py-3 text-center rounded-lg hover:cursor-pointer hover:bg-orange-600 transition duration-200"
        >
          Submit
        </button>
      </div>
    </form>
  );

  return (
    <Wrapper>
      <form action="">
        <div className="flex flex-row gap-32 justify-center">
          <div className="flex gap-3 items-center">
            <label htmlFor="">Start year</label>
            <select
              onChange={(e) => {
                setStartYear(e.target.value);
                // setData(null);
              }}
            >
              {years &&
                years.map((y) => (
                  <option key={y} value={y}>
                    {y}
                  </option>
                ))}
            </select>
          </div>

          <div className="flex gap-3 items-center">
            <label htmlFor="">End year</label>
            <select
              onChange={(e) => {
                setEndYear(e.target.value);
                // setData(null);
              }}
            >
              {years &&
                years.map((y) => (
                  <option key={y} value={y}>
                    {y}
                  </option>
                ))}
            </select>
          </div>
        </div>

        <div className="flex flex-col items-center justify-center mt-20 gap-5">
          <div className="flex gap-3 items-center">
            <label htmlFor="">Select country</label>
            <select
              onChange={(e) => {
                setSelectedCountry(e.target.value);
              }}
            >
              {countries &&
                countries.map((country) => (
                  <option key={country} value={country}>
                    {country}
                  </option>
                ))}
            </select>
          </div>
        </div>

        <div className="flex flex-row mx-auto items-start justify-center mt-20 gap-32">
          <div>
            <p>Filter data by:</p>
            <Form.Check
              type={"radio"}
              id={`default-states`}
              label={`States`}
              name="region"
              value="states"
              onChange={(e) => setSelectedRegionType(e.currentTarget.value)}
              defaultChecked
            />
            <Form.Check
              type={"radio"}
              id={`default-cities`}
              label={`Cities`}
              name="region"
              value="cities"
              onChange={(e) => setSelectedRegionType(e.currentTarget.value)}
            />
          </div>

          <div>
            <p>Choose statistic:</p>
            <Form.Check
              type={"radio"}
              id={`default-average`}
              label={`Average`}
              name="statistic"
              value="average"
              onChange={(e) => setSelectedStatistic(e.currentTarget.value)}
              defaultChecked
            />
            <Form.Check
              type={"radio"}
              id={`default-minimum`}
              label={`Minimum`}
              name="statistic"
              value="minimum"
              onChange={(e) => setSelectedStatistic(e.currentTarget.value)}
            />
            <Form.Check
              type={"radio"}
              id={`default-maximum`}
              label={`Maximum`}
              name="statistic"
              value="maximum"
              onChange={(e) => setSelectedStatistic(e.currentTarget.value)}
            />
          </div>
        </div>

        <div className="flex items-center justify-center text-center mt-16">
          <button
            onClick={(e) => onFormSubmit(e)}
            className="text-white bg-orange-400 px-20 py-3 text-center rounded-lg hover:cursor-pointer hover:bg-orange-600 transition duration-200"
          >
            Submit
          </button>
        </div>

        <div className="flex flex-col items-center justify-center my-20">
          {data ? (
            <>
              {data.length > 0 ? (
                <div className="w-[80%] flex flex-col items-center justify-center">
                  <p>
                    {selectedStatistic} temperature change of {selectedCountry}
                    's {selectedRegionType} between {startYear} and {endYear}
                  </p>
                  <p className="mb-8">Data is sorted descending by TempDifference</p>

                  <Table
                    className="w-1 border border-slate-600 border-collapse border-spacing-4 table-auto"
                    border={1}
                  >
                    <thead>
                      <tr>
                        <th>#</th>
                        <th>Name</th>
                        <th>StartYearTemp</th>
                        <th>EndYearTemp</th>
                        <th>TempDifference</th>
                      </tr>
                    </thead>
                    <tbody>
                      {data.map((d, i) => (
                        <tr>
                          <td>{i + 1}</td>
                          <td>{d.Name}</td>
                          <td>{d.StartYearTemp.toFixed(3)}°C</td>
                          <td>{d.EndYearTemp.toFixed(3)}°C</td>
                          <td>{d.TempDifference.toFixed(3)}°C</td>
                        </tr>
                      ))}
                    </tbody>
                  </Table>
                </div>
              ) : (
                <p className="text-md mt-8">
                  No data available for your selections
                </p>
              )}
            </>
          ) : (
            <>Select above and click submit</>
          )}
        </div>
      </form>
    </Wrapper>
  );
};

export default Country;
