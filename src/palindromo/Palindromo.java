/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author 082170019
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan  = new Scanner( System.in);   
    
            
            
         
                 System.out.println("Digite uma palavra para verificar se é palindromo !");
                String palavra = scan.nextLine();
                
               String PalavraAoContrario = "";
               
               for(int x = palavra.length();x>=0;x--){
                  
                   PalavraAoContrario = PalavraAoContrario + palavra.charAt(x);
               }
               
               if(PalavraAoContrario == palavra){
                    System.out.println(" é palindromo !");
               }
               else{
                     System.out.println("não é palindromo !");
               }
    }
    
}
