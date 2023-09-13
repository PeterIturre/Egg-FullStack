import React from "react";
import { Link } from "react-router-dom";
import FavImg from "../img/heart.png";

export default function Producto({ producto }) {
  return (
    <div className="producto">
      <Link to={"/"}>
        <img src={producto.image} alt="imagenDelProducto" />
      </Link>
      <div className="info">
        <p>{producto.title}</p>
        <mark>${producto.price}</mark>
      </div>

      <img className="fav-icon" src={FavImg} alt="FavImg" />
    </div>
  );
}
