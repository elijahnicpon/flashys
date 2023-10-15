import React from 'react'
import Footer from './Footer'
import Navbar from './Navbar'
import Flashes from './pages/Flashes'
import Artists from './pages/Artists'
import { Route, Routes } from 'react-router-dom'


import './App.css';


const App = () => {
  return (
    <div className="app">
      <Navbar />
      
      <div className="container">
        <Routes>
          <Route path="/" element={<Flashes />} />
          <Route path="/flashes" element={<Flashes />} />
          <Route path="/artists" element={<Artists />} />
        </Routes>
      </div>
      <Footer />
    </div>
  );
}

export default App;
