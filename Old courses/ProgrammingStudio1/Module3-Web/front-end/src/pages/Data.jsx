import React from "react";

import styled from "styled-components";

const Wrapper = styled.div`
  & {
    height: 70vh;
  }
  .header .top_navigation {
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
    transition: ease-in 0.3s;
  }
  .top_navigation a:hover {
    color: #fffef4;
    background-color: #ff6500;
    border-radius: 8px;
    padding: 5px;
  }
  .header .header_content {
    display: flex;
    justify-content: center;
    align-items: center;
    margin: 30px 227px;
  }
  .header_content h1 {
    font-family: "Martel", serif;
    font-size: 80px;
    font-style: normal;
    font-weight: 700;
    background: linear-gradient(90deg, #fb6714 0%, #f06313 36%, #953d0c 100%);
    background-clip: text;
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent;
  }
  .wrapper {
    display: flex;
    justify-content: space-around;
  }
  .button_BASIC,
  .button_ADVANCED {
    display: flex;
    justify-content: center;
    align-items: center;
    margin-top: 50px;
    width: 300px;
    height: 350px;
    border-radius: 8px;
    margin-bottom: 50px;
    transition: ease-in-out 0.3s;
  }
  .button_BASIC a,
  .button_ADVANCED a {
    display: flex;
    justify-content: center;
    align-items: center;
    width: 300px;
    height: 350px;
    color: #000;
    font-family: "Mate", serif;
    font-size: 48px;
    font-style: normal;
    font-weight: 400;
    text-decoration: none;
  }
  .button_BASIC:hover,
  .button_ADVANCED:hover {
    background-color: #beb2b2;
  }
`;

const Data = () => {
  return (
    <Wrapper>
      <div className="header_content text-center m-8 mt-16">
        <h1 className="">Select Your Options</h1>
      </div>
      <div className="wrapper mt-16">
        <button className="button_BASIC border-black bg-slate-200 border-2">
          <a href="/app/data/level2">BASIC</a>
        </button>
        <button className="button_ADVANCED border-black bg-slate-200 border-2">
          <a href="/app/data/level3">ADVANCED</a>
        </button>
      </div>
    </Wrapper>
  );
};

export default Data;
