On peut remarquer plusieurs problèmes dans l'implémentation faite par la Team Rocket :

## La génération des statistiques
### La version de la Team Rocket
On remarque que pour générer aléatoirement les valeurs de certaines statistiques (comme la défense ou l'attaque), une boucle allant de 0 à 999 999 est lancée.
Dans cette boucle, on ajoute à chaque fois à la variable *total* un nombre égal à 0 ou 1.
Enfin, quand la boucle est finie, on divise cette valeur par 10 000 afin d'obtenir une valeur comprise entre 0 et 100 (car 1 000 000/10 000 = 100)
### Une alternative
Une meilleure façon de faire est de tout simplement générer une valeur comprise entre 0 et 100 pour ces caractéristiques.
Cela permet de gagner du temps et nous évite d'utiliser une boucle for.

## Un pikachu trop puissant ?
Nous venons de voir que les statistiques des pokemons étaient, pour certaines, comprises entre 0 et 100. Hors, le pikachu de Sacha possède des statistiques à 1000 (attaque, défense, endurance)
(Peut-être est-ce pour ça qu'il refuse d'évoluer ? Mystère...)
![Pika](https://www.pokepedia.fr/images/thumb/f/f2/Pikachu_imitant_Sacha.png/300px-Pikachu_imitant_Sacha.png)

## Des pokemons manquent à l'appel...
L'application doit pouvoir créer les 151 premiers pokemon, mais la Team Rocket n'en connait que ... 3 ! (Le pikachu de Sacha, Missingno et Bulbizarre)
De plus, si l'on essaie de créer un pokemon avec un id différent des 3 pokemon connus, ce pokemon devient...un Missingno !
(Pas super pratique si vous voulez mon avis)
![Missingno](https://dailygeekshow.com/wp-content/uploads/sites/2/2016/07/missingno-pokemon.jpg)
