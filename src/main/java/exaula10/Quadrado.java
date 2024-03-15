/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exaula10;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 12/03/24
 * @brief class Quadrada
 */
public class Quadrado extends Retangulo {

    static void setCor(String roxo) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
 
    }

    static void setLdo1(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Quadrado(){
        super();
    }
      public Quadrado(String cor, double lado1, double lado2){
          super(cor,lado1,lado2);
      }      
      public Quadrado(String cor, double lado){
         super.setLado1(lado);
         super.setcor(cor);
      }
      @Override
      public double area(){
          return this.getLado1() * this.getLado1();
      }
      
      @Override
      public String toString(){
          return "Quadrado[area ()=" + area() + ", cor=" + super.getcor() + "]";
      }

}
