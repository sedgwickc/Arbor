#Schema Design

##Objects
1. plant
    1. id (pk)
    2. species (fk)
    3. date acquired
    4. status (healthy, sick, dead, dormant, flowering, growth)
    5. location (fk)
    6. parent (fk)
    7. water needs 
      - inherited from species but configurable for each plant based on location 
    8. soil type (fk)
    9. light_source (fk)
    10. container (fk)

2. issue
    1. id (pk)
    2. date created
    3. type (fk)
    4. comments
    5. symptom (fk)
    6. solution
    
3. snapshot
    1. id (pk)
    2. date
    3. picture
    4. height
    5. temperature
    6. humidity
    7. season (hardcoded)
    
4. light_source
    1. id (pk)
    2. type (artificial/natural)
    3. date purchased/ first used
    4. condition
    5. picture
    6. lumens
    7. technology (LED, florescent, HID, etc)   
    9. spectrum   
    
5. species
    1. name (pk)
    2. genus (pk)
    3. common_name(ck)   
    4. water needs
    5. light needs
    6. soil needs
    7. picture
    
6. Soil
    1. drainage
    2. description
    3. name (pk)
7. FerilizerApplication 
8. container 
    1. type (soil, hydro)
    2. material ( plastic, ceramic)(use ENUM sql type)
    3. volume
    4. height
    5. width
    6. drainage (yes/no)
    7. status (empty, in use, damaged, retired)
    8. description
    9. picture
    10. location (fk)
    11. id (pk)
    
9. supports
    1. material
    2. status
    3. height
    4. width
    5. picture
    6. id (pk)
10. water_delivery (e.g. pumps, hydroponics systems)
   
11. locations (dining room window, living room window, etc.)
   1. type: indoors or outdoors?
   2. light: typical amount of light?
   3. temp: typical temp?
   4. humiditiy: typical humidity?
      
12. issues types
   - disease
   - pest
   - under watering 
   - over watering
   - too little light
   - too much light (burning)
13. issues symptoms
   - leaf damage
   - leggy
   - spots
   - root rot
   - leaf drop
   - leaf yellowing


##Relationships
- A plant has many
    - issues
    - snapshots
    - repotting dates
    - related equipment (pot, trellis, lighting)
    - previous locations
    - previous soil types
    - fertilizer applications
  
- a plant has one
    - purchase date
    - species
    - parent 
    - current locations
    - current soil
    - pot
    - support
    - current lighting
    
- a water_delivery has many plants
- a light_source has many plants
- a pot has many plants
- a species has many plants
- a support has one plant
      
  

