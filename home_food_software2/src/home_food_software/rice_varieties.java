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
public class rice_varieties {
    private  int RiceId;
    private  String Name_of_the_Rice;
    
    public rice_varieties(int RiceId,String Name_of_the_Rice){
    
    this.RiceId=RiceId;
    this.Name_of_the_Rice=Name_of_the_Rice;
     }
    
    public int getRiceId(){
    return RiceId;
    }
    public String getName_of_the_Rice(){
    return Name_of_the_Rice;
    }  
    
}
