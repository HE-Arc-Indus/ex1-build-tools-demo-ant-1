# Serie2

Programme simple fait avec un �diteur de texte
* MesPersonnes (main)
* Personne

## Java
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

