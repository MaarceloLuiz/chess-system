# Chess System

## About 
This project was made in order to improve my OOP studying, so important concepts were used, such as:
- Inheritance
- Encapsulation
- Abstraction
- Polymorphism
- Composition
- Exception Handling

among others that were not listed.

## How to Play

```bash
# clone repository
git clone https://github.com/MaarceloLuiz/chess-system.git

# enter the bin folder
cd bin

# execute the project
java application/Program

#The expected result should be as shown in the image below: 
```
![chessgamescreenshot](https://github.com/MaarceloLuiz/chess-system/assets/117950222/2e2c45d7-828b-4110-934f-ec1e3e6cbae1)

## Important Notes
- Pieces:

| Pawn | Rook |  Knight | Bishop  |  Queen | King |
|---|---|---|---|---|---|
| **P** | **R** | **N** | **B** | **Q** | **K** |

- The game is based in **lines**(_1, 2, 3, 4, 5, 6, 7, 8_) and **columns**(_a, b, c, d, e, f, g, h_)
- To **choose** and **move** a piece: _First_ the **column** should be picked, and then (with no spaces) a **line** must be chosen. Example: **c2**
- **Captured pieces**: Where all the captured pieces are displayed.
- **Turn**: Displays the turn (round) the game is in.
- **Waiting player**: Displays which player is going to play next.
- **Source**: The chosen piece.
- **Target**: The destiny which the piece is going to be moved.
- **Check** and **CheckMate** systems are included.
- **Special Moves** Available:
  - Castling(Rook)
  - En Passant
  - Promotion
  
## Author
Marcelo Luiz Guimarães Pereira

https://www.linkedin.com/in/marcelo-luiz-guimar%C3%A3es-pereira-613933269/
