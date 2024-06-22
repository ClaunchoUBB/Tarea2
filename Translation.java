package postfix;

import postfix.analysis.*;
import postfix.node.*;

class Translation extends DepthFirstAdapter{
  
  public void caseTNumber(TNumber node){
    //Cuando encontremos un numero, lo imprimimos
    System.out.print(node);
  }
  
  public void outAPlusExpr(APlusExpr node){
    //Al salir de [plus] en Expr, imprimimos el signo +
    System.out.print(node.getPlus());
  }
  
  public void outAMinusExpr(AMinusExpr node){
    //Al salir de [minus] en Expr, imprimimos el signo -
    System.out.print(node.getMinus());
  }
  
  public void outAMultFactor(AMultFactor node){
    //Al salir de [mult] en Factor, imprimimos asterisco
    System.out.print(node.getMult());
  }
  
  public void outADivFactor(ADivFactor node){
    //Al salir de [div] en Factor, imprimimos salsh (/)
    System.out.print(node.getDiv());
  }
  
  public void outAModFactor(AModFactor node){
    //Al salir de [mod] en Factor, imprimimos mod
    System.out.print(node.getMod());
  }
}