import React, { useState, useEffect } from 'react'
import './Flash_Popup.css';

const [flashPopup, setFlashPopup] = useState([0]);
const [flashes, setFlashes] = useState([]);
const [artists, setArtists] = useState([0]);

useEffect(() => {
  fetch('http://localhost:8080/flash/all')
        .then((response) => response.json())
        .then((data) => setFlashes(data))
        .catch((error) => console.error('Error fetching data:', error));
}, []);

useEffect(() => {
  fetch('http://localhost:8080/artist/all')
      .then((response) => response.json())
      .then((data) => setArtist(data))
      .catch((error) => console.error('Error fetching artist', error))
})

const closeModal = () => setFlashPopup(null);

console.log(artists);

const Flash_Popup = () => {
  return (
    <>
      <h1>Artist: </h1>
      <div className="flash-grid">
        {flashes.map((flash) => (
          <div key={flash.id} onClick={() => openModal(flash)}>
            <img src={`data:image/png;base64,${flash.img}`} alt={flash.title} />
            <h2>{flash.title}</h2>
          </div>
        ))}
      </div>
    </>
  )
}

export default Flash_Popup