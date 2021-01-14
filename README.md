# AL40 - Architecture et qualité logicielle : Pokemon
## Auteurs 

DE SCHIETERE Mathias 15154 

VANDERMIES Charles 15123 

 

## Description 

Cette application ludique simule un combat entre deux Pokémons à la fois possédant leurs propres statistiques et type. Chaque joueur peut constituer une équipe allant de 1 à 6 Pokemons. Ce jeu textuel se joue dans l'invité de commande.

Basée sur le modèle Builder (design pattern) l'application permet de créer deux instances de Pokémons possédant un nom, des statistiques particulières (points de vie, puissance d'attaque, défense, vitesse) et un type afin de les faire combattre ensembles. 




## Contraintes 

Le programme est écrit en Java sur l'IDE IntelliJ. Ce dernier nous permet notamment de mettre en place des tests unitaires. 

Le développement du jeu suit une stratégie MVP “Minimum Viable Product”. 

 

## Documentation 

La documentation se trouve en commentaire dans le code et dans ce fichier README. 

### Diagramme

Application basée sur le design pattern builder.

![alt text](https://github.com/CVandermies/Architecture_Pokemon/blob/master/docs/parser.png?raw=true)

### Tableau des types

Le type du Pokemon, ses forces et faiblesses seront basées sur ce tableau de la première génération (15 types) :

![alt text](https://github.com/CVandermies/Architecture_Pokemon/blob/master/docs/TypeAffinities.png?raw=true)

##Critères de qualité

###Efficacité

Chaque attaque doit s'effectuer instantanément, on ne veut pas de temps de chargement intempestif pour que le programme garde son aspect ludique. Nous avons fait en sorte que le joueur ne ressente pas de frustration liée aux temps de chargement ou à un éventuel bug s'il sortait du contexte du code en tapant des valeurs non admissibles. 

###Evolutivité

Il est aisé et rapide de comprendre le code pour le faire évoluer. Si l'utilisateur souhaite rajouter des types de pokemon dans le futur, il trouvera rapidement le moyen de le faire. Nous avons fait attention à éviter la redondance de code pour faciliter les futures modifications.

### Facilité d'utilisation 

Il est important que le jeu soit simple d'emploi. Les instructions sont expliquées au fur et à mesure de la partie, le "mode d'emploi" est intégré au jeu. 
Le joueur a accès au pokédex, une liste des Pokemons disponibles où sont reprises leurs caractéristiques. Il ne doit donc pas hardcoder ces valeurs, simplement choisir un pokemon dans la liste.

 

## Répartition 

Mathias :  
- Combats (Fight)
- Implémentation des règles du jeu (ConcreteType, TypeBuilder)

Charles :  
- Build des pokemons (ConcretePokemon, PokemonBuilder, Stats)
- Tests

 

 

 
