/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iut.bad;

/**
 *
 * @author Asus
 */
public class Humain {
    protected String nom;
    protected String prenom;
    protected int age;
    public Humain(String nom, String prenom,int age){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }
    public void details()
    {
        System.out.println("Nom :"+ this.nom +"Prenom : "+this.prenom +"Age: "+ this.age);
    }
    
}
