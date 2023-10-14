import React from 'react'

import './Footer.css'

import appointments from './imgs/go_appointments.svg'
import settings from './imgs/go_user_settings.svg'
import messages from './imgs/go_messages.svg'
import home from './imgs/go_home.svg'

const Footer = () => {
  return (
    <footer className="footer">
      <div className="imgs">
        <img 
            src={home}
            alt="home"
        />
        <img
            src={messages}
            alt="messages"
        />
        <img
            src={appointments}
            alt="appointments"
        />
        <img
            src={settings}
            alt="user settings"
        />
      </div>
    </footer>
  )
}

export default Footer