import React from "react";
import styled from "styled-components";

const Wrapper = styled.div`
  .top_navigation {
    width: 100%;
    height: 54px;
    background-color: #ff6500;
    opacity: 0.8;
    display: flex;
    justify-content: space-between;
    margin-top: 55px;
    margin-left: 0;
    margin-right: 0;
    align-items: center;
    justify-content: space-around;
  }
  .top_navigation a {
    text-decoration: none;
    color: #000;
    font-family: "Merriweather", serif;
    font-size: 32px;
    font-style: normal;
    font-weight: 400;
    transition: ease-in 0.2s;
  }
  .top_navigation a:hover {
    color: #fffef4;
    /* background-color: #ff6500; */
    /* border-radius: 8px; */
    padding: 5px;
  }
`;

const Navbar = () => {
  return (
    <Wrapper>
      <header class="header">
        <div class="top_navigation">
          <a href="/app">Home</a>
          <a href="/app/data">Data</a>
          <a href="/app/about-us">About us</a>
          <a href="/app/contact">Contact</a>
        </div>
      </header>
    </Wrapper>
  );
};

export default Navbar;
