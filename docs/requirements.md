#Requirements

##Functional Requirements
- user able to maintain a persistent catalogue of plants 
    - for each plant, the following should be tracked:
        - species
        - light, water, soil, humidity, temp, and fertilizer requirements
        - hardiness level  
        - purchase date
        - location
        - repotting history
        - pictures
        - sensitivities
        - issues (current and historic)
        - snapshots
    
- user is able to maintain a persistent catalogue of equipment
    - types of equipment include pots, lights, consumables (soils, fertilizer, supports, chemicals)
    - for each piece of equipment, the following should be tracked: 
        - type (consumable or permanent)
        - purchase date
        - location
        - price
        - condition (functional, needs repair, etc)
    
- user is able to schedule a variety of tasks related to plant care
    - plant watering
    - plant repotting
    - equipment maintenance
    
##Interface Requirements
- user is able to view the details of multiple plants at the same time (a detailed view of the plant is opened in a new window)
- user is able to search and filter the plants/equipment list
    - filters: species, watering schedule, repotting schedule, purchase date, issue, etc
- user is able to add new species, locations, issues, soil types, etc
   
##Technical Requirements 
- user is able to easily move database file to new computer and access database using different installation of program
- database is embedded into application rather than a server that requires separate installation and maintenance 
- application is cross platform (Windows and Linux)

