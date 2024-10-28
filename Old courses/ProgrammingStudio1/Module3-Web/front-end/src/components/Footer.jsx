import React from "react";

import GlobalLogo from "../img/Global logo.png";
import iconfacebook from "../img/icon-facebook.png";
import iconinstagram from "../img/icon-instagram.png";
import iconmail from "../img/icon-mail.png";
import RMITmap from "../img/RMIT map.png";
import styled from "styled-components";

const Wrapper = styled.div`
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
    width: 260px;
    height: 229px;
    top: 55px;
    left: 75%;
    object-fit: cover;
  }
`;

const Footer = () => {
  return (
    <Wrapper>
      <div className="overlap-3">
        <img className="logo-2" src={GlobalLogo} alt="" />
        <div className="text-wrapper-1">CHRONIC TEMPERATURE MACHINE</div>
        <div className="text-wrapper-2">CHRONIC TEMPERATURE MACHINE</div>
        <div className="text-wrapper-3">chronic.temp.machine</div>
        <div className="text-wrapper-4">climate.change@rmit.edu.vn</div>
        <img className="icon-facebook" src={iconfacebook} alt="iconfacebook" />
        <img className="icon-instagram" src={iconinstagram} alt="iconinstagram" />
        <img className="icon-mail" src={iconmail} alt="iconmail" />
        <iframe
          className="image-1"
          title="RMIT map"
          src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d31357.798215982315!2d106.67477797869788!3d10.755681821068933!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31752fbea5fe3db1%3A0xfae94aca5709003f!2zxJDhuqFpIGjhu41jIFJNSVQgVmnhu4d0IE5hbSAtIEPGoSBz4bufIE5hbSBTw6BpIEfDsm4!5e0!3m2!1sen!2s!4v1716630664838!5m2!1sen!2s"
          style={{ border: 0 }}
          allowFullScreen=""
          loading="lazy"
          referrerPolicy="no-referrer-when-downgrade"
        ></iframe>
      </div>
    </Wrapper>
  );
};

export default Footer;
