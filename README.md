# Serie2

##ANT

##Arborescence

|build.xml
|-bin
|--business   Personne.class
|--main       MesPersonnes.class
|-exe         MesPersonnes.jar
|-src
|--business   Personne.java
|--main       MesPersonnes.java
|build.xml

## Java
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

