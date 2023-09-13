import { BrowserRouter, Route, Routes } from "react-router-dom";
import "./App.css";
import Footer from "./components/Footer";
import Header from "./components/Header";
import Productos from "./components/Productos";

function App() {
  return (
    <BrowserRouter>
      <Header />
      <Routes>
        <Route path="/" element={<Productos/>} />
      </Routes>
      <Footer />
    </BrowserRouter>
  );
}

export default App;
