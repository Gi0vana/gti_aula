/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author teclab
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        
        System.out.println("Qual será o tamanho da matriz?");
        int tam = sc.nextInt();
        
        int mat [][]= new int [tam][tam];
        
        
        System.out.println("Insira os valores da matriz:");
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j<mat.length; j++){
                System.out.print("["+i+"]["+j+"]");
                mat [i][j]= sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("VALORES POSITIVOS");

        int soma = 0; 

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++){
                if (mat[i][j] >  0)
                     soma += mat[i][j];
                }  
                
        }
        System.out.println("Soma de todos os números positivos: "+soma);
        System.out.println();    
              
        System.out.print("Indique uma linha");
        int linha = sc.nextInt();
        System.out.println("VALORES DA LINHA "+linha);
            for (int i = 0; i < mat.length; i++){ 
                System.out.println("Valor da matriz na posição ["+linha+"]["+i+"]:"+ mat[linha][i]);
                  
              }
        System.out.println("");
        System.out.print("Indique uma coluna");
        int coluna = sc.nextInt();
        System.out.println("VALORES DA COLUNA "+coluna);
            for (int i = 0; i < mat.length; i++){
                System.out.println("Valor da matriz na posição ["+i+"]["+coluna+"]:"+ mat[i][coluna]);
                  
              }
        System.out.println("");
        System.out.println("VALORES DA DIAGONAL");
            for (int i = 0; i < mat.length; i++){
                System.out.println("Valor da matriz na posição ["+i+"]["+i+"]:"+ mat[i][i]);
                  
              }
         
        System.out.println("");  
        System.out.println("VALORES NEGATIVOS");
            for (int i = 0; i< mat.length; i++){
                for (int j = 0; j<mat.length; j++){
                    if (mat[i][j] < 0)
                            mat[i][j] =   (mat[i][j]);
                }  
        }
            for ( int i = 0; i< mat.length; i++){
                for ( int j = 0; j < mat.length; j++) {
                      System.out.print(mat[i][j]+" ");
                  } 
                    
                    System.out.println(" ");
                }




// TODO code application logic here
    }
    
    
    
    
}
