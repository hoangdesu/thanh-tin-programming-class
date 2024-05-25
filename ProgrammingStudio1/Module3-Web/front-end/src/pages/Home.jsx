import React from "react";
import styled from "styled-components";

import Earth1 from "../img/earth-1.png";
import Temp1 from "../img/Temp-1.png";
import Navbar from "../components/Navbar";

import GlobalLogo from "../img/Global logo.png";
import Footer from "../components/Footer";

const Wrapper = styled.div`
  @import url("https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css");
  @import url("https://fonts.googleapis.com/css?family=Martel:700|Mate:400|Merriweather:400,700|Anonymous+Pro:400");

  & {
    background-color: #fffef4;
    margin: 0;
  }
  .header_title {
    width: 100%;
    display: flex;
    align-items: center;
    flex-direction: column;
  }
  .logo {
    width: 121px;
    height: 121px;
  }
  .header h1 {
    color: #000;
    font-family: "Marriweather", serif;
    font-size: 24px;
    font-style: normal;
    font-weight: 700;
    text-align: center;
    margin: 0;
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
  .wrapper_title {
    width: 100%;
    height: 100%;
    display: flex;
    justify-content: center;
    margin-top: 110px;
    flex-direction: column;
  }
  .title {
    text-align: center;
    font-family: "Gentium Book Basic";
    font-size: 100px;
    font-style: normal;
    font-weight: 400;
    background: linear-gradient(
      90deg,
      rgba(223, 92, 75, 0.98) 0%,
      rgba(221, 92, 74, 0.98) 34%,
      rgba(218, 90, 73, 0.98) 45.51%,
      rgba(121, 50, 40, 0.98) 100%
    );
    background-clip: text;
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent;
    margin: 0;
  }
  .subtitle {
    margin-top: 36px;
    color: #953d0c;
    text-align: center;
    font-family: "Gentium Basic";
    font-size: 36px;
    font-style: normal;
    font-weight: 400;
  }
  .subtitle2 {
    color: rgba(223, 92, 75, 0.76);
    font-family: "Gentium Book Basic";
    font-size: 44px;
    font-style: normal;
    font-weight: 400;
    text-align: center;
    margin-top: 30px;
  }
  svg {
    width: 100%;
    text-align: center;
  }
  .wrapper_temp,
  .wrapper_population,
  .wrapper_question {
    margin-top: 75px;
    display: flex;
    justify-content: center;
    flex-direction: column;
    align-items: center;
  }
  .title_temp,
  .title_pop,
  .title_question {
    color: #000;
    font-family: "Martel", serif;
    font-size: 36px;
    font-style: normal;
    font-weight: 800;
    text-align: center;
  }
  .context_temp,
  .context_pop,
  .context_question {
    display: flex;
    border: #000 solid 0.5px;
    border-radius: 10px;
    align-items: center;
    justify-content: center;
  }
  ion-icon {
    width: 128px;
    height: 128px;
    margin-left: 10px;
  }
  .context_temp p,
  .context_pop p,
  .context_question p {
    width: 914px;
    height: 282px;
    margin: 25px auto;
    color: rgba(0, 0, 0, 0.8);
    font-family: "Mate", serif;
    font-size: 33px;
    font-style: normal;
    font-weight: 400;
    line-height: 2;
    text-align: center;
  }
  .bottom_text {
    text-align: center;
    color: #000;
    font-family: "Martel", serif;
    font-size: 50px;
    font-style: normal;
    font-weight: 700;
  }
  .data {
    display: flex;
    justify-content: center;
    align-items: center;
    width: 289px;
    background-color: #ffc100;
    border-radius: 10px;
    margin-left: 50%;
    transform: translate(-50%);
    cursor: pointer;
    margin-bottom: 100px;
  }
  .data a {
    width: 100%;
    color: #000;
    font-family: "Merriweather", serif;
    font-size: 50px;
    font-style: italic;
    font-weight: 400;
    text-decoration: none;
  }
  .data:hover {
    color: #fffef4;
    background-color: #ff6500;
  }

  .overlap-3 {
    position: relative;
    width: 100%;
    height: 339px;
    background-color: #fff9d0;
  }

  .logo-2 {
    position: absolute;
    width: 269px;
    height: 246px;
    top: 71px;
    left: 50%;
    transform: translate(-50%);
    object-fit: cover;
  }

  .text-wrapper-1 {
    top: 39px;
    left: 50%;
    transform: translate(-50%);
    font-weight: 700;
    font-size: 24px;
    position: absolute;
    width: 444px;
    font-family: "Merriweather", Helvetica;
    color: #000000;
    letter-spacing: 0;
    line-height: normal;
  }

  .text-wrapper-2 {
    top: 101px;
    left: 142px;
    font-weight: 400;
    font-size: 16px;
    position: absolute;
    width: 444px;
    font-family: "Merriweather", Helvetica;
    color: #000000;
    letter-spacing: 0;
    line-height: normal;
  }

  .text-wrapper-3 {
    position: absolute;
    width: 444px;
    top: 195px;
    left: 147px;
    font-family: "Merriweather", Helvetica;
    font-weight: 400;
    color: #000000;
    font-size: 16px;
    letter-spacing: 0;
    line-height: normal;
  }

  .text-wrapper-4 {
    position: absolute;
    width: 444px;
    top: 279px;
    left: 147px;
    font-family: "Merriweather", Helvetica;
    font-weight: 400;
    color: #000000;
    font-size: 16px;
    letter-spacing: 0;
    line-height: normal;
  }

  .icon-facebook {
    position: absolute;
    width: 35px;
    height: 53px;
    top: 83px;
    left: 86px;
  }

  .icon-instagram {
    position: absolute;
    width: 55px;
    height: 49px;
    top: 178px;
    left: 76px;
  }

  .icon-mail {
    position: absolute;
    width: 55px;
    height: 36px;
    top: 270px;
    left: 76px;
  }

  .image-1 {
    position: absolute;
    width: 251px;
    height: 229px;
    top: 55px;
    left: 75%;
    object-fit: cover;
  }

  .overlap-1 {
    position: absolute;
    width: 100%;
    height: 1132px;
    top: 145px;
    z-index: -1;
  }

  .earth {
    position: absolute;
    width: 966px;
    height: 1045px;
    top: 87px;
    left: 50%;
    transform: translate(-50%);
    object-fit: cover;
  }

  .overlap-2 {
    position: absolute;
    width: 100%;
    height: 717px;
    top: 1475px;
  }

  .temppop {
    position: absolute;
    width: 700px;
    height: 676px;
    top: 0;
    left: 50%;
    transform: translate(-50%);
    object-fit: cover;
  }
`;

const Home = () => {
  return (
    <>
      <Wrapper>
        <div class="header_title">
          <img class="logo" src={GlobalLogo} alt="Global logo" />
          <h1 className="font-bold text-xl">CHRONIC TEMPERATURE MACHINE</h1>
        </div>
        <Navbar />
        <div class="wrapper_title">
          <p class="title">CLIMATE CHANGE</p>
          <p class="subtitle">"Explore the Data, Empower Change."</p>
          <p class="subtitle2">Explore More</p>
          <svg
            xmlns="http://www.w3.org/2000/svg"
            width="64"
            height="199"
            viewBox="0 0 64 199"
            fill="none"
          >
            <rect
              x="40.1127"
              y="145.357"
              width="15.7746"
              height="145.357"
              transform="rotate(-180 40.1127 145.357)"
              fill="#DF5C4B"
            />
            <path d="M32 199L4.28722 137.57H59.7128L32 199Z" fill="#DF5C4B" />
          </svg>
        </div>

        <div class="overlap-1">
          <img class="Earth" src={Earth1} alt="" />
        </div>

        <div class="wrapper_temp">
          <p class="title_temp">GLOBAL TEMPERATURE</p>
          <div class="context_temp">
            <ion-icon name="thermometer-outline"></ion-icon>
            <p>
              In 1750, the global average temperature was 8.719 °C
              <br />
              In 2015, the average temperature has increased to 9.831 °C
              <br />
              Just in 256 years, the temperature increased by 1.112 °C
              <br />
              Which means only two and a half centuries ❗️❗️❗️
            </p>
          </div>
        </div>

        <div class="wrapper_population">
          <p class="title_pop">POPULATION</p>
          <div class="context_pop">
            <ion-icon name="people-outline"></ion-icon>
            <p>
              In 1960, there was around 3 billion people on the Earth
              <br />
              In 2013, the population has grown up to around 7.1 billion people
              <br />
              Over 53 years, human has increased by more than 4.1 billion
              people.
              <br />
              Only half a century ❗️❗️❗️
            </p>
          </div>
        </div>

        <div class="wrapper_question">
          <p class="title_question">HOW DID THE CHANGES TAKE PLACE ❓</p>
          <div class="context_question">
            <p>
              Are you surprised by the numbers presented above ?<br />
              Are you curious what happened during those period ?<br />
              Do you want more detailed info ?
            </p>
          </div>
        </div>

        <div class="overlap-2">
          <img class="temppop" src={Temp1} alt="a" />
        </div>

        <p class="bottom_text">👇🏻 We have everything you need 👇🏻</p>
        <button class="data">
          <a href="selectionPage.html"> Right Here</a>
        </button>
        <Footer />
      </Wrapper>
    </>
  );
};

export default Home;
