import React, { useState } from "react";
import { Link } from "react-router-dom";
import FavImg from "../img/heart.png";
import NoFavImg from "../img/shop.png";

export default function Producto({
  producto,
  agregarAFavoritos,
  eliminarDeFavoritos,
}) {
  const [favorito, setFavorito] = useState(false);

  function handleClick() {
    if (favorito) {
      eliminarDeFavoritos(producto);
      setFavorito(false);
    } else {
      agregarAFavoritos(producto);
      setFavorito(true);
    }
  }

  return (
    <div className="producto">
      <Link to={`/producto/${producto.id}`}>
        <img src={producto.image} alt="imagenDelProducto" />
      </Link>
      <div className="info">
        <p>{producto.title}</p>
        <mark>${producto.price}</mark>
      </div>

      {favorito ? (
        <img
          className="fav-icon"
          onClick={handleClick}
          src={FavImg}
          alt="FavImg"
        />
      ) : (
        <img
          className="no-fav-icon"
          onClick={handleClick}
          src={NoFavImg}
          alt="NoFavImg"
        />
      )}
    </div>
  );
}
