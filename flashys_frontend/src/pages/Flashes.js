import React, { useState, useEffect } from 'react';

export default function Flashes() {
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
      {/* <h1>Flashes</h1> */}
      <div className="flash-grid">
        {flashes.map((flash) => (
          <div key={flash.id} onClick={() => openModal(flash)}>
            <img src={`data:image/png;base64,${flash.img}`} alt={flash.title} />
            <h2>{flash.title}</h2>
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

