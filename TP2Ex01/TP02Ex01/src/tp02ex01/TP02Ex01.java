/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02ex01;
import java.util.Scanner;
/**
 *
 * @author Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP02Ex01 {

    /*
    1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
        Caso contrário solicitar novamente apenas o segundo valor.
    */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num1;
        
        int num2;
        
        System.out.printf("Insira o primeiro número: ");
        num1 = scan.nextInt();
        
        System.out.printf("\nInsira um número maior que o anterior: ");
        num2 = scan.nextInt();
        
        while(num2 <= num1){
            System.out.printf("\n%d é menor que %d, insira um número maior que %d: ", num2, num1, num1);
            num2 = scan.nextInt();
    }
}
}