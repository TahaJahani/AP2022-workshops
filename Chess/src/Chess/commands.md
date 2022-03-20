# Commands
## Main Menu Commands
#### register [username] [password]
should check for username existence, and register user if username is unique

#### login [username] [password]
logs the current user in the game

if username or password is invalid, shows proper error 

#### start game [opponent username]
start a new game with the selected opponent.

if opponent does not exist, shows an error message.

#### list (-a)
lists top three users among all users.

if flag -a is provided, then shows all users with their scores

## Game Menu Commands
#### select [x],[y]
selects the piece located in the given x,y coordination

if there's no piece, or the piece belongs to the opponent, then an error message should be shown

#### move [x],[y]
moves the selected piece to the given coordination. if no piece is selected, or the move cannot be done, 
prints an error message

#### print
prints the board.
____________________

hint: you can use these icons for printing:

| Piece Name         | Piece Icon |
|--------------------|------------|
| white chess king   | ♔          |
| white chess queen  | ♕          |
| white chess rook   | ♖          |
| white chess bishop | ♗          |
| white chess knight | ♘          |
| white chess pawn   | ♙          |
| black chess king   | ♚          |
| black chess queen  | ♛          |
| black chess rook   | ♜          |
| black chess bishop | ♝          |
| black chess knight | ♞          |
| black chess pawn   | ♟          |