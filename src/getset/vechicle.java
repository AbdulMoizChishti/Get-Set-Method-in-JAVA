/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getset;

/**
 *
 * @author Abdul Moiz Chishti
 */
public class vechicle {
    
   int mileage; String color; int model; // global variable
    
   public void getMeth(int mileage, String color, int model){ // local variable
       
      this.mileage=mileage;
      this.color=color;
      this.model=model;
    
   } 
   
   
   
   public void setMeth(){
       System.out.println("Color= "+color);
       System.out.println("model= "+model);
       System.out.println("Mileage= "+mileage);
  }
    
    
    
    
}
