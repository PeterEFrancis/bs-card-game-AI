# bs-card-game-AI

This repository holds the software for development of an AI player for the card game "BS".

Sample Game:

```
Starting game.
Player 0 hand: [4S AC 6C JS JC AD QC 5C 6D 3H 4H 6S 2D]
Player 1 hand: [2C 8H TD QS 3D JD 9C 8S 8D 7C 8C KD]
Player 2 hand: [TH 6H AH KC 2S 2H TC QD KH 7D 4C 4D QH]
Player 3 hand: [KS 3S 5D 3C 5S 9D 7H 5H 9S 9H JH TS 7S]
Starting Player: 1
Pile: [AS]
Current rank: 2
Player 2 plays [2S 2H]
Pile: [AS 2S 2H]
Player 0 calls 2
Player 1 calls 2
Player 3 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [4S AC 6C JS JC AD QC 5C 6D 3H 4H 6S 2D AS 2S 2H]
Player 1 hand: [2C 8H TD QS 3D JD 9C 8S 8D 7C 8C KD]
Player 2 hand: [TH 6H AH KC TC QD KH 7D 4C 4D QH]
Player 3 hand: [KS 3S 5D 3C 5S 9D 7H 5H 9S 9H JH TS 7S]
Current rank: 3
Player 3 plays [3S 3C]
Pile: [3S 3C]
Player 0 calls 0
Player 1 calls 2
Player 2 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [4S AC 6C JS JC AD QC 5C 6D 3H 4H 6S 2D AS 2S 2H]
Player 1 hand: [2C 8H TD QS 3D JD 9C 8S 8D 7C 8C KD 3S 3C]
Player 2 hand: [TH 6H AH KC TC QD KH 7D 4C 4D QH]
Player 3 hand: [KS 5D 5S 9D 7H 5H 9S 9H JH TS 7S]
Current rank: 4
Player 0 plays [4S 4H]
Pile: [4S 4H]
Player 1 calls 0
Player 2 calls 4
Player 3 calls 0
Play was real
Card pile given to Player 2
Player 0 hand: [AC 6C JS JC AD QC 5C 6D 3H 6S 2D AS 2S 2H]
Player 1 hand: [2C 8H TD QS 3D JD 9C 8S 8D 7C 8C KD 3S 3C]
Player 2 hand: [TH 6H AH KC TC QD KH 7D 4C 4D QH 4S 4H]
Player 3 hand: [KS 5D 5S 9D 7H 5H 9S 9H JH TS 7S]
Current rank: 5
Player 1 plays [2C]
Pile: [2C]
Player 0 calls 2
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [AC 6C JS JC AD QC 5C 6D 3H 6S 2D AS 2S 2H 2C]
Player 1 hand: [8H TD QS 3D JD 9C 8S 8D 7C 8C KD 3S 3C]
Player 2 hand: [TH 6H AH KC TC QD KH 7D 4C 4D QH 4S 4H]
Player 3 hand: [KS 5D 5S 9D 7H 5H 9S 9H JH TS 7S]
Current rank: 6
Player 2 plays [6H]
Pile: [6H]
Player 0 calls 0
Player 1 calls 0
Player 3 calls 0
Current rank: 7
Player 3 plays [7H 7S]
Pile: [6H 7H 7S]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 2
Play was real
Card pile given to Player 2
Player 0 hand: [AC 6C JS JC AD QC 5C 6D 3H 6S 2D AS 2S 2H 2C]
Player 1 hand: [8H TD QS 3D JD 9C 8S 8D 7C 8C KD 3S 3C]
Player 2 hand: [TH AH KC TC QD KH 7D 4C 4D QH 4S 4H 6H 7H 7S]
Player 3 hand: [KS 5D 5S 9D 5H 9S 9H JH TS]
Current rank: 8
Player 0 plays [AC]
Pile: [AC]
Player 1 calls 10
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [6C JS JC AD QC 5C 6D 3H 6S 2D AS 2S 2H 2C]
Player 1 hand: [8H TD QS 3D JD 9C 8S 8D 7C 8C KD 3S 3C AC]
Player 2 hand: [TH AH KC TC QD KH 7D 4C 4D QH 4S 4H 6H 7H 7S]
Player 3 hand: [KS 5D 5S 9D 5H 9S 9H JH TS]
Current rank: 9
Player 1 plays [9C]
Pile: [9C]
Player 0 calls 0
Player 2 calls 0
Player 3 calls 0
Current rank: T
Player 2 plays [TH TC]
Pile: [9C TH TC]
Player 0 calls 0
Player 1 calls 0
Player 3 calls 2
Play was real
Card pile given to Player 3
Player 0 hand: [6C JS JC AD QC 5C 6D 3H 6S 2D AS 2S 2H 2C]
Player 1 hand: [8H TD QS 3D JD 8S 8D 7C 8C KD 3S 3C AC]
Player 2 hand: [AH KC QD KH 7D 4C 4D QH 4S 4H 6H 7H 7S]
Player 3 hand: [KS 5D 5S 9D 5H 9S 9H JH TS 9C TH TC]
Current rank: J
Player 3 plays [JH]
Pile: [JH]
Player 0 calls 0
Player 1 calls 2
Player 2 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [6C JS JC AD QC 5C 6D 3H 6S 2D AS 2S 2H 2C]
Player 1 hand: [8H TD QS 3D JD 8S 8D 7C 8C KD 3S 3C AC JH]
Player 2 hand: [AH KC QD KH 7D 4C 4D QH 4S 4H 6H 7H 7S]
Player 3 hand: [KS 5D 5S 9D 5H 9S 9H TS 9C TH TC]
Current rank: Q
Player 0 plays [QC]
Pile: [QC]
Player 1 calls 2
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [6C JS JC AD 5C 6D 3H 6S 2D AS 2S 2H 2C]
Player 1 hand: [8H TD QS 3D JD 8S 8D 7C 8C KD 3S 3C AC JH QC]
Player 2 hand: [AH KC QD KH 7D 4C 4D QH 4S 4H 6H 7H 7S]
Player 3 hand: [KS 5D 5S 9D 5H 9S 9H TS 9C TH TC]
Current rank: K
Player 1 plays [KD]
Pile: [KD]
Player 0 calls 0
Player 2 calls 4
Player 3 calls 2
Play was real
Card pile given to Player 2
Player 0 hand: [6C JS JC AD 5C 6D 3H 6S 2D AS 2S 2H 2C]
Player 1 hand: [8H TD QS 3D JD 8S 8D 7C 8C 3S 3C AC JH QC]
Player 2 hand: [AH KC QD KH 7D 4C 4D QH 4S 4H 6H 7H 7S KD]
Player 3 hand: [KS 5D 5S 9D 5H 9S 9H TS 9C TH TC]
Current rank: A
Player 2 plays [AH]
Pile: [AH]
Player 0 calls 4
Player 1 calls 2
Player 3 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [6C JS JC AD 5C 6D 3H 6S 2D AS 2S 2H 2C AH]
Player 1 hand: [8H TD QS 3D JD 8S 8D 7C 8C 3S 3C AC JH QC]
Player 2 hand: [KC QD KH 7D 4C 4D QH 4S 4H 6H 7H 7S KD]
Player 3 hand: [KS 5D 5S 9D 5H 9S 9H TS 9C TH TC]
Current rank: 2
Player 3 plays [KS]
Pile: [KS]
Player 0 calls 10
Player 1 calls 0
Player 2 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [6C JS JC AD 5C 6D 3H 6S 2D AS 2S 2H 2C AH KS]
Player 1 hand: [8H TD QS 3D JD 8S 8D 7C 8C 3S 3C AC JH QC]
Player 2 hand: [KC QD KH 7D 4C 4D QH 4S 4H 6H 7H 7S KD]
Player 3 hand: [5D 5S 9D 5H 9S 9H TS 9C TH TC]
Current rank: 3
Player 0 plays [3H]
Pile: [3H]
Player 1 calls 6
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [6C JS JC AD 5C 6D 6S 2D AS 2S 2H 2C AH KS]
Player 1 hand: [8H TD QS 3D JD 8S 8D 7C 8C 3S 3C AC JH QC 3H]
Player 2 hand: [KC QD KH 7D 4C 4D QH 4S 4H 6H 7H 7S KD]
Player 3 hand: [5D 5S 9D 5H 9S 9H TS 9C TH TC]
Current rank: 4
Player 1 plays [8H]
Pile: [8H]
Player 0 calls 0
Player 2 calls 10
Player 3 calls 0
Play was real
Card pile given to Player 2
Player 0 hand: [6C JS JC AD 5C 6D 6S 2D AS 2S 2H 2C AH KS]
Player 1 hand: [TD QS 3D JD 8S 8D 7C 8C 3S 3C AC JH QC 3H]
Player 2 hand: [KC QD KH 7D 4C 4D QH 4S 4H 6H 7H 7S KD 8H]
Player 3 hand: [5D 5S 9D 5H 9S 9H TS 9C TH TC]
Current rank: 5
Player 2 plays [KC]
Pile: [KC]
Player 0 calls 0
Player 1 calls 0
Player 3 calls 6
Play was real
Card pile given to Player 3
Player 0 hand: [6C JS JC AD 5C 6D 6S 2D AS 2S 2H 2C AH KS]
Player 1 hand: [TD QS 3D JD 8S 8D 7C 8C 3S 3C AC JH QC 3H]
Player 2 hand: [QD KH 7D 4C 4D QH 4S 4H 6H 7H 7S KD 8H]
Player 3 hand: [5D 5S 9D 5H 9S 9H TS 9C TH TC KC]
Current rank: 6
Player 3 plays [5D]
Pile: [5D]
Player 0 calls 6
Player 1 calls 0
Player 2 calls 2
Play was real
Card pile given to Player 0
Player 0 hand: [6C JS JC AD 5C 6D 6S 2D AS 2S 2H 2C AH KS 5D]
Player 1 hand: [TD QS 3D JD 8S 8D 7C 8C 3S 3C AC JH QC 3H]
Player 2 hand: [QD KH 7D 4C 4D QH 4S 4H 6H 7H 7S KD 8H]
Player 3 hand: [5S 9D 5H 9S 9H TS 9C TH TC KC]
Current rank: 7
Player 0 plays [6C]
Pile: [6C]
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Current rank: 8
Player 1 plays [8S 8D 8C]
Pile: [6C 8S 8D 8C]
Player 0 calls 0
Player 2 calls 2
Player 3 calls 0
Play was real
Card pile given to Player 2
Player 0 hand: [JS JC AD 5C 6D 6S 2D AS 2S 2H 2C AH KS 5D]
Player 1 hand: [TD QS 3D JD 7C 3S 3C AC JH QC 3H]
Player 2 hand: [QD KH 7D 4C 4D QH 4S 4H 6H 7H 7S KD 8H 6C 8S 8D 8C]
Player 3 hand: [5S 9D 5H 9S 9H TS 9C TH TC KC]
Current rank: 9
Player 2 plays [QD]
Pile: [QD]
Player 0 calls 0
Player 1 calls 0
Player 3 calls 10
Play was real
Card pile given to Player 3
Player 0 hand: [JS JC AD 5C 6D 6S 2D AS 2S 2H 2C AH KS 5D]
Player 1 hand: [TD QS 3D JD 7C 3S 3C AC JH QC 3H]
Player 2 hand: [KH 7D 4C 4D QH 4S 4H 6H 7H 7S KD 8H 6C 8S 8D 8C]
Player 3 hand: [5S 9D 5H 9S 9H TS 9C TH TC KC QD]
Current rank: T
Player 3 plays [TS TH TC]
Pile: [TS TH TC]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 0
Current rank: J
Player 0 plays [JS JC]
Pile: [TS TH TC JS JC]
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Current rank: Q
Player 1 plays [QS QC]
Pile: [TS TH TC JS JC QS QC]
Player 0 calls 0
Player 2 calls 0
Player 3 calls 2
Play was real
Card pile given to Player 3
Player 0 hand: [AD 5C 6D 6S 2D AS 2S 2H 2C AH KS 5D]
Player 1 hand: [TD 3D JD 7C 3S 3C AC JH 3H]
Player 2 hand: [KH 7D 4C 4D QH 4S 4H 6H 7H 7S KD 8H 6C 8S 8D 8C]
Player 3 hand: [5S 9D 5H 9S 9H 9C KC QD TS TH TC JS JC QS QC]
Current rank: K
Player 2 plays [KH KD]
Pile: [KH KD]
Player 0 calls 2
Player 1 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [AD 5C 6D 6S 2D AS 2S 2H 2C AH KS 5D KH KD]
Player 1 hand: [TD 3D JD 7C 3S 3C AC JH 3H]
Player 2 hand: [7D 4C 4D QH 4S 4H 6H 7H 7S 8H 6C 8S 8D 8C]
Player 3 hand: [5S 9D 5H 9S 9H 9C KC QD TS TH TC JS JC QS QC]
Current rank: A
Player 3 plays [5S]
Pile: [5S]
Player 0 calls 6
Player 1 calls 0
Player 2 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [AD 5C 6D 6S 2D AS 2S 2H 2C AH KS 5D KH KD 5S]
Player 1 hand: [TD 3D JD 7C 3S 3C AC JH 3H]
Player 2 hand: [7D 4C 4D QH 4S 4H 6H 7H 7S 8H 6C 8S 8D 8C]
Player 3 hand: [9D 5H 9S 9H 9C KC QD TS TH TC JS JC QS QC]
Current rank: 2
Player 0 plays [2D 2S 2H 2C]
Pile: [2D 2S 2H 2C]
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Current rank: 3
Player 1 plays [3D 3S 3C 3H]
Pile: [2D 2S 2H 2C 3D 3S 3C 3H]
Player 0 calls 0
Player 2 calls 0
Player 3 calls 0
Current rank: 4
Player 2 plays [4C 4D 4S 4H]
Pile: [2D 2S 2H 2C 3D 3S 3C 3H 4C 4D 4S 4H]
Player 0 calls 0
Player 1 calls 0
Player 3 calls 0
Current rank: 5
Player 3 plays [5H]
Pile: [2D 2S 2H 2C 3D 3S 3C 3H 4C 4D 4S 4H 5H]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 0
Current rank: 6
Player 0 plays [6D 6S]
Pile: [2D 2S 2H 2C 3D 3S 3C 3H 4C 4D 4S 4H 5H 6D 6S]
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Current rank: 7
Player 1 plays [7C]
Pile: [2D 2S 2H 2C 3D 3S 3C 3H 4C 4D 4S 4H 5H 6D 6S 7C]
Player 0 calls 0
Player 2 calls 0
Player 3 calls 0
Current rank: 8
Player 2 plays [8H 8S 8D 8C]
Pile: [2D 2S 2H 2C 3D 3S 3C 3H 4C 4D 4S 4H 5H 6D 6S 7C 8H 8S 8D 8C]
Player 0 calls 0
Player 1 calls 0
Player 3 calls 0
Current rank: 9
Player 3 plays [9D 9S 9H 9C]
Pile: [2D 2S 2H 2C 3D 3S 3C 3H 4C 4D 4S 4H 5H 6D 6S 7C 8H 8S 8D 8C 9D 9S 9H 9C]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 0
Current rank: T
Player 0 plays [AD]
Pile: [2D 2S 2H 2C 3D 3S 3C 3H 4C 4D 4S 4H 5H 6D 6S 7C 8H 8S 8D 8C 9D 9S 9H 9C AD]
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Current rank: J
Player 1 plays [JD JH]
Pile: [2D 2S 2H 2C 3D 3S 3C 3H 4C 4D 4S 4H 5H 6D 6S 7C 8H 8S 8D 8C 9D 9S 9H 9C AD JD JH]
Player 0 calls 0
Player 2 calls 0
Player 3 calls 4
Play was real
Card pile given to Player 3
Player 0 hand: [5C AS AH KS 5D KH KD 5S]
Player 1 hand: [TD AC]
Player 2 hand: [7D QH 6H 7H 7S 6C]
Player 3 hand: [KC QD TS TH TC JS JC QS QC 2D 2S 2H 2C 3D 3S 3C 3H 4C 4D 4S 4H 5H 6D 6S 7C 8H 8S 8D 8C 9D 9S 9H 9C AD JD JH]
Current rank: Q
Player 2 plays [QH]
Pile: [QH]
Player 0 calls 0
Player 1 calls 0
Player 3 calls 0
Current rank: K
Player 3 plays [KC]
Pile: [QH KC]
Player 0 calls 6
Player 1 calls 0
Player 2 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [5C AS AH KS 5D KH KD 5S QH KC]
Player 1 hand: [TD AC]
Player 2 hand: [7D 6H 7H 7S 6C]
Player 3 hand: [QD TS TH TC JS JC QS QC 2D 2S 2H 2C 3D 3S 3C 3H 4C 4D 4S 4H 5H 6D 6S 7C 8H 8S 8D 8C 9D 9S 9H 9C AD JD JH]
Current rank: A
Player 0 plays [AS AH]
Pile: [AS AH]
Player 1 calls 0
Player 2 calls 0
Player 3 calls 2
Play was real
Card pile given to Player 3
Player 0 hand: [5C KS 5D KH KD 5S QH KC]
Player 1 hand: [TD AC]
Player 2 hand: [7D 6H 7H 7S 6C]
Player 3 hand: [QD TS TH TC JS JC QS QC 2D 2S 2H 2C 3D 3S 3C 3H 4C 4D 4S 4H 5H 6D 6S 7C 8H 8S 8D 8C 9D 9S 9H 9C AD JD JH AS AH]
Current rank: 2
Player 1 plays [TD]
Pile: [TD]
Player 0 calls 0
Player 2 calls 0
Player 3 calls 10
Play was real
Card pile given to Player 3
Player 0 hand: [5C KS 5D KH KD 5S QH KC]
Player 1 hand: [AC]
Player 2 hand: [7D 6H 7H 7S 6C]
Player 3 hand: [QD TS TH TC JS JC QS QC 2D 2S 2H 2C 3D 3S 3C 3H 4C 4D 4S 4H 5H 6D 6S 7C 8H 8S 8D 8C 9D 9S 9H 9C AD JD JH AS AH TD]
Current rank: 3
Player 2 plays [7D]
Pile: [7D]
Player 0 calls 0
Player 1 calls 0
Player 3 calls 10
Play was real
Card pile given to Player 3
Player 0 hand: [5C KS 5D KH KD 5S QH KC]
Player 1 hand: [AC]
Player 2 hand: [6H 7H 7S 6C]
Player 3 hand: [QD TS TH TC JS JC QS QC 2D 2S 2H 2C 3D 3S 3C 3H 4C 4D 4S 4H 5H 6D 6S 7C 8H 8S 8D 8C 9D 9S 9H 9C AD JD JH AS AH TD 7D]
Current rank: 4
Player 3 plays [4C 4D 4S 4H]
Pile: [4C 4D 4S 4H]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 0
Current rank: 5
Player 0 plays [5C 5D 5S]
Pile: [4C 4D 4S 4H 5C 5D 5S]
Player 1 calls 0
Player 2 calls 0
Player 3 calls 2
Play was real
Card pile given to Player 3
Player 0 hand: [KS KH KD QH KC]
Player 1 hand: [AC]
Player 2 hand: [6H 7H 7S 6C]
Player 3 hand: [QD TS TH TC JS JC QS QC 2D 2S 2H 2C 3D 3S 3C 3H 5H 6D 6S 7C 8H 8S 8D 8C 9D 9S 9H 9C AD JD JH AS AH TD 7D 4C 4D 4S 4H 5C 5D 5S]
Current rank: 6
Player 1 plays [AC]
Pile: [AC]
Player 0 calls 0
Player 2 calls 4
Player 3 calls 0
Play was real
Card pile given to Player 2
Player 0 hand: [KS KH KD QH KC]
Player 1 hand: []
Player 2 hand: [6H 7H 7S 6C AC]
Player 3 hand: [QD TS TH TC JS JC QS QC 2D 2S 2H 2C 3D 3S 3C 3H 5H 6D 6S 7C 8H 8S 8D 8C 9D 9S 9H 9C AD JD JH AS AH TD 7D 4C 4D 4S 4H 5C 5D 5S]
Player 1 wins!

```
