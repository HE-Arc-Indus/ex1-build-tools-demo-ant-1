# Serie2

Programme simple fait avec un éditeur de texte
* MesPersonnes (main)
* Personne

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

