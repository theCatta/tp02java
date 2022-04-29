/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02ex05;

import java.util.Scanner;
/**
 *
 * @author Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP02Ex05 {

    /*
    5. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 3, b = 2;
        int[][] mt = new int[a][b];
        
        for(int i = 0; i < a; ++i){
            for(int j = 0; j < b; ++j){
                System.out.printf("Insira o número [%d][%d] da matriz: ", i, j);
                mt[i][j] = scan.nextInt();
            }
        }
        
        for(int i = 0; i < a; ++i){
            for(int j = 0; j < b; ++j){
                System.out.print("|" + mt[i][j] + "|");
            }
            System.out.print("\n");
        }
    }
}

