import React, { useEffect, useState } from "react";

import axios from "../../config/axios";
import { useQuery } from "@tanstack/react-query";
import styled from "styled-components";

import { Button, Carousel } from "react-bootstrap";

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

const World = () => {
  const {
    // isLoading,
    // error,
    data: years,
    // refetch,
  } = useQuery({
    queryKey: ["years"],
    queryFn: () => axios.get(`/level2/world/years`).then((res) => res.data),
  });

  const [startYear, setStartYear] = useState(2000);
  const [endYear, setEndYear] = useState(2015);

  const [data, setData] = useState(null);

  const onFormSubmit = async (e) => {
    e.preventDefault();
    // console.log(startYear, endYear);

    const res = await axios.post("/level2/world/data", {
      startYear: Number(startYear),
      endYear: Number(endYear),
    });

    console.log(res.data);
    setData(res.data);
  };

  return (
    <Wrapper>
      <form action="">
        <div className="flex flex-row gap-32 justify-center">
          <div className="flex gap-3 items-center">
            <label htmlFor="">Start year</label>
            <select
              onChange={(e) => {
                setStartYear(e.target.value);
                setData(null);
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
                setData(null);
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
        <div className="flex items-center justify-center text-center mt-16">
          <button
            onClick={(e) => onFormSubmit(e)}
            className="text-white bg-orange-400 px-20 py-3 text-center rounded-lg hover:cursor-pointer hover:bg-orange-600 transition duration-200"
          >
            Submit
          </button>
        </div>
      </form>

      {/* Display data */}
      <div className="mt-16">
        {data ? (
          <div className="text-black bg-orange-100 m-10 p-8">
            <Carousel className="text-black min-h-[400px]">
              <Carousel.Item>
                <div className="p-10 flex flex-col items-center">
                  <h3 className="text-center">
                    Average Land Temperature change
                  </h3>
                  <p className="text-center">In {endYear - startYear} years</p>
                  <div className="flex flex-row items-center justify-center gap-5 mt-8">
                    <h1>{data.tempDiff.toFixed(2)}°C</h1>
                    <p className="text-8xl">
                      {data.yearTemps[endYear] - data.yearTemps[startYear] > 0
                        ? "⬆️"
                        : "⬇️"}
                    </p>
                    <div>
                      <span className="">
                        {startYear}:{" "}
                        <h4 className="text-bold mb-8">
                          {data.yearTemps[startYear]}°C
                        </h4>
                      </span>
                      <span className="mt-8">
                        {endYear}:{" "}
                        <h4 className="text-bold">
                          {data.yearTemps[endYear]}°C
                        </h4>
                      </span>
                    </div>
                  </div>
                </div>
              </Carousel.Item>
              <Carousel.Item>
                <div className="p-10 flex flex-col items-center">
                  <h3 className="text-center">Average Population change</h3>
                  {data.yearsPopulation?.startYear != null ? (
                    <>
                      <p className="text-center">
                        In {endYear - startYear} years
                      </p>
                      <div className="flex flex-row items-center justify-center gap-5 mt-8">
                        <div>
                          <h1>{data.populationDifference.toLocaleString()}</h1>
                          <span>people</span>
                        </div>
                        <p className="text-8xl">
                          {data.yearsPopulation[endYear] -
                            data.yearsPopulation[startYear] >
                          0
                            ? "⬆️"
                            : "⬇️"}
                        </p>
                        <div>
                          <span className="">
                            {startYear}:{" "}
                            <h4 className="text-bold mb-8">
                              {data.yearsPopulation[startYear].toLocaleString()}
                            </h4>
                          </span>
                          <span className="mt-8">
                            {endYear}:{" "}
                            <h4 className="text-bold">
                              {data.yearsPopulation[endYear].toLocaleString()}
                            </h4>
                          </span>
                        </div>
                      </div>
                    </>
                  ) : (
                    <>
                      <p className="mt-20">No data for population prior to 1960.</p>
                    </>
                  )}
                </div>
              </Carousel.Item>
              {/* <Carousel.Item>
                <div>
                  <h1>Land temperature</h1>
                  <h2>Temp diff: {data.tempDiff}</h2>
                  <p>
                    Year {startYear}: {data.yearTemps[startYear]}
                  </p>
                  <p>
                    Year {endYear}: {data.yearTemps[endYear]}
                  </p>
                </div>
              </Carousel.Item> */}
            </Carousel>
          </div>
        ) : (
          <div className="text-center mt-32">
            <p>Select year ranges and submit to see data</p>
            <p className="text-sm">
              (Note that there is no data for population prior to 1960)
            </p>
          </div>
        )}
      </div>
    </Wrapper>
  );
};

export default World;
