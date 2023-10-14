import React from 'react'

import './Header.css'

const Header = () => {
  return (
    <header className="header">
         <div className="nav">
            <p><a href="/">Flashys</a></p>
            <p><a href="/about">Artists</a></p>
        </div>
    </header>
  )
}

export default Header