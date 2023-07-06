# Flyweight

- avoid redundancy when storing data
- a space optimization technique storing externally the data associated with similar objects
- example: storing names of users
  - don't directly store the full name in the user database
  - keep first and last name individual
  - store each in a dictionary (after checking that they don't already exist)
  - save only their indices in the user database
- example: text formatting editor
  - don't store formatting information for each individual character
  - store range infos (start, end), together with formatting flags for that range
