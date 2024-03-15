/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exaula10;
import java.util.Scanner;
/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 12/03/24
 * @brief class Teste
 */
public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* Quadrado  quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo("Azul", 5,12) {};
        Circulo circulo = new Circulo("Verde",10.2) {};
        Retangulo retangulo = new  Retangulo ("Rosa ", 32,12) {};
        
        Quadrado.setCor("ROXO");
        Quadrado.setLdo1(4);
        
        
        System.out.println("quadrado");
        System.out.println("triangulo");
        System.out.println("circulo");
        System.out.println("retangulo");*/
       
       String cor;
       double base,altura;
       int index = 0; 
       
        System.out.println("Escolha uma figura: ");
        System.out.println("1- Quadrado \n "
                + "2- Triangulo \n"
        +"3-Retangulo\n"+ "4-Circulo");
        
        index = scanner.nextInt();
        switch (index) {
            case 1:
                System.out.println("INFORME O LADO DO QUADRADO");
                base = scanner.nextDouble();
                System.out.println("INFORME A COR  DO QUADRADO");
                cor = scanner.next();
                Quadrado quadrado = new Quadrado(cor, base);
                System.out.println(quadrado);
                
                break;
            case 2:
                System.out.println("INFORME O LADO DO TRIANGULO");
                base = scanner.nextDouble();
                System.out.println("INFORME A COR  DO TRIANGULO");
                cor = scanner.next();
                System.out.println("INFORME A ALTURA   DO TRIANGULO");
                altura = scanner.nextInt();
                Triangulo triangulo = new Triangulo(cor,base,altura);
                System.out.println(triangulo);
                break;
                
            case 3:
                System.out.println("INFORME O LADO DO RETANGULO");
                base = scanner.nextDouble();
                System.out.println("INFORME A COR  DO RETANGULO");
                cor = scanner.next();
                System.out.println("INFORME A ALTURA   DO RETANGULO");
                altura = scanner.nextInt();
                Retangulo retangulo = new Retangulo(cor,base,altura);
                System.out.println(retangulo);
                break;
                
                  case 4:
               
                System.out.println("INFORME A COR  DO CIRCULO");
                cor = scanner.next();
                System.out.println("INFORME O RAIO DO CIRCULO");
                altura = scanner.nextInt();
                Circulo circulo  = new Circulo (cor,altura);
                System.out.println(circulo);
                break;
        }
       
       
    }
}
