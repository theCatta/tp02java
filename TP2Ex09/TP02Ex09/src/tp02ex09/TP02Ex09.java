/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02ex09;

import java.util.Scanner;

/**
 *
 * @author Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP02Ex09 {
    /*
    9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
        sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
        elementos, calcular e exibir a matriz transposta.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 0;
        
        do{
        System.out.printf("Insira o valor de a da matriz AxB: ");
        a = scan.nextInt();
        } while(a > 10);
        
        do{
        System.out.printf("Insira o valor de b da matriz AxB: ");
        b = scan.nextInt();
        } while(b > 10);
        
        
        
        int[][] mt = new int[a][b];
        
        for(int i = 0; i < a; ++i){
            for(int j = 0; j < b; ++j){
                System.out.printf("Insira o número [%d][%d] da matriz: ", i, j);
                mt[i][j] = scan.nextInt();
            }
        }
        
        System.out.print("\nMatriz:\n");
        for(int i = 0; i < a; ++i){
            for(int j = 0; j < b; ++j){
                //mt[i][j] = mt[i][j] * mult;
                System.out.print("|" + mt[i][j] + "|");
            }
            System.out.print("\n");
        }
        
        int[][] t = new int[b][a];
        
        System.out.print("\nTransposta:\n");
        for(int i = 0; i < b; ++i){
            for(int j = 0; j < a; ++j){
                t[i][j] = mt[j][i];
                System.out.print("|" + t[i][j] + "|");
            }
            System.out.print("\n");
        }
    }
}
