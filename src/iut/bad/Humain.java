/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iut.bad;

/**
 *
 * @author Asus
 */

public class Humain implements Consommation {
    String nom;
    String prenom;
    int age;
    public Humain(String nom, String prenom,int age){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }
    public void details()
    {
        System.out.println(toString());
    }
    @Override
    public String toString(){
        return "Nom: "+ nom+ ",Prenom: "+prenom+" age:"+age;
    }
 
    @Override
    public void manger(){
        
    }
 
    @Override
    public void boire(){
        
    }
    public void ami(Humain h) {
        ami(h, 100);
    
    }
   
    public void ami(Humain h, int jours) {
        System.out.println(this.nom + " est ami avec " + h.nom + " pendant " + jours + " jours.");
    }
}
