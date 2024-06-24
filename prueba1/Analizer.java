import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PushbackReader;
import analysis.*;
import lexer.Lexer;
import node.Start;
import parser.Parser;

public class Analizer{
    public static void main(String[] args) {
        try{
            Parser p = new Parser(new Lexer(new PushbackReader(new BufferedReader(new FileReader("eje1.html")),1024)));
            Start arbol = p.parse();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}