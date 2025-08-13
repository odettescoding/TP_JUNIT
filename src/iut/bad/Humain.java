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
    
}
