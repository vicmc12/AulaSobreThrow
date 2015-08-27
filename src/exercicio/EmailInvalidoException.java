/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author 31381243
 */
public class EmailInvalidoException extends Exception {
          public EmailInvalidoException() {}

      //Constructor that accepts a message
      public EmailInvalidoException(String message)
      {
         super(message);
      }
}
