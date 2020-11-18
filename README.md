# AL40 - Architecture et qualité logicielle : Pokemon
## Auteurs 

DE SCHIETERE Mathias 15154 

VANDERMIES Charles 15123 

 

## Description 

Cette application ludique a pour objectif de simuler un simple combat entre deux Pokémons possédant leurs propres statistiques et type. 

Basée sur le modèle Builder (design pattern) l'application permettra de créer deux instances de Pokémons possédant un nom, des statistiques particulières (points de vie, puissance d'attaque, défense, vitesse) et un type afin de les faire combattre ensembles. 

L’application sera un jeu textuel accessible via les lignes de commande. 



## Contraintes 

Le programme sera écrit en Java et exécuté sur IntelliJ. Ce dernier nous permettra notamment de mettre en place des tests unitaires. 

Le développement du jeu suivra une stratégie MVP “Minimum Viable Product”. 

 

## Documentation 

La documentation sera faite en commentaire dans le code et dans ce fichier README (qui sera amené à évoluer). 

### Diagramme

Application basée sur le design pattern builder.

![alt text](https://github.com/CVandermies/Architecture_Pokemon/blob/master/docs/diagram.jpg?raw=true)

### Tableau des types

Le type du Pokemon, ses forces et faiblesses seront basées sur ce tableau de la première génération (15 types) :

![alt text](https://github.com/CVandermies/Architecture_Pokemon/blob/master/docs/TypeAffinities.png?raw=true)

## Critères de qualité 

### Efficacité 

... 

 

### Évolutivité 

... 

 

### Facilité d'utilisation 

... 

 

### Maintenabilité 

… 

 

## Répartition 

Mathias :  
- Combats (Fight)
- Implémentation des règles du jeu (ConcreteType, TypeBuilder)

Charles :  
- Build des pokemons (ConcretePokemon, PokemonBuilder, Stats)
- Tests

 

 

 
