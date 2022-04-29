/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02ex02;

import java.util.Scanner;
/**
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP02Ex02 {

    /**
    2. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
       erro, se necessário. Após a digitação, exibir:
    a. O maior valor;
    b. A soma dos valores;
    c. A média aritmética dos valores.

     */
    public static void main(String[] args) {
        //declaração de variaveis
        int[] valores;
        valores = new int[10];
        
        int contador;
        
        //requisição de números inteiros
        System.out.println("Insira 10 valores positivos.");
        Scanner scan= new Scanner(System.in);
        
        //atribuição de valores
        for(int i=0; i<10; i++){
            System.out.print("Valor número " + (i+1) + ": ");
            contador = scan.nextInt();
            while(contador < 0){
                System.out.println("INSIRA UM VALOR POSITIVO");
                contador = scan.nextInt();
            }valores[i] = contador;
        }
        System.out.println("Valores inseridos com sucesso!");
        
        //indicação de valores
        for(int i=0; i<10; i++){
            System.out.print(valores[i] + ". ");
        }
        System.out.println("");
        
        //Calculo de maior valor
        int maximo = valores[0];
        for(int i=0; i<10; i++){
            if(valores[i] > maximo){
                maximo = valores[i];
            }
        }
        System.out.println("O maior valor é: " + maximo);
        
        //Soma dos valores
        int soma = 0;
        for(int i=0; i<10; i++){
            soma += valores[i];
        }
        System.out.println("A soma dos valores é: " + soma);
        
        //media dos valores
        int media = soma/10;
        System.out.println("A media dos valores é: " + media);
    }
    
}
