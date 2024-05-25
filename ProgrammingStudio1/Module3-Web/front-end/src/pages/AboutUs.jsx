import React from "react";
import styled from "styled-components";

const Wrapper = styled.div`
  @import url("https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css");
  @import url("https://fonts.googleapis.com/css?family=Martel:700|Mate:400|Merriweather:400,700|Anonymous+Pro:400");
  * {
    -webkit-font-smoothing: antialiased;
    box-sizing: border-box;
  }
  html,
  body {
    margin: 0px;
    height: 100%;
  }
  /* a blue color as a generic focus style */
  button:focus-visible {
    outline: 2px solid #4a90e2 !important;
    outline: -webkit-focus-ring-color auto 5px !important;
  }
  a {
    text-decoration: none;
  }

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
    transition: ease-in 0.3s;
  }
  .top_navigation a:hover {
    color: #fffef4;
    background-color: #ff6500;
    border-radius: 8px;
    padding: 5px;
  }
  .about-us {
    background-color: #fffef4;
    display: flex;
    flex-direction: row;
    justify-content: center;
    width: 100%;
  }

  .about-us .div {
    background-color: #fffef4;
    overflow: hidden;
    width: 1440px;
    height: 3348px;
    position: relative;
  }

  .about-us .text-wrapper {
    position: absolute;
    top: 133px;
    left: 501px;
    background: linear-gradient(
      180deg,
      rgb(250.75, 102.97, 19.85) 0%,
      rgb(240.04, 98.58, 19) 36%,
      rgb(149, 61, 12) 100%
    );
    -webkit-background-clip: text !important;
    background-clip: text;
    -webkit-text-fill-color: transparent;
    text-fill-color: transparent;
    font-family: "Martel", Helvetica;
    font-weight: 700;
    color: transparent;
    font-size: 100px;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .rectangle {
    position: absolute;
    width: 1440px;
    height: 163px;
    top: 2353px;
    left: -1509px;
  }

  .about-us .text-wrapper-2 {
    width: 321px;
    top: 311px;
    left: 560px;
    position: absolute;
    font-family: "Martel", Helvetica;
    font-weight: 700;
    color: #000000;
    font-size: 40px;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .text-wrapper-3 {
    width: 234px;
    top: 2243px;
    left: 603px;
    text-align: center;
    position: absolute;
    font-family: "Martel", Helvetica;
    font-weight: 700;
    color: #000000;
    font-size: 40px;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .p {
    position: absolute;
    width: 1264px;
    top: 381px;
    left: 88px;
    font-family: "Mate", Helvetica;
    font-weight: 400;
    color: #000000cc;
    font-size: 30px;
    text-align: justify;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .text-wrapper-4 {
    top: 548px;
    left: 596px;
    position: absolute;
    font-family: "Martel", Helvetica;
    font-weight: 700;
    color: #000000;
    font-size: 40px;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .text-wrapper-5 {
    position: absolute;
    width: 1271px;
    top: 624px;
    left: 88px;
    font-family: "Mate", Helvetica;
    font-weight: 400;
    color: #000000cc;
    font-size: 30px;
    text-align: justify;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .source-kaggle-https {
    position: absolute;
    width: 1271px;
    top: 861px;
    left: 85px;
    font-family: "Mate", Helvetica;
    font-weight: 400;
    color: #000000cc;
    font-size: 30px;
    text-align: justify;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .span {
    font-family: "Mate", Helvetica;
    font-weight: 400;
    color: #000000cc;
    font-size: 30px;
    letter-spacing: 0;
  }

  .about-us .text-wrapper-6 {
    text-decoration: underline;
  }

  .about-us .text-wrapper-7 {
    position: absolute;
    top: 794px;
    left: 552px;
    font-family: "Martel", Helvetica;
    font-weight: 700;
    color: #000000;
    font-size: 40px;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .group {
    position: absolute;
    width: 286px;
    height: 908px;
    top: 1240px;
    left: 49px;
  }

  .about-us .overlap-group {
    position: absolute;
    width: 269px;
    height: 733px;
    top: 175px;
    left: 0;
    border-radius: 40px;
  }

  .about-us .rectangle-2 {
    position: absolute;
    width: 269px;
    height: 733px;
    top: 0;
    left: 0;
    background-color: #d9d9d9;
    border-radius: 40px;
    opacity: 0.3;
  }

  .about-us .div-2 {
    position: absolute;
    width: 223px;
    top: 20px;
    left: 23px;
    font-family: "Merriweather", Helvetica;
    font-weight: 400;
    color: #000000;
    font-size: 15px;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .text-wrapper-8 {
    font-family: "Merriweather", Helvetica;
    font-weight: 400;
    color: #000000;
    font-size: 15px;
    letter-spacing: 0;
  }

  .about-us .text-wrapper-9 {
    font-weight: 300;
    font-style: italic;
    font-size: 13.5px;
  }

  .about-us .text-wrapper-10 {
    font-size: 13.5px;
  }

  .about-us .image {
    position: absolute;
    width: 109px;
    height: 138px;
    top: 0;
    left: 13px;
    object-fit: cover;
  }

  .about-us .text-wrapper-11 {
    position: absolute;
    width: 147px;
    top: 33px;
    left: 135px;
    font-family: "Merriweather", Helvetica;
    font-weight: 400;
    color: #000000;
    font-size: 13.5px;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .group-2 {
    position: absolute;
    width: 286px;
    height: 908px;
    top: 1240px;
    left: 394px;
  }

  .about-us .quotes-everything {
    position: absolute;
    width: 223px;
    top: 52px;
    left: 25px;
    font-family: "Merriweather", Helvetica;
    font-weight: 400;
    color: #000000;
    font-size: 15px;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .group-3 {
    position: absolute;
    width: 286px;
    height: 909px;
    top: 1239px;
    left: 757px;
  }

  .about-us .overlap {
    position: absolute;
    width: 269px;
    height: 734px;
    top: 175px;
    left: 0;
    border-radius: 40px;
  }

  .about-us .rectangle-3 {
    position: absolute;
    width: 269px;
    height: 734px;
    top: 0;
    left: 0;
    background-color: #d9d9d9;
    border-radius: 40px;
    opacity: 0.3;
  }

  .about-us .group-4 {
    position: absolute;
    width: 286px;
    height: 909px;
    top: 1239px;
    left: 1120px;
  }

  .about-us .line {
    position: absolute;
    width: 1440px;
    height: 3px;
    top: 2212px;
    left: 0;
    object-fit: cover;
  }

  .about-us .overlap-wrapper {
    position: absolute;
    width: 436px;
    height: 156px;
    top: 2331px;
    left: 87px;
  }

  .about-us .overlap-2 {
    position: relative;
    height: 156px;
  }

  .about-us .group-wrapper {
    position: absolute;
    width: 436px;
    height: 156px;
    top: 0;
    left: 0;
  }

  .about-us .overlap-group-wrapper {
    width: 438px;
    height: 156px;
  }

  .about-us .overlap-group-2 {
    position: relative;
    width: 436px;
    height: 156px;
    border-radius: 5px;
  }

  .about-us .text-wrapper-12 {
    position: absolute;
    top: 53px;
    left: 149px;
    font-family: "Anonymous Pro", Helvetica;
    font-weight: 400;
    color: #000000;
    font-size: 30px;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .rectangle-4 {
    position: absolute;
    width: 436px;
    height: 156px;
    top: 0;
    left: 0;
    border-radius: 5px;
    border: 1px solid;
    border-color: #de5c4a;
  }

  .about-us .img {
    width: 122px;
    height: 114px;
    top: 21px;
    left: 9px;
    position: absolute;
    object-fit: cover;
  }

  .about-us .div-wrapper {
    position: absolute;
    width: 436px;
    height: 156px;
    top: 2560px;
    left: 924px;
  }

  .about-us .image-2 {
    width: 122px;
    height: 113px;
    top: 21px;
    left: 8px;
    position: absolute;
    object-fit: cover;
  }

  .about-us .group-5 {
    height: 156px;
  }

  .about-us .group-6 {
    position: absolute;
    width: 436px;
    height: 156px;
    top: 2793px;
    left: 87px;
  }

  .about-us .overlap-3 {
    position: relative;
    width: 436px;
    height: 156px;
  }

  .about-us .group-7 {
    position: absolute;
    width: 436px;
    height: 160px;
    top: 2560px;
    left: 87px;
  }

  .about-us .overlap-4 {
    position: relative;
    height: 160px;
  }

  .about-us .image-3 {
    position: absolute;
    width: 122px;
    height: 114px;
    top: 46px;
    left: 9px;
    object-fit: cover;
  }

  .about-us .group-8 {
    position: absolute;
    width: 436px;
    height: 156px;
    top: 2331px;
    left: 924px;
  }

  .about-us .navbar-wrapper {
    position: absolute;
    width: 1448px;
    height: 54px;
    top: 55px;
    left: 0;
  }

  .about-us .navbar {
    position: relative;
    width: 1440px;
    height: 54px;
    background-image: url(./img/rectangle-1.png);
    background-size: 100% 100%;
  }

  .about-us .text-wrapper-13 {
    left: 74px;
    position: absolute;
    top: 7px;
    font-family: "Merriweather", Helvetica;
    font-weight: 400;
    color: #000000;
    font-size: 32px;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .text-wrapper-14 {
    position: absolute;
    top: 7px;
    left: 784px;
    font-family: "Merriweather", Helvetica;
    font-weight: 400;
    color: #000000;
    font-size: 32px;
    letter-spacing: 0;
    line-height: normal;
    opacity: 0;
    transform: scale(1.1);
  }

  .about-us .text-wrapper-15 {
    left: 440px;
    position: absolute;
    top: 7px;
    font-family: "Merriweather", Helvetica;
    font-weight: 400;
    color: #000000;
    font-size: 32px;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .text-wrapper-16 {
    left: 1193px;
    position: absolute;
    top: 7px;
    font-family: "Merriweather", Helvetica;
    font-weight: 400;
    color: #000000;
    font-size: 32px;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .pngwing {
    position: absolute;
    width: 227px;
    height: 227px;
    top: 2496px;
    left: 607px;
    object-fit: cover;
  }

  .about-us .group-9 {
    position: absolute;
    width: 1448px;
    height: 345px;
    top: 3003px;
    left: -16px;
  }

  .about-us .overlap-5 {
    position: relative;
    width: 1440px;
    height: 345px;
    background-color: #fff9d0;
  }

  .about-us .overlap-group-3 {
    position: absolute;
    width: 824px;
    height: 277px;
    top: 43px;
    left: 142px;
  }

  .about-us .logo {
    position: absolute;
    width: 269px;
    height: 250px;
    top: 27px;
    left: 442px;
    object-fit: cover;
  }

  .about-us .text-wrapper-17 {
    position: absolute;
    width: 444px;
    top: 0;
    left: 380px;
    font-family: "Merriweather", Helvetica;
    font-weight: 700;
    color: #000000;
    font-size: 24px;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .text-wrapper-18 {
    position: absolute;
    width: 444px;
    top: 60px;
    left: 0;
    font-family: "Merriweather", Helvetica;
    font-weight: 400;
    color: #000000;
    font-size: 16px;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .text-wrapper-19 {
    position: absolute;
    width: 444px;
    top: 155px;
    left: 5px;
    font-family: "Merriweather", Helvetica;
    font-weight: 400;
    color: #000000;
    font-size: 16px;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .text-wrapper-20 {
    position: absolute;
    width: 444px;
    top: 241px;
    left: 5px;
    font-family: "Merriweather", Helvetica;
    font-weight: 400;
    color: #000000;
    font-size: 16px;
    letter-spacing: 0;
    line-height: normal;
  }

  .about-us .icon-facebook {
    position: absolute;
    width: 35px;
    height: 54px;
    top: 84px;
    left: 86px;
  }

  .about-us .icon-instagram {
    position: absolute;
    width: 55px;
    height: 50px;
    top: 181px;
    left: 76px;
  }

  .about-us .icon-mail {
    position: absolute;
    width: 55px;
    height: 36px;
    top: 274px;
    left: 76px;
  }

  .about-us .image-4 {
    width: 251px;
    height: 233px;
    top: 67px;
    left: 1128px;
    position: absolute;
    object-fit: cover;
  }
`;

const AboutUs = () => {
  return (
    <Wrapper>
      <div class="about-us">
        <div class="div">
          <div class="text-wrapper">About us</div>
          <img class="rectangle" src="rectangle-2.png" />
          <div class="text-wrapper-2">Our Perspective</div>
          <div class="text-wrapper-3">Our Teams</div>
          <p class="p">
            In the face of climate change, understanding and analyzing
            temperature patterns across both land and oceanic regions is
            paramount. Therefore, we gathered information about temperature and
            population in many various countries then made this website for
            everyone can have an accessible website.
          </p>
          <div class="text-wrapper-4">Our Mission</div>
          <p class="text-wrapper-5">
            Our goal of this website not only help governments, scientists and
            the public analyze patterns of change in ocean and land temperatures
            over two and a half centuries but also for the public to become
            active participants in the fight against climate change.
          </p>
          <p class="source-kaggle-https">
            <span class="span">
              Source: Kaggle
              <br />
            </span>
            <a
              href="https://www.kaggle.com/datasets/berkeleyearth/climate-change-earth-surface-temperature-data"
              target="_blank"
              rel="noopener noreferrer"
            >
              <span class="text-wrapper-6">
                https://www.kaggle.com/datasets/berkeleyearth/climate-change-earth-surface-temperature-data
                <br />
              </span>
            </a>
            <span class="span">
              <br />
              Source: Raw data: Berkeley Earth data page <br />
            </span>
            <a
              href="http://berkeleyearth.org/data/"
              target="_blank"
              rel="noopener noreferrer"
            >
              <span class="text-wrapper-6">
                http://berkeleyearth.org/data/
                <br />
              </span>
            </a>
            <span class="span">
              <br />
              Source: World Development Indicators&nbsp;&nbsp;
              <br />
            </span>
            <a
              href="https://data.worldbank.org/indicator/SP.POP.TOTL"
              target="_blank"
              rel="noopener noreferrer"
            >
              <span class="text-wrapper-6">
                https://data.worldbank.org/indicator/SP.POP.TOTL{" "}
              </span>
            </a>
          </p>
          <div class="text-wrapper-7">Support Sources</div>
          <div class="group">
            <div class="overlap-group">
              <div class="rectangle-2"></div>
              <p class="div-2">
                <span class="text-wrapper-8">
                  Quotes:
                  <br />
                </span>
                <span class="text-wrapper-9">
                  &#34;Contributing to reducing the climate change in the world
                  is my work&#34;
                  <br />
                </span>
                <span class="text-wrapper-10">
                  <br />
                </span>
                <span class="text-wrapper-8">
                  Background:
                  <br />
                </span>
                <span class="text-wrapper-10">
                  A scientist works for a company in climate field.
                  <br />
                  Passionate about the natural phenomenon and nature and science
                  when he was a child.
                  <br />
                  <br />
                </span>
                <span class="text-wrapper-8">
                  Needs:
                  <br />
                </span>
                <span class="text-wrapper-10">
                  A&nbsp;&nbsp;tool or website that help him figure out reliable
                  numerical and statistical information about the changing
                  climate and as well as the population in the world.
                  <br />
                  <br />
                </span>
                <span class="text-wrapper-8">
                  Goals:
                  <br />
                </span>
                <span class="text-wrapper-10">
                  Accessing and gathering information about temperature and
                  population information of various countries.
                  <br />
                  Rely on the information to make a consideration of the
                  temperature changing in the world.
                  <br />
                  <br />
                </span>
                <span class="text-wrapper-8">
                  Experience skills:
                  <br />
                </span>
                <span class="text-wrapper-10">
                  In-dept knowledge of climate change.
                  <br />
                  Working with computer and numerical documents everyday.
                  <br />
                </span>
              </p>
            </div>
            <img class="image" src="img/Peter.png" />
            <p class="text-wrapper-11">
              Name: Peter
              <br />
              Age: 45
              <br />
              Location: Australia, Melbourne
            </p>
          </div>
          <div class="group-2">
            <div class="overlap-group">
              <div class="rectangle-2"></div>
              <p class="quotes-everything">
                <span class="text-wrapper-8">
                  Quotes:
                  <br />
                </span>
                <span class="text-wrapper-9">
                  &#34;Everything lives matter&#34;
                  <br />
                </span>
                <span class="text-wrapper-10">
                  <br />
                </span>
                <span class="text-wrapper-8">
                  Background:
                  <br />
                </span>
                <span class="text-wrapper-10">
                  A high school student.
                  <br />
                  Has participated in protecting environment activities for the
                  past 3 years.
                  <br />
                  <br />
                </span>
                <span class="text-wrapper-8">
                  Needs:
                  <br />
                </span>
                <span class="text-wrapper-10">
                  A web application that allows her to analyze patterns of
                  change in temperatures and population statistics.
                  <br />A platform that can provide all necessary information
                  from shallow to deep.
                  <br />
                  <br />
                </span>
                <span class="text-wrapper-8">
                  Goals:
                  <br />
                </span>
                <span class="text-wrapper-10">
                  Deepen understanding and spur action on climate change.
                  <br />
                  Seeking for opportunities to join with organizations or
                  communities that like-minded in the fight against climate
                  change
                  <br />
                  <br />
                </span>
                <span class="text-wrapper-8">
                  Experience skills:
                  <br />
                </span>
                <span class="text-wrapper-10">
                  Effective communication through different ways of expression.
                  <br />
                  Works well in teams and demonstrates leadership potential
                  <br />
                </span>
              </p>
            </div>
            <img class="image" src="img/Elise.png" />
            <p class="text-wrapper-11">
              Name: Elise
              <br />
              Age: 17
              <br />
              Location: London, United Kingdom
            </p>
          </div>
          <div class="group-3">
            <div class="overlap">
              <div class="rectangle-3"></div>
              <p class="div-2">
                <span class="text-wrapper-8">
                  Quotes:
                  <br />
                </span>
                <span class="text-wrapper-9">
                  &#34;The Earth is our second home&#34;
                  <br />
                </span>
                <span class="text-wrapper-10">
                  <br />
                </span>
                <span class="text-wrapper-8">
                  Background:
                  <br />
                </span>
                <span class="text-wrapper-10">
                  Studied Environmental Science at Columbia University
                  <br />
                  Has a strong passion for learning about the relationship
                  between humans and nature
                  <br />
                  <br />
                </span>
                <span class="text-wrapper-8">
                  Needs:
                  <br />
                </span>
                <span class="text-wrapper-10">
                  Seeks a reliable source of information and a supportive
                  community of like-minded individuals who share his passion for
                  environmental stewardship
                  <br />
                  <br />
                </span>
                <span class="text-wrapper-8">
                  Goals:
                  <br />
                </span>
                <span class="text-wrapper-10">
                  Staying informed about the latest developments in
                  environmental research, policy, and activism
                  <br />
                  Deepen his understanding of climate science, explore
                  innovative solutions to environmental challenges
                  <br />
                  <br />
                </span>
                <span class="text-wrapper-8">
                  Experience skills:
                  <br />
                </span>
                <span class="text-wrapper-10">
                  Strong communication skills and a knack for persuasive
                  argumentation
                  <br />
                  Comfortable navigating online platforms and digital tools to
                  access information
                  <br />
                </span>
              </p>
            </div>
            <img class="image" src="img/Aiden.png" />
            <p class="text-wrapper-11">
              Name: Aiden
              <br />
              Age: 39
              <br />
              Location: New York, United States
            </p>
          </div>
          <div class="group-4">
            <div class="overlap">
              <div class="rectangle-3"></div>
              <p class="div-2">
                <span class="text-wrapper-8">
                  Quotes:
                  <br />
                </span>
                <span class="text-wrapper-9">
                  &#34;I&#39;m looking for a tool that can help me explore
                  climate change data in a simple and understandable way.&#34;
                  <br />
                </span>
                <span class="text-wrapper-10">
                  <br />
                </span>
                <span class="text-wrapper-8">
                  Background:
                  <br />
                </span>
                <span class="text-wrapper-10">
                  High school geography teacher.
                  <br />
                  She has a bachelor&#39;s degree in Geography and Education.
                  <br />
                  She is passionate about environmental issues.
                  <br />
                  <br />
                </span>
                <span class="text-wrapper-8">
                  Needs:
                  <br />
                </span>
                <span class="text-wrapper-10">
                  The ability to choose a statistic based on maximum, minimum
                  and average information and view the change in temperature
                  between the compared years for all cities or states.
                  <br />
                  <br />
                </span>
                <span class="text-wrapper-8">
                  Goals:
                  <br />
                </span>
                <span class="text-wrapper-10">
                  Understand the patterns of change in ocean and land
                  temperatures over a hundred years.
                  <br />
                  Identify trends across various time scales and geographic
                  locations.
                  <br />
                  <br />
                </span>
                <span class="text-wrapper-8">
                  Experience skills:
                  <br />
                </span>
                <span class="text-wrapper-10">
                  Comfortable using technology and often uses various software
                  and web applications for her work.
                  <br />
                  Has basic knowledge of data analysis.
                  <br />
                </span>
              </p>
            </div>
            <img class="image" src="img/Olivia.png" />
            <div class="text-wrapper-11">
              Name: Olivia
              <br />
              Age: 28
              <br />
              Location: France
            </div>
          </div>
          <img class="line" src="img/Line.png" />
          <div class="overlap-wrapper">
            <div class="overlap-2">
              <div class="group-wrapper">
                <div class="overlap-group-wrapper">
                  <div class="overlap-group-2">
                    <div class="text-wrapper-12">
                      Nguyen Tan Thang
                      <br />
                      S3986344
                    </div>
                    <div class="rectangle-4"></div>
                    <div class="rectangle-4"></div>
                  </div>
                </div>
              </div>
              <img class="img" src="img/Male.png" />
            </div>
          </div>
          <div class="div-wrapper">
            <div class="overlap-2">
              <img class="image-2" src="img/Female.png" />
              <div class="group-wrapper">
                <div class="group-5">
                  <div class="overlap-group-wrapper">
                    <div class="overlap-group-2">
                      <div class="text-wrapper-12">
                        Nguyen Ky Anh
                        <br />
                        S4103353
                      </div>
                      <div class="rectangle-4"></div>
                      <div class="rectangle-4"></div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="group-6">
            <div class="group-5">
              <div class="overlap-3">
                <div class="group-wrapper">
                  <div class="overlap-group-wrapper">
                    <div class="overlap-group-2">
                      <div class="text-wrapper-12">
                        Do Thanh Tin
                        <br />
                        S3970879
                      </div>
                      <div class="rectangle-4"></div>
                    </div>
                  </div>
                </div>
                <img class="img" src="img/Male.png" />
              </div>
            </div>
          </div>
          <div class="group-7">
            <div class="overlap-4">
              <div class="group-wrapper">
                <div class="overlap-group-wrapper">
                  <div class="overlap-group-2">
                    <div class="text-wrapper-12">
                      Nguyen Thanh Nhan
                      <br />
                      S4073629
                    </div>
                    <div class="rectangle-4"></div>
                  </div>
                </div>
              </div>
              <img class="image-3" src="img/Male.png" />
            </div>
          </div>
          <div class="group-8">
            <div class="overlap-2">
              <div class="group-wrapper">
                <div class="overlap-group-wrapper">
                  <div class="overlap-group-2">
                    <div class="text-wrapper-12">
                      Bui Viet Anh
                      <br />
                      S3988393
                    </div>
                    <div class="rectangle-4"></div>
                  </div>
                </div>
              </div>
              <img class="img" src="img/Male.png" />
            </div>
          </div>
          <img class="pngwing" src="img/RMIT logo.png" />
        </div>
      </div>
    </Wrapper>
  );
};

export default AboutUs;
