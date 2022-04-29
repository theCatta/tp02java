/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02ex03;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP02Ex03 {

    /*
    3. Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
        números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
        satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
        digitação dos “N” valores, exibir:
            a. O maior valor;
            b. O menor valor;
            c. A soma dos valores;
            d. A média aritmética dos valores;
            e. A porcentagem de valores que são positivos;
            f. A porcentagem de valores negativos;
    */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int qtd, num, sum = 0, min = 0, max = 0;
        double avg = 0, posPer = 0, negPer = 0;
        System.out.printf("Quantos números serão digitados: ");
        qtd = scan.nextInt();
        
        
        int[] nums = new int[qtd];
    
        for(int i = 0; i < qtd; ++i){
            System.out.printf("Insira o %d° número: ", i+1);
            num = scan.nextInt();
            
            sum += num;
            avg = sum/qtd;
            
            nums[i] = num;
        }
        
        for(int i = 0; i < qtd; ++i){
           if(i == 0){
               min = nums[i];
               max = nums[i];
           } else if (nums[i] < min){
               min = nums[i];
           } else if (nums[i] > max){
               max = nums[i];
           }
           
           if(nums[i] >= 0){
               posPer++;
           } else if(nums[i] < 0){
               negPer++;
           }
        }
        
        posPer = (posPer/qtd) * 100;
        negPer = (negPer/qtd) * 100;
        
        //define formato decimal
        DecimalFormat dec = new DecimalFormat();
        dec.setMaximumFractionDigits(2);
        
        System.out.printf("\nO maior valor é: %d\nO menor valor é: %d", max, min);
        System.out.printf("\n\nA soma dos valores é: %d\nA média dos valores é de: %s", sum, dec.format(avg));
        System.out.printf("\n\nA porcentagem de número positivos é: %.2f%%\nA porcentagem de números negativos é: %.2f%%", posPer, negPer);
    }
}