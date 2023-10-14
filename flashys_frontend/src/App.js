import React from 'react'
import Header from './Header'
import Footer from './Footer'

import './App.css';


const App = () => {

  return (
    <div className="app">
      <Header />
      <div className='footer'>
       <Footer />
      </div>
    </div>
  );
}

export default App;
