# bs-card-game-AI

This repository holds the software for development of an AI player for the card game "BS".

Sample Game:

```
Starting game.
Player 0 hand: [JC 6C 8D 5H KH 5S QC 3C 6S TC 6H 4S 4H]
Player 1 hand: [JH 9D 7H 4D 5C 7D 8C TH KS 3S KD JS 4C]
Player 2 hand: [QS 9S 5D AC QD 3D 7S 8S 2D 2C 2S JD 9C]
Player 3 hand: [QH KC AH AD 2H 7C 9H TD 6D 8H 3H TS]
Starting Player: 3
Pile: [AS]
Current rank: 3
Player 0 plays [3C]
Pile: [AS 3C]
Player 0 calls 0
Player 1 calls 2
Player 2 calls 2
Player 3 calls 2
Play was real
Card pile given to Player 1
Player 0 hand: [JC 6C 8D 5H KH 5S QC 6S TC 6H 4S 4H]
Player 1 hand: [JH 9D 7H 4D 5C 7D 8C TH KS 3S KD JS 4C AS 3C]
Player 2 hand: [QS 9S 5D AC QD 3D 7S 8S 2D 2C 2S JD 9C]
Player 3 hand: [QH KC AH AD 2H 7C 9H TD 6D 8H 3H TS]
Current rank: 4
Player 1 plays [4D 4C]
Pile: [4D 4C]
Player 0 calls 4
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [JC 6C 8D 5H KH 5S QC 6S TC 6H 4S 4H 4D 4C]
Player 1 hand: [JH 9D 7H 5C 7D 8C TH KS 3S KD JS AS 3C]
Player 2 hand: [QS 9S 5D AC QD 3D 7S 8S 2D 2C 2S JD 9C]
Player 3 hand: [QH KC AH AD 2H 7C 9H TD 6D 8H 3H TS]
Current rank: 5
Player 2 plays [5D]
Pile: [5D]
Player 0 calls 10
Player 1 calls 2
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [JC 6C 8D 5H KH 5S QC 6S TC 6H 4S 4H 4D 4C 5D]
Player 1 hand: [JH 9D 7H 5C 7D 8C TH KS 3S KD JS AS 3C]
Player 2 hand: [QS 9S AC QD 3D 7S 8S 2D 2C 2S JD 9C]
Player 3 hand: [QH KC AH AD 2H 7C 9H TD 6D 8H 3H TS]
Current rank: 6
Player 3 plays [6D]
Pile: [6D]
Player 0 calls 10
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [JC 6C 8D 5H KH 5S QC 6S TC 6H 4S 4H 4D 4C 5D 6D]
Player 1 hand: [JH 9D 7H 5C 7D 8C TH KS 3S KD JS AS 3C]
Player 2 hand: [QS 9S AC QD 3D 7S 8S 2D 2C 2S JD 9C]
Player 3 hand: [QH KC AH AD 2H 7C 9H TD 8H 3H TS]
Current rank: 7
Player 0 plays [JC]
Pile: [JC]
Player 0 calls 0
Player 1 calls 10
Player 2 calls 2
Player 3 calls 2
Play was real
Card pile given to Player 1
Player 0 hand: [6C 8D 5H KH 5S QC 6S TC 6H 4S 4H 4D 4C 5D 6D]
Player 1 hand: [JH 9D 7H 5C 7D 8C TH KS 3S KD JS AS 3C JC]
Player 2 hand: [QS 9S AC QD 3D 7S 8S 2D 2C 2S JD 9C]
Player 3 hand: [QH KC AH AD 2H 7C 9H TD 8H 3H TS]
Current rank: 8
Player 1 plays [8C]
Pile: [8C]
Player 0 calls 2
Player 1 calls 0
Player 2 calls 2
Player 3 calls 2
Play was real
Card pile given to Player 0
Player 0 hand: [6C 8D 5H KH 5S QC 6S TC 6H 4S 4H 4D 4C 5D 6D 8C]
Player 1 hand: [JH 9D 7H 5C 7D TH KS 3S KD JS AS 3C JC]
Player 2 hand: [QS 9S AC QD 3D 7S 8S 2D 2C 2S JD 9C]
Player 3 hand: [QH KC AH AD 2H 7C 9H TD 8H 3H TS]
Current rank: 9
Player 2 plays [9S 9C]
Pile: [9S 9C]
Player 0 calls 0
Player 1 calls 2
Player 2 calls 0
Player 3 calls 2
Play was real
Card pile given to Player 1
Player 0 hand: [6C 8D 5H KH 5S QC 6S TC 6H 4S 4H 4D 4C 5D 6D 8C]
Player 1 hand: [JH 9D 7H 5C 7D TH KS 3S KD JS AS 3C JC 9S 9C]
Player 2 hand: [QS AC QD 3D 7S 8S 2D 2C 2S JD]
Player 3 hand: [QH KC AH AD 2H 7C 9H TD 8H 3H TS]
Current rank: T
Player 3 plays [TD TS]
Pile: [TD TS]
Player 0 calls 2
Player 1 calls 2
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [6C 8D 5H KH 5S QC 6S TC 6H 4S 4H 4D 4C 5D 6D 8C TD TS]
Player 1 hand: [JH 9D 7H 5C 7D TH KS 3S KD JS AS 3C JC 9S 9C]
Player 2 hand: [QS AC QD 3D 7S 8S 2D 2C 2S JD]
Player 3 hand: [QH KC AH AD 2H 7C 9H 8H 3H]
Current rank: J
Player 0 plays [6C]
Pile: [6C]
Player 0 calls 0
Player 1 calls 10
Player 2 calls 2
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [8D 5H KH 5S QC 6S TC 6H 4S 4H 4D 4C 5D 6D 8C TD TS]
Player 1 hand: [JH 9D 7H 5C 7D TH KS 3S KD JS AS 3C JC 9S 9C 6C]
Player 2 hand: [QS AC QD 3D 7S 8S 2D 2C 2S JD]
Player 3 hand: [QH KC AH AD 2H 7C 9H 8H 3H]
Current rank: Q
Player 1 plays [JH]
Pile: [JH]
Player 0 calls 2
Player 1 calls 0
Player 2 calls 10
Player 3 calls 2
Play was real
Card pile given to Player 2
Player 0 hand: [8D 5H KH 5S QC 6S TC 6H 4S 4H 4D 4C 5D 6D 8C TD TS]
Player 1 hand: [9D 7H 5C 7D TH KS 3S KD JS AS 3C JC 9S 9C 6C]
Player 2 hand: [QS AC QD 3D 7S 8S 2D 2C 2S JD JH]
Player 3 hand: [QH KC AH AD 2H 7C 9H 8H 3H]
Current rank: K
Player 2 plays [QS]
Pile: [QS]
Player 0 calls 2
Player 1 calls 10
Player 2 calls 0
Player 3 calls 2
Play was real
Card pile given to Player 1
Player 0 hand: [8D 5H KH 5S QC 6S TC 6H 4S 4H 4D 4C 5D 6D 8C TD TS]
Player 1 hand: [9D 7H 5C 7D TH KS 3S KD JS AS 3C JC 9S 9C 6C QS]
Player 2 hand: [AC QD 3D 7S 8S 2D 2C 2S JD JH]
Player 3 hand: [QH KC AH AD 2H 7C 9H 8H 3H]
Current rank: A
Player 3 plays [AH AD]
Pile: [AH AD]
Player 0 calls 0
Player 1 calls 2
Player 2 calls 2
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [8D 5H KH 5S QC 6S TC 6H 4S 4H 4D 4C 5D 6D 8C TD TS]
Player 1 hand: [9D 7H 5C 7D TH KS 3S KD JS AS 3C JC 9S 9C 6C QS AH AD]
Player 2 hand: [AC QD 3D 7S 8S 2D 2C 2S JD JH]
Player 3 hand: [QH KC 2H 7C 9H 8H 3H]
Current rank: 2
Player 0 plays [8D]
Pile: [8D]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 10
Player 3 calls 2
Play was real
Card pile given to Player 2
Player 0 hand: [5H KH 5S QC 6S TC 6H 4S 4H 4D 4C 5D 6D 8C TD TS]
Player 1 hand: [9D 7H 5C 7D TH KS 3S KD JS AS 3C JC 9S 9C 6C QS AH AD]
Player 2 hand: [AC QD 3D 7S 8S 2D 2C 2S JD JH 8D]
Player 3 hand: [QH KC 2H 7C 9H 8H 3H]
Current rank: 3
Player 1 plays [3S 3C]
Pile: [3S 3C]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 2
Player 3 calls 2
Play was real
Card pile given to Player 2
Player 0 hand: [5H KH 5S QC 6S TC 6H 4S 4H 4D 4C 5D 6D 8C TD TS]
Player 1 hand: [9D 7H 5C 7D TH KS KD JS AS JC 9S 9C 6C QS AH AD]
Player 2 hand: [AC QD 3D 7S 8S 2D 2C 2S JD JH 8D 3S 3C]
Player 3 hand: [QH KC 2H 7C 9H 8H 3H]
Current rank: 4
Player 2 plays [AC]
Pile: [AC]
Player 0 calls 10
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [5H KH 5S QC 6S TC 6H 4S 4H 4D 4C 5D 6D 8C TD TS AC]
Player 1 hand: [9D 7H 5C 7D TH KS KD JS AS JC 9S 9C 6C QS AH AD]
Player 2 hand: [QD 3D 7S 8S 2D 2C 2S JD JH 8D 3S 3C]
Player 3 hand: [QH KC 2H 7C 9H 8H 3H]
Current rank: 5
Player 3 plays [QH]
Pile: [QH]
Player 0 calls 10
Player 1 calls 2
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [5H KH 5S QC 6S TC 6H 4S 4H 4D 4C 5D 6D 8C TD TS AC QH]
Player 1 hand: [9D 7H 5C 7D TH KS KD JS AS JC 9S 9C 6C QS AH AD]
Player 2 hand: [QD 3D 7S 8S 2D 2C 2S JD JH 8D 3S 3C]
Player 3 hand: [KC 2H 7C 9H 8H 3H]
Current rank: 6
Player 0 plays [6S 6H 6D]
Pile: [6S 6H 6D]
Player 0 calls 0
Player 1 calls 2
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [5H KH 5S QC TC 4S 4H 4D 4C 5D 8C TD TS AC QH]
Player 1 hand: [9D 7H 5C 7D TH KS KD JS AS JC 9S 9C 6C QS AH AD 6S 6H 6D]
Player 2 hand: [QD 3D 7S 8S 2D 2C 2S JD JH 8D 3S 3C]
Player 3 hand: [KC 2H 7C 9H 8H 3H]
Current rank: 7
Player 1 plays [7H 7D]
Pile: [7H 7D]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 2
Player 3 calls 2
Play was real
Card pile given to Player 2
Player 0 hand: [5H KH 5S QC TC 4S 4H 4D 4C 5D 8C TD TS AC QH]
Player 1 hand: [9D 5C TH KS KD JS AS JC 9S 9C 6C QS AH AD 6S 6H 6D]
Player 2 hand: [QD 3D 7S 8S 2D 2C 2S JD JH 8D 3S 3C 7H 7D]
Player 3 hand: [KC 2H 7C 9H 8H 3H]
Current rank: 8
Player 2 plays [8S 8D]
Pile: [8S 8D]
Player 0 calls 2
Player 1 calls 0
Player 2 calls 0
Player 3 calls 2
Play was real
Card pile given to Player 0
Player 0 hand: [5H KH 5S QC TC 4S 4H 4D 4C 5D 8C TD TS AC QH 8S 8D]
Player 1 hand: [9D 5C TH KS KD JS AS JC 9S 9C 6C QS AH AD 6S 6H 6D]
Player 2 hand: [QD 3D 7S 2D 2C 2S JD JH 3S 3C 7H 7D]
Player 3 hand: [KC 2H 7C 9H 8H 3H]
Current rank: 9
Player 3 plays [9H]
Pile: [9H]
Player 0 calls 0
Player 1 calls 10
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [5H KH 5S QC TC 4S 4H 4D 4C 5D 8C TD TS AC QH 8S 8D]
Player 1 hand: [9D 5C TH KS KD JS AS JC 9S 9C 6C QS AH AD 6S 6H 6D 9H]
Player 2 hand: [QD 3D 7S 2D 2C 2S JD JH 3S 3C 7H 7D]
Player 3 hand: [KC 2H 7C 8H 3H]
Current rank: T
Player 0 plays [TC TD TS]
Pile: [TC TD TS]
Player 0 calls 0
Player 1 calls 2
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [5H KH 5S QC 4S 4H 4D 4C 5D 8C AC QH 8S 8D]
Player 1 hand: [9D 5C TH KS KD JS AS JC 9S 9C 6C QS AH AD 6S 6H 6D 9H TC TD TS]
Player 2 hand: [QD 3D 7S 2D 2C 2S JD JH 3S 3C 7H 7D]
Player 3 hand: [KC 2H 7C 8H 3H]
Current rank: J
Player 1 plays [JS JC]
Pile: [JS JC]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 4
Player 3 calls 0
Play was real
Card pile given to Player 2
Player 0 hand: [5H KH 5S QC 4S 4H 4D 4C 5D 8C AC QH 8S 8D]
Player 1 hand: [9D 5C TH KS KD AS 9S 9C 6C QS AH AD 6S 6H 6D 9H TC TD TS]
Player 2 hand: [QD 3D 7S 2D 2C 2S JD JH 3S 3C 7H 7D JS JC]
Player 3 hand: [KC 2H 7C 8H 3H]
Current rank: Q
Player 2 plays [QD]
Pile: [QD]
Player 0 calls 10
Player 1 calls 2
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [5H KH 5S QC 4S 4H 4D 4C 5D 8C AC QH 8S 8D QD]
Player 1 hand: [9D 5C TH KS KD AS 9S 9C 6C QS AH AD 6S 6H 6D 9H TC TD TS]
Player 2 hand: [3D 7S 2D 2C 2S JD JH 3S 3C 7H 7D JS JC]
Player 3 hand: [KC 2H 7C 8H 3H]
Current rank: K
Player 3 plays [KC]
Pile: [KC]
Player 0 calls 2
Player 1 calls 10
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [5H KH 5S QC 4S 4H 4D 4C 5D 8C AC QH 8S 8D QD]
Player 1 hand: [9D 5C TH KS KD AS 9S 9C 6C QS AH AD 6S 6H 6D 9H TC TD TS KC]
Player 2 hand: [3D 7S 2D 2C 2S JD JH 3S 3C 7H 7D JS JC]
Player 3 hand: [2H 7C 8H 3H]
Current rank: A
Player 0 plays [AC]
Pile: [AC]
Player 0 calls 0
Player 1 calls 10
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [5H KH 5S QC 4S 4H 4D 4C 5D 8C QH 8S 8D QD]
Player 1 hand: [9D 5C TH KS KD AS 9S 9C 6C QS AH AD 6S 6H 6D 9H TC TD TS KC AC]
Player 2 hand: [3D 7S 2D 2C 2S JD JH 3S 3C 7H 7D JS JC]
Player 3 hand: [2H 7C 8H 3H]
Current rank: 2
Player 1 plays [9D]
Pile: [9D]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 10
Player 3 calls 2
Play was real
Card pile given to Player 2
Player 0 hand: [5H KH 5S QC 4S 4H 4D 4C 5D 8C QH 8S 8D QD]
Player 1 hand: [5C TH KS KD AS 9S 9C 6C QS AH AD 6S 6H 6D 9H TC TD TS KC AC]
Player 2 hand: [3D 7S 2D 2C 2S JD JH 3S 3C 7H 7D JS JC 9D]
Player 3 hand: [2H 7C 8H 3H]
Current rank: 3
Player 2 plays [3D 3S 3C]
Pile: [3D 3S 3C]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 0
Player 3 calls 2
Play was real
Card pile given to Player 3
Player 0 hand: [5H KH 5S QC 4S 4H 4D 4C 5D 8C QH 8S 8D QD]
Player 1 hand: [5C TH KS KD AS 9S 9C 6C QS AH AD 6S 6H 6D 9H TC TD TS KC AC]
Player 2 hand: [7S 2D 2C 2S JD JH 7H 7D JS JC 9D]
Player 3 hand: [2H 7C 8H 3H 3D 3S 3C]
Current rank: 4
Player 3 plays [2H]
Pile: [2H]
Player 0 calls 10
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [5H KH 5S QC 4S 4H 4D 4C 5D 8C QH 8S 8D QD 2H]
Player 1 hand: [5C TH KS KD AS 9S 9C 6C QS AH AD 6S 6H 6D 9H TC TD TS KC AC]
Player 2 hand: [7S 2D 2C 2S JD JH 7H 7D JS JC 9D]
Player 3 hand: [7C 8H 3H 3D 3S 3C]
Current rank: 5
Player 0 plays [5H 5S 5D]
Pile: [5H 5S 5D]
Player 0 calls 0
Player 1 calls 2
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [KH QC 4S 4H 4D 4C 8C QH 8S 8D QD 2H]
Player 1 hand: [5C TH KS KD AS 9S 9C 6C QS AH AD 6S 6H 6D 9H TC TD TS KC AC 5H 5S 5D]
Player 2 hand: [7S 2D 2C 2S JD JH 7H 7D JS JC 9D]
Player 3 hand: [7C 8H 3H 3D 3S 3C]
Current rank: 6
Player 1 plays [6C 6S 6H 6D]
Pile: [6C 6S 6H 6D]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Current rank: 7
Player 2 plays [7S 7H 7D]
Pile: [6C 6S 6H 6D 7S 7H 7D]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 0
Player 3 calls 2
Play was real
Card pile given to Player 3
Player 0 hand: [KH QC 4S 4H 4D 4C 8C QH 8S 8D QD 2H]
Player 1 hand: [5C TH KS KD AS 9S 9C QS AH AD 9H TC TD TS KC AC 5H 5S 5D]
Player 2 hand: [2D 2C 2S JD JH JS JC 9D]
Player 3 hand: [7C 8H 3H 3D 3S 3C 6C 6S 6H 6D 7S 7H 7D]
Current rank: 8
Player 3 plays [8H]
Pile: [8H]
Player 0 calls 10
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [KH QC 4S 4H 4D 4C 8C QH 8S 8D QD 2H 8H]
Player 1 hand: [5C TH KS KD AS 9S 9C QS AH AD 9H TC TD TS KC AC 5H 5S 5D]
Player 2 hand: [2D 2C 2S JD JH JS JC 9D]
Player 3 hand: [7C 3H 3D 3S 3C 6C 6S 6H 6D 7S 7H 7D]
Current rank: 9
Player 0 plays [KH]
Pile: [KH]
Player 0 calls 0
Player 1 calls 10
Player 2 calls 2
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [QC 4S 4H 4D 4C 8C QH 8S 8D QD 2H 8H]
Player 1 hand: [5C TH KS KD AS 9S 9C QS AH AD 9H TC TD TS KC AC 5H 5S 5D KH]
Player 2 hand: [2D 2C 2S JD JH JS JC 9D]
Player 3 hand: [7C 3H 3D 3S 3C 6C 6S 6H 6D 7S 7H 7D]
Current rank: T
Player 1 plays [TH TC TD TS]
Pile: [TH TC TD TS]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Current rank: J
Player 2 plays [JD JH JS JC]
Pile: [TH TC TD TS JD JH JS JC]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Current rank: Q
Player 3 plays [7C]
Pile: [TH TC TD TS JD JH JS JC 7C]
Player 0 calls 10
Player 1 calls 2
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [QC 4S 4H 4D 4C 8C QH 8S 8D QD 2H 8H TH TC TD TS JD JH JS JC 7C]
Player 1 hand: [5C KS KD AS 9S 9C QS AH AD 9H KC AC 5H 5S 5D KH]
Player 2 hand: [2D 2C 2S 9D]
Player 3 hand: [3H 3D 3S 3C 6C 6S 6H 6D 7S 7H 7D]
Current rank: K
Player 0 plays [QC]
Pile: [QC]
Player 0 calls 0
Player 1 calls 10
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 1
Player 0 hand: [4S 4H 4D 4C 8C QH 8S 8D QD 2H 8H TH TC TD TS JD JH JS JC 7C]
Player 1 hand: [5C KS KD AS 9S 9C QS AH AD 9H KC AC 5H 5S 5D KH QC]
Player 2 hand: [2D 2C 2S 9D]
Player 3 hand: [3H 3D 3S 3C 6C 6S 6H 6D 7S 7H 7D]
Current rank: A
Player 1 plays [AS AH AD AC]
Pile: [AS AH AD AC]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Current rank: 2
Player 2 plays [2D 2C 2S]
Pile: [AS AH AD AC 2D 2C 2S]
Player 0 calls 2
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Play was real
Card pile given to Player 0
Player 0 hand: [4S 4H 4D 4C 8C QH 8S 8D QD 2H 8H TH TC TD TS JD JH JS JC 7C AS AH AD AC 2D 2C 2S]
Player 1 hand: [5C KS KD 9S 9C QS 9H KC 5H 5S 5D KH QC]
Player 2 hand: [9D]
Player 3 hand: [3H 3D 3S 3C 6C 6S 6H 6D 7S 7H 7D]
Current rank: 3
Player 3 plays [3H 3D 3S 3C]
Pile: [3H 3D 3S 3C]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Current rank: 4
Player 0 plays [4S 4H 4D 4C]
Pile: [3H 3D 3S 3C 4S 4H 4D 4C]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Current rank: 5
Player 1 plays [5C 5H 5S 5D]
Pile: [3H 3D 3S 3C 4S 4H 4D 4C 5C 5H 5S 5D]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 0
Player 3 calls 0
Current rank: 6
Player 2 plays [9D]
Pile: [3H 3D 3S 3C 4S 4H 4D 4C 5C 5H 5S 5D 9D]
Player 0 calls 0
Player 1 calls 0
Player 2 calls 0
Player 3 calls 10
Play was real
Card pile given to Player 3
Player 0 hand: [8C QH 8S 8D QD 2H 8H TH TC TD TS JD JH JS JC 7C AS AH AD AC 2D 2C 2S]
Player 1 hand: [KS KD 9S 9C QS 9H KC KH QC]
Player 2 hand: []
Player 3 hand: [6C 6S 6H 6D 7S 7H 7D 3H 3D 3S 3C 4S 4H 4D 4C 5C 5H 5S 5D 9D]
Player 2 wins!
```
