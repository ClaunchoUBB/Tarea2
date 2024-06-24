/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipodedoc(ATipodedoc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFightml(AFightml node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACuerpo(ACuerpo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASvg(ASvg node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADatosvg(ADatosvg node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFiguras(AFiguras node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACirculoFiguras(ACirculoFiguras node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALineaFiguras(ALineaFiguras node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARectanguloFiguras(ARectanguloFiguras node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElipseFiguras(AElipseFiguras node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPoligonoFiguras(APoligonoFiguras node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPolilineaFiguras(APolilineaFiguras node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACirculo(ACirculo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACx(ACx node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACy(ACy node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAR(AR node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFill(AFill node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStroke(AStroke node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStrokewidth(AStrokewidth node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStyle(AStyle node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALinestyle(ALinestyle node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALinea(ALinea node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAX1(AX1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAX2(AX2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAY1(AY1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAY2(AY2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARectangulo(ARectangulo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAX(AX node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAY(AY node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElipse(AElipse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARx(ARx node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARy(ARy node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPoligono(APoligono node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPoints(APoints node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPolilinea(APolilinea node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumero(TNumero node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComa(TComa node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEspacio(TEspacio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFinfigura(TFinfigura node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTab(TTab node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNl(TNl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemicolon(TSemicolon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbrir(TAbrir node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCerrar(TCerrar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSlash(TSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAlert(TAlert node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoctype(TDoctype node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTValor(TValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtributo(TAtributo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBody(TBody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFinbody(TFinbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSvgEti(TSvgEti node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCirculoEti(TCirculoEti node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRectanguloEti(TRectanguloEti node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLineaEti(TLineaEti node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElipseEti(TElipseEti node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPoligonoEti(TPoligonoEti node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPolilineaEti(TPolilineaEti node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComillas(TComillas node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTHtml(THtml node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFinhtml(TFinhtml node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWidth(TWidth node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTHeight(THeight node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCxw(TCxw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCyw(TCyw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRw(TRw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFillw(TFillw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStrokew(TStrokew node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStrokewidthw(TStrokewidthw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStylew(TStylew node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTX1w(TX1w node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTX2w(TX2w node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTY1w(TY1w node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTY2w(TY2w node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFinsvg(TFinsvg node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXw(TXw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTYw(TYw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRxw(TRxw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRyw(TRyw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPointsw(TPointsw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}