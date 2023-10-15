import React from 'react'
import Navbar from './Navbar'
import Flashes from './pages/Flashes'
import Artists from './pages/Artists'
import FlashPage from './pages/FlashPage'
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
          <Route path="/flashes/:flashId" element={<FlashPage />} />
          <Route path="/artists" element={<Artists />} />
        </Routes>
      </div>
    </div>
  );
}

export default App;
