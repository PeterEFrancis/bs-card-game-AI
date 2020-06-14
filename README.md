# bs-card-game-AI

This repository holds the software for development of an AI player for the card game "BS".

### Rules:
- 4 players
- standard 52 deck of cards


At the beginning of a game, the 4 players are dealt 13 cards each. The first player with 0 cards wins. Player turns rotate, starting with the player who is dealt the ace of spades. Each turn the turn rank increases by 1, eventually wrapping back to A. The first player only discards the ace of spades. Each following turn the playing player must discard cards that are of the current turn rank from their hand face down, onto the pile. If a player believes that the discarded cards are not all of the current turn rank, they may call "BS". If the discard was a bluff, the entire pile (excluding the ace of spaces) is added to the playing player's hand. If the discard was not a bluff, the pile (excluding the ace of spades) is added to the calling player's hand.




### TODO:

- [ ] find good features
- [ ] make collection capabilities
- [ ] make BlackBox evaluation functions
- [ ] Do regression
- [ ] Win!




### Possible Features
- **current player num**
- **number of different ranks in your hand**
- "overlap" of ranks in your hand and your future required discard ranks
- **size of your hand**
- **size of the pile (known + possible)**
- cards in pile that overlap with your future required discard ranks
- minimum number of turns so that if no one called, you would be able to discard truthfully on your last turn
