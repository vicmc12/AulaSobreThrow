/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Scanner;

/**
 *
 * @author 31381243
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                Scanner sc = new Scanner(System.in);
                String nome = "";
                String cpfString = "";
                String email ="";
                int valido = 1;
         do{
                try{
        valido = 1;
        System.out.print("Digite seu nome: ");
         nome = sc.nextLine();
     if(nome.isEmpty())
     {
         valido =0;
          throw new VazioException();
     }
 }
 catch(VazioException ex)
 {
      System.out.println("Você digitou um nome vazio");
 }
         }while(valido!=1);
         do{
             valido = 1;
          try{
        System.out.print("Digite seu CPF: ");   
         cpfString = sc.nextLine();
     if(cpfString.length()!=11)
     {
         valido =0;
          throw new CpfInvalidoException();
     }
 }
 catch(CpfInvalidoException ex)
 {
      System.out.println("Você não digitou um CPF válido");
 }
          }while(valido!=1);
         do{
             valido = 1;
          try{
        System.out.print("Digite seu email: ");
         email = sc.nextLine();
     if(!email.contains("@"))
     {
         valido =0;
          throw new EmailInvalidoException();
     }
 }
 catch(EmailInvalidoException ex)
 {
      System.out.println("Você não digitou um email válido");
 }
          }while(valido!=1);
            
        
        
        
        Usuario usuario = new Usuario(nome, cpfString, email);
        System.out.println(usuario.toString());
    }
    
}