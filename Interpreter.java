package postfix;

import postfix.analysis.*;
import postfix.node.*;
import java.util.Stack;

class Interpreter extends DepthFirstAdapter{
  
  public Stack pila = new Stack<Integer>(); 
  
  public void caseTNumber(TNumber node){
    //Cuando encontremos un numero, lo imprimimos
    //System.out.print(node);
    int n= Integer.parseInt(node.getText());
    pila.push(new Integer(n));
  }
    
  public void outAPlusExpr(APlusExpr node){
    //Al salir de [plus] en Expr, imprimimos el signo +
    //System.out.print(node.getPlus());
    int a= ((Integer)pila.pop()).intValue();
    int b= ((Integer)pila.pop()).intValue();
    int c= a + b;
    pila.push(new Integer(c));
  }
  
  public void outAMinusExpr(AMinusExpr node){
    //Al salir de [minus] en Expr, imprimimos el signo -
    //System.out.print(node.getMinus());
    int a= ((Integer)pila.pop()).intValue();
    int b= ((Integer)pila.pop()).intValue();
    int c= b - a;
    pila.push(new Integer(c));
  }
  
  public void outAMultFactor(AMultFactor node){
    //Al salir de [mult] en Factor, imprimimos asterisco
    //System.out.print(node.getMult());
    int a= ((Integer)pila.pop()).intValue();
    int b= ((Integer)pila.pop()).intValue();
    int c= a * b;
    pila.push(new Integer(c));
  }
  
  public void outADivFactor(ADivFactor node){
    //Al salir de [div] en Factor, imprimimos salsh (/)
    //System.out.print(node.getDiv());
    int a= ((Integer)pila.pop()).intValue();
    int b= ((Integer)pila.pop()).intValue();
    int c= b / a;
    pila.push(new Integer(c));
  }
  
  public void outAModFactor(AModFactor node){
    //Al salir de [mod] en Factor, imprimimos mod
    //System.out.print(node.getMod());
    int a= ((Integer)pila.pop()).intValue();
    int b= ((Integer)pila.pop()).intValue();
    int c= a % b;
    pila.push(new Integer(c));
  }
}