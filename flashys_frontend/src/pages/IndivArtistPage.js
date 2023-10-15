import React from 'react';
import { useParams } from 'react-router-dom';

const IndivArtistPage = () => {
  const { artistId } = useParams();

  return <div>Artist ID: {artistId}</div>;
};

export default IndivArtistPage;