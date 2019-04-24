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
public class vegetables {
     private  int VegetableId;
    private  String Name_of_the_Vegetable;
    
    public vegetables(int VegetableId,String Name_of_the_Vegetable){
    
    this.VegetableId=VegetableId;
    this.Name_of_the_Vegetable=Name_of_the_Vegetable;
     }
    
    public int getVegetableId(){
    return VegetableId;
    }
    public String getName_of_the_Vegetable(){
    return Name_of_the_Vegetable;
    }  
}
