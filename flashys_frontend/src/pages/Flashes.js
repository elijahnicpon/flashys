import React, { useState, useEffect } from 'react';
import { Link, useMatch, useResolvedPath } from 'react-router-dom'
import './Flashes.css'; // Import the CSS file

function Flashes() {
    const [flashes, setFlashes] = useState([]);
    const [selectedFlash, setSelectedFlash] = useState(null);
  
    useEffect(() => {
      // Fetch data from the API when the component mounts
      fetch('http://localhost:8080/flash/all')
        .then((response) => response.json())
        .then((data) => setFlashes(data))
        .catch((error) => console.error('Error fetching data:', error));
    }, []); // The empty dependency array ensures this effect runs once after the initial render
  
    const openModal = (flash) => setSelectedFlash(flash);
    const closeModal = () => setSelectedFlash(null);
  
    return (
      <div>
        <h1 className="logo">Flashys</h1>
        <div className="flash-grid">
          {flashes.map((flash) => (
            <div key={flash.flashId} onClick={() => openModal(flash)}>
              <Link to={`/flashes/:${flash.flashId}`}>
              <img className="imgs" src={`data:image/png;base64,${flash.img}`} alt={flash.title} />
              </Link>
            </div>
          ))}
        </div>
  
        {selectedFlash && (
          <div className="modal">
            <div className="modal-content">
              <img src={`data:image/png;base64,${selectedFlash.img}`} alt={selectedFlash.title} />
              <h2>{selectedFlash.title}</h2>
              {/* Add more metadata here */}
              <button onClick={closeModal}>Close</button>
            </div>
          </div>
        )}
      </div>
    );
  }

  function CustomLink({ to, children, ...props}) {
    const resolvedPath = useResolvedPath(to)
    //take out end: true if we want stuff like /flashes/flashes_popup potentially?
    const isActive = useMatch({ path: resolvedPath.pathname, end: true })
    return (
        <li className={resolvedPath === to ? "active" : ""}>
            <Link to={to} {...props}>
                {children}
            </Link>
        </li>
    )
}
  
  export default Flashes;