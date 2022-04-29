/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02ex11;

import java.util.Scanner;

/**
 *
 * @author gabriel Ferreira de Souza
 * Guilherme FErreira Santos
 */
public class TP02Ex11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0, dt = 0;
        
        do{
        System.out.printf("Insira o valor de a da matriz quadrada AxA: ");
        a = scan.nextInt();
        } while(a > 10);
        
        int[][] mt = new int[a][a];
        
        for(int i = 0; i < a; ++i){
            for(int j = 0; j < a; ++j){
                System.out.printf("Insira o número [%d][%d] da matriz: ", i, j);
                mt[i][j] = scan.nextInt();
            }
        }
        
        
        if(a == 1){
            dt = mt[0][0];
        }
        int temp[][] = new int[a][a];
        int multiplicador = 1;
        
        for(int f = 0; f < a; ++f){
            int g = 0, d = 0;
            for(int i = 0; i < a; ++i){
                for(int j = 0; j < a; ++a){
                    if(i != 0 && j != f){
                        temp[g][d++] = mt[i][j];
                        if(d == a - 1){
                            d = 0;
                            g++;
                        }
                    }
                }
            }
            dt += multiplicador * mt[0][f] * (a-1);
            multiplicador = -multiplicador;
        }
        
        System.out.print("\nMatriz:\n");
        for(int i = 0; i < a; ++i){
            for(int j = 0; j < a; ++j){
                //mt[i][j] = mt[i][j] * mult;
                System.out.print("|" + mt[i][j] + "|");
            }
            System.out.print("\n");
        }
        
        System.out.printf("\nDeterminante: %d\n", dt);
    }
}
