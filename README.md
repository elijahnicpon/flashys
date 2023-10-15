# flashys
## Inspiration
Elijah recently tried to schedule a tattoo appointment and ran into lots of difficulties. Originally, they wanted to reserve a 'Flash' tattoo, a first-come-first-serve design posted by a local artist. After searching the artist's profile for a reservation link buried deep in a linktree, the artist responded a week later that it had already been claimed. Heartbroken, Elijah reached out to the artist about commissioning a custom tattoo, and after 2 weeks of slow back-and-forth calendar sharing, and payment issues, finally set an appointment. 

Elijah had other friends experience similar issues with scheduling appointments or reserving flash tattoos and believes it would be possible to streamline the process under one platform to help artists find customers and build an evolving portfolio online. 
## What it does
Flashys connects tattoo artists with potential customers, and allows them to showcase their skills in two ways:
1. Flash designs, first-come-first-serve designs that can be 'tried on' with an AR feature and can be reserved via Flashy's simple reservation system.
2. Past pieces, in an easy-to-update portfolio.
Flashys also handles (or plans to handle in future iterations) payment, scheduling, messaging, and more, for a streamlined tattoo experience. 
## How we built it
We built Flashys with a Spring Boot backend that connects to a MongoDB database. The client is built with React and the AR component was built in Unity.
## Challenges we ran into
Our original plan to connect the Unity-built AR component with WebGL was thwarted when camera access was not available, causing us to pivot and explore other ways of presenting our product.
## Accomplishments that we're proud of
React, Spring, and MongoDB were entirely new to 75% of members and we were able to build the foundation of a great app in just 36 hours with an impressive AR component as well.
## What we learned
This was also 75% of the members' first hackathon, and we all thought we were medium-commitment until we got addicted to the project and development process. Overall, we're really proud of our progress and look forward to competing more in the future and continuing to develop our application.
## What's next for Flashys
Continuing development and looking towards migrating to a new multi-modal database to take advantage of graph connections for increased speed and connectivity. Migrating to React Native or Flutter for a more streamlined mobile and web experience as well.

## Whiteboarding!
### User Story
<img width="580" alt="image" src="https://github.com/elijahnicpon/flashys/assets/128508179/eea76c41-fcfb-4e73-bbc4-0aff515baf0c">
### Domain Model
<img width="529" alt="image" src="https://github.com/elijahnicpon/flashys/assets/128508179/0b52af2d-d86f-4dc0-947d-d213e3905888">
### Wireframe
<img width="577" alt="image" src="https://github.com/elijahnicpon/flashys/assets/128508179/9d6ee250-3fb4-4f68-9b41-e34ad4ec81de">
### User Story and AR Flow
<img width="570" alt="image" src="https://github.com/elijahnicpon/flashys/assets/128508179/f6dd324d-12ae-46db-bcf2-0c8b6fa2ad3c">
### Scheduling Model
<img width="573" alt="image" src="https://github.com/elijahnicpon/flashys/assets/128508179/59b65c72-8a83-4d01-99fa-13416a79cdca">
### Frontend Tasking
<img width="561" alt="image" src="https://github.com/elijahnicpon/flashys/assets/128508179/83e5e3b5-7973-44ce-beb8-6ea71ef057fe">
### Query Mapping
<img width="567" alt="image" src="https://github.com/elijahnicpon/flashys/assets/128508179/0a4fa155-46e9-439d-a50a-69030e51bd32">
