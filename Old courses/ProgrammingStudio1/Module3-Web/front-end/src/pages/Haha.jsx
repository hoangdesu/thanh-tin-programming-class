import { useQuery } from "@tanstack/react-query";
import React from "react";
import axios from "../config/axios"

const Haha = () => {
  const { isLoading, error, data, refetch } = useQuery({
    queryKey: ["a"],
    queryFn: () =>
      axios.get(`/api/countries`).then((res) => res.data),
    // onSuccess: campgrounds => {
    //     setSortedCampgrounds(campgrounds);
    // },
  });

  console.log(data);

  if (isLoading) return "Loading...";

  if (data)
    return (
      <div>
        <h1>HAHAHA!!!</h1>
        <p>{data}</p>
      </div>
    );
};

export default Haha;
