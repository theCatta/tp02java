/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02ex11;

import java.util.Scanner;
import Jama.Matrix;

/**
 *
 * @author Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP02Ex11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        
        do{
        System.out.printf("Insira o valor de a da matriz quadrada AxA: ");
        a = scan.nextInt();
        } while(a > 10 || a < 1);
        
        double[][] mt = new double[a][a];
        
        for(int i = 0; i < a; ++i){
            for(int j = 0; j < a; ++j){
                System.out.printf("Insira o número [%d][%d] da matriz: ", i, j);
                mt[i][j] = scan.nextInt();
            }
        }
        
        Matrix matriz = new Matrix(mt);
        
        System.out.print("\nMatriz:\n");
        for(int i = 0; i < a; ++i){
            for(int j = 0; j < a; ++j){
                if(j == 0){
                    System.out.print("|" + mt[i][j]);
                } else if(j == mt.length - 1){
                    System.out.print(mt[i][j] + "|");
                } else{
                    System.out.print(" " + mt[i][j] + " ");
                }
            }
            System.out.print("\n");
        }
                
        System.out.printf("\nDeterminante é: %.2f\n", matriz.det());
    }
}
