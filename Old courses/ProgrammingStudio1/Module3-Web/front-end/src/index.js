import React from "react";
import ReactDOM from "react-dom/client";
import "./index.css";

import 'bootstrap/dist/css/bootstrap.min.css';

import { createBrowserRouter, RouterProvider } from "react-router-dom";

import { QueryClient, QueryClientProvider } from "@tanstack/react-query";

import PageLayout from "./PageLayout";
import AboutUs from "./pages/AboutUs";
import Home from "./pages/Home";
import Data from "./pages/Data";
import Contact from "./pages/Contact";
import Level2 from "./pages/Level2";
import Level3 from "./pages/Level3";

const router = createBrowserRouter([
  {
    path: "/app/",
    element: <Home />,
  },
  {
    element: <PageLayout />,
    children: [
      {
        path: "/app/",
        element: <Home />,
      },
      {
        path: "/app/about-us",
        element: <AboutUs />,
      },
      {
        path: "/app/data",
        element: <Data />,
      },
      {
        path: "/app/data/level2",
        element: <Level2 />,
      },
      {
        path: "/app/data/level3",
        element: <Level3 />,
      },
      {
        path: "/app/contact",
        element: <Contact />,
      },
    ],
  },
]);

const queryClient = new QueryClient();

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <React.StrictMode>
    <QueryClientProvider client={queryClient}>
      <RouterProvider router={router} />
    </QueryClientProvider>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
// reportWebVitals();
