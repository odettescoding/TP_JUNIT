/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iut.bad;

/**
 *
 * @author Asus
 */
public class Femme extends Humain{
    //String nom;
    //String prenom;
    //int age;
    public Femme(String nom,String prenom,int age){
        //this.nom=nom;
        //this.prenom=prenom;
        //this.age=age;

        super(nom,prenom,age);
        
}
    public static void main(String[] args) {
        Homme h = new Homme("Andry", "Rakoto", 25);
        Femme f = new Femme("Soa", "Rasoanaivo", 22);
        f.ami(h);
    }
}
