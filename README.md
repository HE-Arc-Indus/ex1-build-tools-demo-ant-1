# Serie2 - Demo ANT

## Arborescence du projet MesPersonnes
```
|build.xml
|-bin
|--business   Personne.class
|--main       MesPersonnes.class
|-exe         MesPersonnes.jar
|-src
|--business   Personne.java
|--main       MesPersonnes.java
|build.xml
```

## Commandes java utilisées pour compiler le projet en ligne de commandes
```
--compiler depuis dossier racine
javac -sourcepath src -d bin\ src\main\MesPersonnes.java

--exécuter depuis dossier racine
java -cp bin main.MesPersonnes

--création MonManifest
echo Main-Class: main.MesPersonnes>MonManifest

--création fichier jar
jar cfm exe\MesPersonnes.jar MonManifest -C bin .

--exécuter projet jar
java -jar exe\MesPersonnes.jar

```

## Apache ANT
Ant est un projet open source de la fondation Apache qui permet d'automatiser des tâches répétitives et sans valeur ajoutée dans le cadre du développement logiciel. 
Ant est développé en Java et se base sur un fichier XML qui contient les tâches qui devront être exécutées.

### Installation ANT [Install - Apache.org](http://ant.apache.org/manual/install.html)
1. Télécharger Ant 
2. Décompresser le fichier (package) téléchargé dans un dossier
3. Ajouter le chemin du dossier décompressé dans une variable d'environnement ANT_HOME  
***Pour tester si la version installée fonctionne correctement, lancer la commande : ANT -version***

Chaque fichier XML de configuration contient un projet et au moins un cible par défaut. Chaque élément cible est constitué d'une ou plusieurs tâches (commandes) et est référencé par un attribut unique qui peut être être appelé par d'autres tâches.

### Utilisation de ANT [Using - Apache.org](https://ant.apache.org/manual/using.html)

#### Projet (projects)
Un projet contient trois attributs.     
name : ***nom du projet***     
default : ***cible utilisée par défault si rien n'est spécifié***     
basedir : ***dossier racine de base utilisé pour l'exécution des commandes***   

#### Cibles (targets)
Une cible est constituée d'une ou plusieurs tâches et est référencée par un attribut unique. Cet attribut permet d'appeler une cible précisemment lors de l'exécution et/ou de gérer des dépendences entre les cibles (ordre d'exécution).

#### Tâches (tasks)
Une tâche est une partie de code qui peut être executée.
Les tâches peuvent avoir plusieurs propriétés renseignées dans des attributs XML.
```
<name attribute1="value1" attribute2="value2" ... />
```

#### Propriétés (properties)
Les propriétés permettent de créer des raccourcis contenant des chaines de caractères utilisées plusieurs fois dans un fichier de configuration XML.
Une proprité est constituée d'un nom et d'une valeur. Elle permet par exemple de spécifié les chemins du dossier source et destination et de les réutiliser dans les commandes.
```
<property name="dist" location="dist"/>
<property name="src" location="src"/>
<javac srcdir="${src}" destdir="${build}"/>
```

## Sources
* [Apache.org](http://ant.apache.org/)
* [Developpez.com](http://skebir.developpez.com/tutoriels/java/ant/)

#### Auteurs
Adrien Emeri, Nicolas Sutterlet, Hugo Gonçalves, Valentin Du Bois 



