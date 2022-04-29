/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02ex04;

import java.util.Scanner;
/**
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP02Ex04 {

    /**
    4. Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela
     */
    public static void main(String[] args) {
        //declaração de variáveis
        int[][] matriz;
        matriz = new int [2][3];
        
        int contador = 0;
        
        //atribuição de valores
        System.out.println("Insira 6 valores em uma matriz 2x3.");
        Scanner scan= new Scanner(System.in);

        for(int i=0; i<2; ++i){
            for(int j=0; j<3; ++j){
                System.out.print("(" + (i+1) + ":" + (j+1) + "): ");               
                contador = scan.nextInt();
                matriz[i][j] = contador;    
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
