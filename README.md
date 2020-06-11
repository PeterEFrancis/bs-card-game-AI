# bs-card-game-AI

This repository holds the software for development of an AI player for the card game "BS".

Sample Game:

```
Starting game.
Player 0 hand: [2S 2C 9D 7S AH 7H 3H JD 6S JC TC 5S 9H]
Player 1 hand: [6H 8S 5C 7C 4H KS TH 8C 6C KC JS 5H TD]
Player 2 hand: [3S 6D TS QH 2D 8H 9S AD 4D 3D AC 5D]
Player 3 hand: [4C 7D QD 4S 2H KH KD QC 8D 9C 3C QS JH]
Starting Player: 2
Pile: [AS]
Current rank: 2
Player 3 plays [2H]
Pile: [AS 2H]
Player 0 calls 4
Player 1 calls 0
Player 2 calls 2
Play was real
Card pile given to Player 0
Player 0 hand: [2S 2C 9D 7S AH 7H 3H JD 6S JC TC 5S 9H AS 2H]
Player 1 hand: [6H 8S 5C 7C 4H KS TH 8C 6C KC JS 5H TD]
Player 2 hand: [3S 6D TS QH 2D 8H 9S AD 4D 3D AC 5D]
Player 3 hand: [4C 7D QD 4S KH KD QC 8D 9C 3C QS JH]
Current rank: 3
Player 0 plays [3H]
Pile: [3H]
Player 1 calls 0
Player 2 calls 4
Player 3 calls 2
Play was real
Card pile given to Player 2
Player 0 hand: [2S 2C 9D 7S AH 7H JD 6S JC TC 5S 9H AS 2H]
Player 1 hand: [6H 8S 5C 7C 4H KS TH 8C 6C KC JS 5H TD]
Player 2 hand: [3S 6D TS QH 2D 8H 9S AD 4D 3D AC 5D 3H]
Player 3 hand: [4C 7D QD 4S KH KD QC 8D 9C 3C QS JH]
Current rank: 4
Player 1 plays [4H]
Pile: [4H]
Player 0 calls 0
Player 2 calls 2
Player 3 calls 4
Play was real
Card pile given to Player 3
Player 0 hand: [2S 2C 9D 7S AH 7H JD 6S JC TC 5S 9H AS 2H]
Player 1 hand: [6H 8S 5C 7C KS TH 8C 6C KC JS 5H TD]
Player 2 hand: [3S 6D TS QH 2D 8H 9S AD 4D 3D AC 5D 3H]
Player 3 hand: [4C 7D QD 4S KH KD QC 8D 9C 3C QS JH 4H]
Current rank: 5
Player 2 plays [5D]
Pile: [5D]
Player 0 calls 2
Player 1 calls 4
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [2S 2C 9D 7S AH 7H JD 6S JC TC 5S 9H AS 2H]
Player 1 hand: [6H 8S 5C 7C KS TH 8C 6C KC JS 5H TD 5D]
Player 2 hand: [3S 6D TS QH 2D 8H 9S AD 4D 3D AC 3H]
Player 3 hand: [4C 7D QD 4S KH KD QC 8D 9C 3C QS JH 4H]
Current rank: 6
Player 3 plays [4C]
Pile: [4C]
Player 0 calls 2
Player 1 calls 4
Player 2 calls 2
Play was real
Card pile given to Player 1
Player 0 hand: [2S 2C 9D 7S AH 7H JD 6S JC TC 5S 9H AS 2H]
Player 1 hand: [6H 8S 5C 7C KS TH 8C 6C KC JS 5H TD 5D 4C]
Player 2 hand: [3S 6D TS QH 2D 8H 9S AD 4D 3D AC 3H]
Player 3 hand: [7D QD 4S KH KD QC 8D 9C 3C QS JH 4H]
Current rank: 7
Player 0 plays [7S 7H]
Pile: [7S 7H]
Player 1 calls 2
Player 2 calls 0
Player 3 calls 2
Play was real
Card pile given to Player 1
Player 0 hand: [2S 2C 9D AH JD 6S JC TC 5S 9H AS 2H]
Player 1 hand: [6H 8S 5C 7C KS TH 8C 6C KC JS 5H TD 5D 4C 7S 7H]
Player 2 hand: [3S 6D TS QH 2D 8H 9S AD 4D 3D AC 3H]
Player 3 hand: [7D QD 4S KH KD QC 8D 9C 3C QS JH 4H]
Current rank: 8
Player 1 plays [8S 8C]
Pile: [8S 8C]
Player 0 calls 0
Player 2 calls 2
Player 3 calls 2
Play was real
Card pile given to Player 2
Player 0 hand: [2S 2C 9D AH JD 6S JC TC 5S 9H AS 2H]
Player 1 hand: [6H 5C 7C KS TH 6C KC JS 5H TD 5D 4C 7S 7H]
Player 2 hand: [3S 6D TS QH 2D 8H 9S AD 4D 3D AC 3H 8S 8C]
Player 3 hand: [7D QD 4S KH KD QC 8D 9C 3C QS JH 4H]
Current rank: 9
Player 2 plays [9S]
Pile: [9S]
Player 0 calls 4
Player 1 calls 0
Player 3 calls 2
Play was real
Card pile given to Player 0
Player 0 hand: [2S 2C 9D AH JD 6S JC TC 5S 9H AS 2H 9S]
Player 1 hand: [6H 5C 7C KS TH 6C KC JS 5H TD 5D 4C 7S 7H]
Player 2 hand: [3S 6D TS QH 2D 8H AD 4D 3D AC 3H 8S 8C]
Player 3 hand: [7D QD 4S KH KD QC 8D 9C 3C QS JH 4H]
Current rank: T
Player 3 plays [7D]
Pile: [7D]
Player 0 calls 2
Player 1 calls 4
Player 2 calls 2
Play was real
Card pile given to Player 1
Player 0 hand: [2S 2C 9D AH JD 6S JC TC 5S 9H AS 2H 9S]
Player 1 hand: [6H 5C 7C KS TH 6C KC JS 5H TD 5D 4C 7S 7H 7D]
Player 2 hand: [3S 6D TS QH 2D 8H AD 4D 3D AC 3H 8S 8C]
Player 3 hand: [QD 4S KH KD QC 8D 9C 3C QS JH 4H]
Current rank: J
Player 0 plays [JD JC]
Pile: [JD JC]
Player 1 calls 2
Player 2 calls 0
Player 3 calls 2
Play was real
Card pile given to Player 1
Player 0 hand: [2S 2C 9D AH 6S TC 5S 9H AS 2H 9S]
Player 1 hand: [6H 5C 7C KS TH 6C KC JS 5H TD 5D 4C 7S 7H 7D JD JC]
Player 2 hand: [3S 6D TS QH 2D 8H AD 4D 3D AC 3H 8S 8C]
Player 3 hand: [QD 4S KH KD QC 8D 9C 3C QS JH 4H]
Current rank: Q
Player 1 plays [6H]
Pile: [6H]
Player 0 calls 0
Player 2 calls 2
Player 3 calls 6
Play was real
Card pile given to Player 3
Player 0 hand: [2S 2C 9D AH 6S TC 5S 9H AS 2H 9S]
Player 1 hand: [5C 7C KS TH 6C KC JS 5H TD 5D 4C 7S 7H 7D JD JC]
Player 2 hand: [3S 6D TS QH 2D 8H AD 4D 3D AC 3H 8S 8C]
Player 3 hand: [QD 4S KH KD QC 8D 9C 3C QS JH 4H 6H]
Current rank: K
Player 2 plays [3S]
Pile: [3S]
Player 0 calls 0
Player 1 calls 4
Player 3 calls 4
Play was real
Card pile given to Player 1
Player 0 hand: [2S 2C 9D AH 6S TC 5S 9H AS 2H 9S]
Player 1 hand: [5C 7C KS TH 6C KC JS 5H TD 5D 4C 7S 7H 7D JD JC 3S]
Player 2 hand: [6D TS QH 2D 8H AD 4D 3D AC 3H 8S 8C]
Player 3 hand: [QD 4S KH KD QC 8D 9C 3C QS JH 4H 6H]
Current rank: A
Player 3 plays [QD]
Pile: [QD]
Player 0 calls 4
Player 1 calls 0
Player 2 calls 4
Play was real
Card pile given to Player 0
Player 0 hand: [2S 2C 9D AH 6S TC 5S 9H AS 2H 9S QD]
Player 1 hand: [5C 7C KS TH 6C KC JS 5H TD 5D 4C 7S 7H 7D JD JC 3S]
Player 2 hand: [6D TS QH 2D 8H AD 4D 3D AC 3H 8S 8C]
Player 3 hand: [4S KH KD QC 8D 9C 3C QS JH 4H 6H]
Current rank: 2
Player 0 plays [2S 2C 2H]
Pile: [2S 2C 2H]
Player 1 calls 0
Player 2 calls 2
Player 3 calls 0
Play was real
Card pile given to Player 2
Player 0 hand: [9D AH 6S TC 5S 9H AS 9S QD]
Player 1 hand: [5C 7C KS TH 6C KC JS 5H TD 5D 4C 7S 7H 7D JD JC 3S]
Player 2 hand: [6D TS QH 2D 8H AD 4D 3D AC 3H 8S 8C 2S 2C 2H]
Player 3 hand: [4S KH KD QC 8D 9C 3C QS JH 4H 6H]
Current rank: 3
Player 1 plays [3S]
Pile: [3S]
Player 0 calls 0
Player 2 calls 4
Player 3 calls 2
Play was real
Card pile given to Player 2
Player 0 hand: [9D AH 6S TC 5S 9H AS 9S QD]
Player 1 hand: [5C 7C KS TH 6C KC JS 5H TD 5D 4C 7S 7H 7D JD JC]
Player 2 hand: [6D TS QH 2D 8H AD 4D 3D AC 3H 8S 8C 2S 2C 2H 3S]
Player 3 hand: [4S KH KD QC 8D 9C 3C QS JH 4H 6H]
Current rank: 4
Player 2 plays [4D]
Pile: [4D]
Player 0 calls 0
Player 1 calls 2
Player 3 calls 4
Play was real
Card pile given to Player 3
Player 0 hand: [9D AH 6S TC 5S 9H AS 9S QD]
Player 1 hand: [5C 7C KS TH 6C KC JS 5H TD 5D 4C 7S 7H 7D JD JC]
Player 2 hand: [6D TS QH 2D 8H AD 3D AC 3H 8S 8C 2S 2C 2H 3S]
Player 3 hand: [4S KH KD QC 8D 9C 3C QS JH 4H 6H 4D]
Current rank: 5
Player 3 plays [4S]
Pile: [4S]
Player 0 calls 2
Player 1 calls 6
Player 2 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [9D AH 6S TC 5S 9H AS 9S QD]
Player 1 hand: [5C 7C KS TH 6C KC JS 5H TD 5D 4C 7S 7H 7D JD JC 4S]
Player 2 hand: [6D TS QH 2D 8H AD 3D AC 3H 8S 8C 2S 2C 2H 3S]
Player 3 hand: [KH KD QC 8D 9C 3C QS JH 4H 6H 4D]
Current rank: 6
Player 0 plays [6S]
Pile: [6S]
Player 1 calls 2
Player 2 calls 2
Player 3 calls 2
Play was real
Card pile given to Player 1
Player 0 hand: [9D AH TC 5S 9H AS 9S QD]
Player 1 hand: [5C 7C KS TH 6C KC JS 5H TD 5D 4C 7S 7H 7D JD JC 4S 6S]
Player 2 hand: [6D TS QH 2D 8H AD 3D AC 3H 8S 8C 2S 2C 2H 3S]
Player 3 hand: [KH KD QC 8D 9C 3C QS JH 4H 6H 4D]
Current rank: 7
Player 1 plays [7C 7S 7H 7D]
Pile: [7C 7S 7H 7D]
Player 0 calls 0
Player 2 calls 0
Player 3 calls 0
Current rank: 8
Player 2 plays [8H 8S 8C]
Pile: [7C 7S 7H 7D 8H 8S 8C]
Player 0 calls 0
Player 1 calls 0
Player 3 calls 2
Play was real
Card pile given to Player 3
Player 0 hand: [9D AH TC 5S 9H AS 9S QD]
Player 1 hand: [5C KS TH 6C KC JS 5H TD 5D 4C JD JC 4S 6S]
Player 2 hand: [6D TS QH 2D AD 3D AC 3H 2S 2C 2H 3S]
Player 3 hand: [KH KD QC 8D 9C 3C QS JH 4H 6H 4D 7C 7S 7H 7D 8H 8S 8C]
Current rank: 9
Player 3 plays [9C]
Pile: [9C]
Player 0 calls 6
Player 1 calls 0
Player 2 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [9D AH TC 5S 9H AS 9S QD 9C]
Player 1 hand: [5C KS TH 6C KC JS 5H TD 5D 4C JD JC 4S 6S]
Player 2 hand: [6D TS QH 2D AD 3D AC 3H 2S 2C 2H 3S]
Player 3 hand: [KH KD QC 8D 3C QS JH 4H 6H 4D 7C 7S 7H 7D 8H 8S 8C]
Current rank: T
Player 0 plays [TC]
Pile: [TC]
Player 1 calls 4
Player 2 calls 2
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [9D AH 5S 9H AS 9S QD 9C]
Player 1 hand: [5C KS TH 6C KC JS 5H TD 5D 4C JD JC 4S 6S TC]
Player 2 hand: [6D TS QH 2D AD 3D AC 3H 2S 2C 2H 3S]
Player 3 hand: [KH KD QC 8D 3C QS JH 4H 6H 4D 7C 7S 7H 7D 8H 8S 8C]
Current rank: J
Player 1 plays [JS JD JC]
Pile: [JS JD JC]
Player 0 calls 0
Player 2 calls 0
Player 3 calls 2
Play was real
Card pile given to Player 3
Player 0 hand: [9D AH 5S 9H AS 9S QD 9C]
Player 1 hand: [5C KS TH 6C KC 5H TD 5D 4C 4S 6S TC]
Player 2 hand: [6D TS QH 2D AD 3D AC 3H 2S 2C 2H 3S]
Player 3 hand: [KH KD QC 8D 3C QS JH 4H 6H 4D 7C 7S 7H 7D 8H 8S 8C JS JD JC]
Current rank: Q
Player 2 plays [QH]
Pile: [QH]
Player 0 calls 2
Player 1 calls 0
Player 3 calls 4
Play was real
Card pile given to Player 3
Player 0 hand: [9D AH 5S 9H AS 9S QD 9C]
Player 1 hand: [5C KS TH 6C KC 5H TD 5D 4C 4S 6S TC]
Player 2 hand: [6D TS 2D AD 3D AC 3H 2S 2C 2H 3S]
Player 3 hand: [KH KD QC 8D 3C QS JH 4H 6H 4D 7C 7S 7H 7D 8H 8S 8C JS JD JC QH]
Current rank: K
Player 3 plays [KH KD]
Pile: [KH KD]
Player 0 calls 0
Player 1 calls 4
Player 2 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [9D AH 5S 9H AS 9S QD 9C]
Player 1 hand: [5C KS TH 6C KC 5H TD 5D 4C 4S 6S TC KH KD]
Player 2 hand: [6D TS 2D AD 3D AC 3H 2S 2C 2H 3S]
Player 3 hand: [QC 8D 3C QS JH 4H 6H 4D 7C 7S 7H 7D 8H 8S 8C JS JD JC QH]
Current rank: A
Player 0 plays [AH AS]
Pile: [AH AS]
Player 1 calls 0
Player 2 calls 4
Player 3 calls 0
Play was real
Card pile given to Player 2
Player 0 hand: [9D 5S 9H 9S QD 9C]
Player 1 hand: [5C KS TH 6C KC 5H TD 5D 4C 4S 6S TC KH KD]
Player 2 hand: [6D TS 2D AD 3D AC 3H 2S 2C 2H 3S AH AS]
Player 3 hand: [QC 8D 3C QS JH 4H 6H 4D 7C 7S 7H 7D 8H 8S 8C JS JD JC QH]
Current rank: 2
Player 1 plays [5C]
Pile: [5C]
Player 0 calls 0
Player 2 calls 10
Player 3 calls 0
Play was real
Card pile given to Player 2
Player 0 hand: [9D 5S 9H 9S QD 9C]
Player 1 hand: [KS TH 6C KC 5H TD 5D 4C 4S 6S TC KH KD]
Player 2 hand: [6D TS 2D AD 3D AC 3H 2S 2C 2H 3S AH AS 5C]
Player 3 hand: [QC 8D 3C QS JH 4H 6H 4D 7C 7S 7H 7D 8H 8S 8C JS JD JC QH]
Current rank: 3
Player 2 plays [3D 3H 3S]
Pile: [3D 3H 3S]
Player 0 calls 0
Player 1 calls 0
Player 3 calls 2
Play was real
Card pile given to Player 3
Player 0 hand: [9D 5S 9H 9S QD 9C]
Player 1 hand: [KS TH 6C KC 5H TD 5D 4C 4S 6S TC KH KD]
Player 2 hand: [6D TS 2D AD AC 2S 2C 2H AH AS 5C]
Player 3 hand: [QC 8D 3C QS JH 4H 6H 4D 7C 7S 7H 7D 8H 8S 8C JS JD JC QH 3D 3H 3S]
Current rank: 4
Player 3 plays [4H 4D]
Pile: [4H 4D]
Player 0 calls 0
Player 1 calls 4
Player 2 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [9D 5S 9H 9S QD 9C]
Player 1 hand: [KS TH 6C KC 5H TD 5D 4C 4S 6S TC KH KD 4H 4D]
Player 2 hand: [6D TS 2D AD AC 2S 2C 2H AH AS 5C]
Player 3 hand: [QC 8D 3C QS JH 6H 7C 7S 7H 7D 8H 8S 8C JS JD JC QH 3D 3H 3S]
Current rank: 5
Player 0 plays [5S]
Pile: [5S]
Player 1 calls 4
Player 2 calls 2
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [9D 9H 9S QD 9C]
Player 1 hand: [KS TH 6C KC 5H TD 5D 4C 4S 6S TC KH KD 4H 4D 5S]
Player 2 hand: [6D TS 2D AD AC 2S 2C 2H AH AS 5C]
Player 3 hand: [QC 8D 3C QS JH 6H 7C 7S 7H 7D 8H 8S 8C JS JD JC QH 3D 3H 3S]
Current rank: 6
Player 1 plays [6C 6S]
Pile: [6C 6S]
Player 0 calls 0
Player 2 calls 2
Player 3 calls 2
Play was real
Card pile given to Player 2
Player 0 hand: [9D 9H 9S QD 9C]
Player 1 hand: [KS TH KC 5H TD 5D 4C 4S TC KH KD 4H 4D 5S]
Player 2 hand: [6D TS 2D AD AC 2S 2C 2H AH AS 5C 6C 6S]
Player 3 hand: [QC 8D 3C QS JH 6H 7C 7S 7H 7D 8H 8S 8C JS JD JC QH 3D 3H 3S]
Current rank: 7
Player 2 plays [6D]
Pile: [6D]
Player 0 calls 0
Player 1 calls 0
Player 3 calls 10
Play was real
Card pile given to Player 3
Player 0 hand: [9D 9H 9S QD 9C]
Player 1 hand: [KS TH KC 5H TD 5D 4C 4S TC KH KD 4H 4D 5S]
Player 2 hand: [TS 2D AD AC 2S 2C 2H AH AS 5C 6C 6S]
Player 3 hand: [QC 8D 3C QS JH 6H 7C 7S 7H 7D 8H 8S 8C JS JD JC QH 3D 3H 3S 6D]
Current rank: 8
Player 3 plays [8D 8H 8S 8C]
Pile: [8D 8H 8S 8C]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 0
Current rank: 9
Player 0 plays [9D 9H 9S 9C]
Pile: [8D 8H 8S 8C 9D 9H 9S 9C]
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Current rank: T
Player 1 plays [TH TD TC]
Pile: [8D 8H 8S 8C 9D 9H 9S 9C TH TD TC]
Player 0 calls 0
Player 2 calls 2
Player 3 calls 0
Play was real
Card pile given to Player 2
Player 0 hand: [QD]
Player 1 hand: [KS KC 5H 5D 4C 4S KH KD 4H 4D 5S]
Player 2 hand: [TS 2D AD AC 2S 2C 2H AH AS 5C 6C 6S 8D 8H 8S 8C 9D 9H 9S 9C TH TD TC]
Player 3 hand: [QC 3C QS JH 6H 7C 7S 7H 7D JS JD JC QH 3D 3H 3S 6D]
Current rank: J
Player 2 plays [TS]
Pile: [TS]
Player 0 calls 0
Player 1 calls 0
Player 3 calls 10
Play was real
Card pile given to Player 3
Player 0 hand: [QD]
Player 1 hand: [KS KC 5H 5D 4C 4S KH KD 4H 4D 5S]
Player 2 hand: [2D AD AC 2S 2C 2H AH AS 5C 6C 6S 8D 8H 8S 8C 9D 9H 9S 9C TH TD TC]
Player 3 hand: [QC 3C QS JH 6H 7C 7S 7H 7D JS JD JC QH 3D 3H 3S 6D TS]
Current rank: Q
Player 3 plays [QC QS QH]
Pile: [QC QS QH]
Player 0 calls 2
Player 1 calls 0
Player 2 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [QD QC QS QH]
Player 1 hand: [KS KC 5H 5D 4C 4S KH KD 4H 4D 5S]
Player 2 hand: [2D AD AC 2S 2C 2H AH AS 5C 6C 6S 8D 8H 8S 8C 9D 9H 9S 9C TH TD TC]
Player 3 hand: [3C JH 6H 7C 7S 7H 7D JS JD JC 3D 3H 3S 6D TS]
Current rank: K
Player 0 plays [QD]
Pile: [QD]
Player 1 calls 10
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [QC QS QH]
Player 1 hand: [KS KC 5H 5D 4C 4S KH KD 4H 4D 5S QD]
Player 2 hand: [2D AD AC 2S 2C 2H AH AS 5C 6C 6S 8D 8H 8S 8C 9D 9H 9S 9C TH TD TC]
Player 3 hand: [3C JH 6H 7C 7S 7H 7D JS JD JC 3D 3H 3S 6D TS]
Current rank: A
Player 1 plays [KS]
Pile: [KS]
Player 0 calls 0
Player 2 calls 10
Player 3 calls 0
Play was real
Card pile given to Player 2
Player 0 hand: [QC QS QH]
Player 1 hand: [KC 5H 5D 4C 4S KH KD 4H 4D 5S QD]
Player 2 hand: [2D AD AC 2S 2C 2H AH AS 5C 6C 6S 8D 8H 8S 8C 9D 9H 9S 9C TH TD TC KS]
Player 3 hand: [3C JH 6H 7C 7S 7H 7D JS JD JC 3D 3H 3S 6D TS]
Current rank: 2
Player 2 plays [2D 2S 2C 2H]
Pile: [2D 2S 2C 2H]
Player 0 calls 0
Player 1 calls 0
Player 3 calls 0
Current rank: 3
Player 3 plays [3C 3D 3H 3S]
Pile: [2D 2S 2C 2H 3C 3D 3H 3S]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 0
Current rank: 4
Player 0 plays [QC]
Pile: [2D 2S 2C 2H 3C 3D 3H 3S QC]
Player 1 calls 10
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [QS QH]
Player 1 hand: [KC 5H 5D 4C 4S KH KD 4H 4D 5S QD 2D 2S 2C 2H 3C 3D 3H 3S QC]
Player 2 hand: [AD AC AH AS 5C 6C 6S 8D 8H 8S 8C 9D 9H 9S 9C TH TD TC KS]
Player 3 hand: [JH 6H 7C 7S 7H 7D JS JD JC 6D TS]
Current rank: 5
Player 1 plays [5H 5D 5S]
Pile: [5H 5D 5S]
Player 0 calls 0
Player 2 calls 2
Player 3 calls 0
Play was real
Card pile given to Player 2
Player 0 hand: [QS QH]
Player 1 hand: [KC 4C 4S KH KD 4H 4D QD 2D 2S 2C 2H 3C 3D 3H 3S QC]
Player 2 hand: [AD AC AH AS 5C 6C 6S 8D 8H 8S 8C 9D 9H 9S 9C TH TD TC KS 5H 5D 5S]
Player 3 hand: [JH 6H 7C 7S 7H 7D JS JD JC 6D TS]
Current rank: 6
Player 2 plays [6C 6S]
Pile: [6C 6S]
Player 0 calls 0
Player 1 calls 0
Player 3 calls 4
Play was real
Card pile given to Player 3
Player 0 hand: [QS QH]
Player 1 hand: [KC 4C 4S KH KD 4H 4D QD 2D 2S 2C 2H 3C 3D 3H 3S QC]
Player 2 hand: [AD AC AH AS 5C 8D 8H 8S 8C 9D 9H 9S 9C TH TD TC KS 5H 5D 5S]
Player 3 hand: [JH 6H 7C 7S 7H 7D JS JD JC 6D TS 6C 6S]
Current rank: 7
Player 3 plays [7C 7S 7H 7D]
Pile: [7C 7S 7H 7D]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 0
Current rank: 8
Player 0 plays [QS]
Pile: [7C 7S 7H 7D QS]
Player 1 calls 0
Player 2 calls 10
Player 3 calls 0
Play was real
Card pile given to Player 2
Player 0 hand: [QH]
Player 1 hand: [KC 4C 4S KH KD 4H 4D QD 2D 2S 2C 2H 3C 3D 3H 3S QC]
Player 2 hand: [AD AC AH AS 5C 8D 8H 8S 8C 9D 9H 9S 9C TH TD TC KS 5H 5D 5S 7C 7S 7H 7D QS]
Player 3 hand: [JH 6H JS JD JC 6D TS 6C 6S]
Current rank: 9
Player 1 plays [KC]
Pile: [KC]
Player 0 calls 0
Player 2 calls 10
Player 3 calls 0
Play was real
Card pile given to Player 2
Player 0 hand: [QH]
Player 1 hand: [4C 4S KH KD 4H 4D QD 2D 2S 2C 2H 3C 3D 3H 3S QC]
Player 2 hand: [AD AC AH AS 5C 8D 8H 8S 8C 9D 9H 9S 9C TH TD TC KS 5H 5D 5S 7C 7S 7H 7D QS KC]
Player 3 hand: [JH 6H JS JD JC 6D TS 6C 6S]
Current rank: T
Player 2 plays [TH TD TC]
Pile: [TH TD TC]
Player 0 calls 0
Player 1 calls 0
Player 3 calls 2
Play was real
Card pile given to Player 3
Player 0 hand: [QH]
Player 1 hand: [4C 4S KH KD 4H 4D QD 2D 2S 2C 2H 3C 3D 3H 3S QC]
Player 2 hand: [AD AC AH AS 5C 8D 8H 8S 8C 9D 9H 9S 9C KS 5H 5D 5S 7C 7S 7H 7D QS KC]
Player 3 hand: [JH 6H JS JD JC 6D TS 6C 6S TH TD TC]
Current rank: J
Player 3 plays [JH JS JD JC]
Pile: [JH JS JD JC]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 0
Current rank: Q
Player 0 plays [QH]
Pile: [JH JS JD JC QH]
Player 1 calls 4
Player 2 calls 2
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: []
Player 1 hand: [4C 4S KH KD 4H 4D QD 2D 2S 2C 2H 3C 3D 3H 3S QC JH JS JD JC QH]
Player 2 hand: [AD AC AH AS 5C 8D 8H 8S 8C 9D 9H 9S 9C KS 5H 5D 5S 7C 7S 7H 7D QS KC]
Player 3 hand: [6H 6D TS 6C 6S TH TD TC]
Player 0 wins!
```
