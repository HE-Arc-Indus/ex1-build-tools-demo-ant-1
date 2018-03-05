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

## Commandes java utilis�es pour compiler le projet en ligne de commandes
```
--compiler depuis dossier racine
javac -sourcepath src -d bin\ src\main\MesPersonnes.java

--ex�cuter depuis dossier racine
java -cp bin main.MesPersonnes

--cr�ation MonManifest
echo Main-Class: main.MesPersonnes>MonManifest

--cr�ation fichier jar
jar cfm exe\MesPersonnes.jar MonManifest -C bin .

--ex�cuter projet jar
java -jar exe\MesPersonnes.jar

```

## Apache ANT
Ant est un projet open source de la fondation Apache qui permet d'automatiser des t�ches r�p�titives et sans valeur ajout�e dans le cadre du d�veloppement logiciel. 
Ant est d�velopp� en Java et se base sur un fichier XML qui contient les t�ches qui devront �tre ex�cut�es.

### Installation ANT [Install - Apache.org](http://ant.apache.org/manual/install.html)
1. D�compresser le fichier t�l�charg� dans un dossier   
2. D�finir une variable d�environnement ANT_HOME pour stocker le chemin vers le dossier racine de Ant   
3. Ajouter %ANT_HOME%/bin au PATH Windows  
_Pour tester si la version install�e fonctionne correctement, lancer la commande : ANT -version_

### Utilisation de ANT [Using - Apache.org](https://ant.apache.org/manual/using.html)

Chaque fichier XML de configuration contient un projet et au moins une cible par d�faut. Chaque �l�ment cible est constitu� d'une ou plusieurs t�ches (commandes) et est r�f�renc� par un attribut unique qui peut �tre �tre appel� par d'autres t�ches.

#### Projet (projects)
Un projet contient trois attributs.     
name : _nom du projet_     
default : _cible utilis�e par d�fault si rien n'est sp�cifi�_     
basedir : _dossier racine de base utilis� pour l'ex�cution des commandes_   

#### Cibles (targets)
Une cible est constitu�e d'une ou plusieurs t�ches et est r�f�renc�e par un attribut unique. Cet attribut permet d'appeler une cible pr�cisemment lors de l'ex�cution et/ou de g�rer des d�pendences entre les cibles (ordre d'ex�cution).

#### T�ches (tasks)
Une t�che est une partie de code qui peut �tre execut�e.
Les t�ches peuvent avoir plusieurs propri�t�s renseign�es dans des attributs XML.
```
<name attribute1="value1" attribute2="value2" ... />
```

#### Propri�t�s (properties)
Les propri�t�s permettent de cr�er des raccourcis contenant des chaines de caract�res utilis�es plusieurs fois dans un fichier de configuration XML.
Une proprit� est constitu�e d'un nom et d'une valeur. Elle permet par exemple de sp�cifi� les chemins du dossier source et destination et de les r�utiliser dans les commandes.
```
<property name="dist" location="dist"/>
<property name="src" location="src"/>
<javac srcdir="${src}" destdir="${build}"/>
```

## Sources
* [Apache.org](http://ant.apache.org/)
* [Developpez.com](http://skebir.developpez.com/tutoriels/java/ant/)

#### Auteurs
Adrien Emeri, Nicolas Sutterlet, Hugo Gon�alves, Valentin Du Bois 



