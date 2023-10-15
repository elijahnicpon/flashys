import React, { useState, useEffect } from 'react';
import "./Artists.css";

export default function Artists() {
    const [artists_w_portfolio, setArtists] = useState([]);

  useEffect(() => {
    // Fetch data from your API (e.g., localhost:8080/artists/all-with-preview)
    fetch('http://localhost:8080/artists/all-with-preview')
      .then((response) => response.json())
      .then((data) => {
        setArtists(data);
        // console.log('Fetched data:', data);
      })
      .catch((error) => console.error('Error fetching data:', error));
  }, []);

  // Check if 'artists' has been properly set
  if (artists_w_portfolio.length === 0) {
    return <div>Loading...</div>; // Or you can render a loading indicator
  } else {
    console.log(artists_w_portfolio)
    return (


<div className="artist-list">
  {artists_w_portfolio.map((artist) => (
    <div key={artist.artistId} className="artist-card">
      <div className="profile-container">
        <img
          className="profile-pic"
          src={`data:image/png;base64,${artist.artist.profilePic}`}
          alt={artist.artist.displayName}
        />
        {/* <div className="info-container"> */}
            <p className="display-name">{artist.artist.displayName}</p>
            <p className="pronouns">{artist.artist.pronouns}</p>
        {/* </div> */}
      </div>
      <div className="portfolio-images">
        {artist.recentPortfolioEntries.slice(0, 4).map((entry, index) => (
          <img
            key={index}
            src={`data:image/png;base64,${entry.img}`}
            alt={`Portfolio Entry ${index}`}
          />
        ))}
      </div>
    </div>
  ))}
</div>





    //     <div>
    //     {artists_w_portfolio.map((artist) => (
    //       <div key={artist.artistId} className="artist-card">
    //         <img src={`data:image/png;base64,${artist.artist.profilePic}`} alt={artist.artist.displayName} />
    //         <div>
    //           <p>IGN:{artist.artist.displayName}</p>
    //           <p>{artist.artist.pronouns}</p>
    //         </div>
    //         <div className="portfolio-images">
    //           {artist.recentPortfolioEntries.slice(0, 4).map((entry, index) => (
    //             <img
    //               key={index}
    //               src={`data:image/png;base64,${entry.img}`}
    //               alt={`Portfolio Entry ${index}`}
    //             />
    //           ))}
    //         </div>
    //       </div>
    //     ))}
    //   </div>



    //     <div>
    //     <hr/>
    //     <hr/>
    //     <h1>{artists_w_portfolio[0].artist.bio}</h1>
    //     <hr/>
    //     <hr/>
    //     <hr/>
    //   {/* {artists_w_portfolio.map((artist_w_portfolio) => (
    //       <ArtistCard key={artist_w_portfolio.artist_id} artist={artist_w_portfolio} />
    //     ))} */}

    //     {/* {artists_w_portfolio.map((artist_w_portfolio) => (
    //             <ArtistCard key={artist_w_portfolio.artist.artist_id} objec={artist_w_portfolio} />
    //             ))} */}
    // </div>
  );
}
}