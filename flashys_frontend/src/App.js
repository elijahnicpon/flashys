import React from 'react'
import Footer from './Footer'
import Navbar from './Navbar'
import Flashes from './pages/Flashes'
import Artists from './pages/Artists'


import './App.css';


const App = () => {
  let component
  switch (window.location.pathname) {
    case "/":
      component = <Flashes />
      break
    case "/flashes":
      component = <Flashes />
      break
    case "/artists":
      component = <Artists />
      break
  }
  return (
    <div className="app">
      <Navbar />
      
      <div className="container">
        {component}
      </div>
      <Footer />
    </div>
  );
}

export default App;
