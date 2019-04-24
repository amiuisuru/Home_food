/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_food_software;

/**
 *
 * @author isuru udana
 */
public class dessert {
     private  int DessertId  ;
    private  String Name_of_the_Dessert;
    
    public dessert(int DessertId  ,String Name_of_the_Dessert){
    
    this.DessertId  =DessertId ;
    this.Name_of_the_Dessert=Name_of_the_Dessert;
     }
    
    public int getDessertId  (){
    return DessertId  ;
    }
    public String getName_of_the_Dessert(){
    return Name_of_the_Dessert;
    }  
}
