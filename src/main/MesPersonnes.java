package main;

import business.Personne;

public class MesPersonnes {
    
    public static void main(String[] args) {
        
        Personne p1 = new Personne("Trump", "Donald");
        Personne p2 = new Personne("Levert", "Albert");
        
        System.out.println(p1.sePresenter());
        System.out.println(p2.sePresenter());
        
    }
    
}
