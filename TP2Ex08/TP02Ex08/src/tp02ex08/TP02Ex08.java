/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02ex08;

import java.util.Scanner;
/**
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP02Ex08 {

    /**
    8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
    digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
    valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
    correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
    colunas. 
     */
    public static void main(String[] args) {
        //declaração de variáveis
        int[][] matriz;
        matriz = new int [3][4];
        int[][] mult;
        mult = new int [3][4];
        
        int contador = 0;
        int x;
        //atribuição de valores
        System.out.println("Insira 12 valores em uma matriz 3x4.");
        Scanner scan= new Scanner(System.in);

        for(int i=0; i<3; ++i){
            for(int j=0; j<4; ++j){
                System.out.print("(" + (i+1) + ":" + (j+1) + "): ");               
                contador = scan.nextInt();
                matriz[i][j] = contador;    
            }
        }
        
        //atribuição de valor multiplicador
        System.out.print("Escolha o valor que deseja utilizar para multiplicar a matriz: ");
        x = scan.nextInt();
        
        for(int i=0; i<3; ++i){
            for(int j=0; j<4; ++j){               
                mult[i][j] =  (matriz[i][j]*x); 
            }
        }
        
        //indicação de valores multiplicados
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(mult[i][j] + " | ");
            }
            System.out.println("");
        }
}
}