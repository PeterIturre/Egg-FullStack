import React from "react";
import { Link } from "react-router-dom";
import LogoImg from "../img/home.png";

export default function Header() {
  return (
    <header className="header">
      <Link className="icon" to={"/"}>
        <img src={LogoImg} alt="LogoImg" />
      </Link>
      <nav className="navBar">
        <Link to={"/"}>Productos</Link>
        <Link to={"/"}>Favoritos</Link>
      </nav>
    </header>
  );
}
