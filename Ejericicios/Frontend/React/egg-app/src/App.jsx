import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";

function App() {
  const [count, setCount] = useState(0);
  let contador2 = 0;

  function sumarCount() {
    setCount(count + 1);
  }

  function sumarContador2() {
    console.log(contador2);
    contador2++;
  }
  return (
    <div>
      <p>{count}</p>
      <button onClick={sumarCount}>Sumar count</button>
      <p>{contador2}</p>
      <button onClick={sumarContador2}>Sumar contador2</button>
    </div>
  );
}

export default App;
