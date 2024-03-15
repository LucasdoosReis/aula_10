/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exaula10;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 12/03/24
 * @brief class Figura
 */
public abstract class Figura {
   private String cor;
    public Figura(){
}
    
  public Figura(String cor ){
      super();
      this.cor = cor;
  }  
  
  public String getcor(){
      return cor;
  }
  
  public void setcor(String cor){
      this.cor =cor;
  }
  
  @Override
  public String toString(){
      return "FIgura [cor=" +cor+"]";
  }
  public abstract double area();
    
}

