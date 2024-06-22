/*En este ejemplo se imprime el �rbol en orden postfijo. Adem�s se muestra el �rbol
 *de manera gr�fica con las clases display.
 *Nota: Al ejecutarlo por consola, despues de ingresar la expresion aritmetica ingresar
 *Enter, luego Ctrl+Z y finalmente Enter.
 */ 

package postfix;

import postfix.analysis.*;
import postfix.parser.*;
import postfix.lexer.*;
import postfix.node.*;
import java.io.*;

public class Analizer {
  
  public static void main(String[] arguments) {
    try { 
      System.out.println ("Ingrese la expresion aritmetica:");
      //Create a Parser instance.
      Parser p =
         new Parser(
              new Lexer(
                   new PushbackReader(
                        new InputStreamReader(System.in),1024)));
      
      //Parse the input.
      Start tree = p.parse();
      
      //tree.apply(new ASTDisplay());
      //tree.apply(new ASTPrinter()); 
            
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }
}