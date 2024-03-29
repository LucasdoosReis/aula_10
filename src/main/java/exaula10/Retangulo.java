/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exaula10;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 12/03/24
 * @brief class Retangulo
 */
public  class Retangulo  extends Figura{
private double lado1;
private double lado2;

 @Override
 public double area(){
     return this.lado1 = this.lado2;
}
 
 public Retangulo(String cor, double lado1, double lado2){
     super(cor);
     this.lado1 = lado1;
     this.lado2 = lado2;
 }
 
 public Retangulo(){
     
 }
 
 public double getLado1(){
     return lado1;
 }
 public void setLado1(double lado1){
     this.lado1= lado1;
 }
 
 
  public double getLado2(){
     return lado2;
 }
 public void setLado2(double lado2){
     this.lado2= lado2;
 }
 
 
 
 
 @Override
 public String toString(){
     return "Retangulo[lado1=" +lado1+",lado2= "+lado2+",cor= " + super.getcor()+"]";
        
    }
}
