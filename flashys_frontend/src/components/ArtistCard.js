import React from 'react';
import { Link } from 'react-router-dom';

const ArtistCard = ({ artist }) => {
  return (
    <Link to={`/artist/${artist.artist_id}`}>
      <div className="artist-card">
        <img src={`data:image/png;base64,${artist.profilePic}`} alt={artist.displayName} />
        <div>
          <p>{artist.displayName}</p>
          <p>{artist.pronouns}</p>
        </div>
        <div className="portfolio-images">
          {artist.portfolioEntries.map((entry, index) => (
            <img
              key={index}
              src={`data:image/png;base64,${entry.img}`}
              alt={`Portfolio Entry ${index}`}
            />
          ))}
        </div>
      </div>
    </Link>
  );
};

export default ArtistCard;