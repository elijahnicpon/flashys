import React from 'react'
import Navbar from './Navbar'
import Flashes from './pages/Flashes'
import Artists from './pages/Artists'
import { Route, Routes } from 'react-router-dom'
import Flash_Popup from './components/Flash_Popup'

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
          <Route path="/flashpopups" element={<Flash_Popup />} />
        </Routes>
      </div>
    </div>
  );
}

export default App;
