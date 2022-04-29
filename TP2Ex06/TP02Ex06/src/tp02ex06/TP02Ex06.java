/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02ex06;

import java.util.Scanner;
/**
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP02Ex06 {

    /**
    6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela. 
     */
    public static void main(String[] args) {
        //declaração de variaveis
        String[][] matriz;
        matriz = new String [2][3];
        
        String nameholder;
        
        //atribuição de valores
        System.out.println("Insira 6 nomes em uma matriz 2x3.");
        Scanner scan= new Scanner(System.in);
        
        for(int i=0; i<2; ++i){
            for(int j=0; j<3; ++j){
                System.out.print("(" + (i+1) + ":" + (j+1) + "): ");               
                nameholder = scan.next();
                matriz[i][j] = nameholder;    
            }
        }
        
        //indicação de valores
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
        
    }
    
}
