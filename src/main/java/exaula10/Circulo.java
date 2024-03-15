/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exaula10;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 12/03/24
 * @brief class Circulo
 */
public  class Circulo  extends Figura{
    private double raio;
    public Circulo(String cor, double raio){
    super(cor);
    this.raio = raio;
}
    public Circulo(){
        
    }
    
    public double getRaio(){
        return raio;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    @Override
    public String toString(){
        return "Circulo[raio=" + raio + ",cor= " + super.getcor() +"]";
    }
    
    @Override
    public double area(){
        return raio * 3.14 * 2;
    }
    

}
