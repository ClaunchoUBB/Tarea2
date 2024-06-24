/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseATipodedoc(ATipodedoc node);
    void caseAFightml(AFightml node);
    void caseACuerpo(ACuerpo node);
    void caseASvg(ASvg node);
    void caseADatosvg(ADatosvg node);
    void caseAFiguras(AFiguras node);
    void caseACirculoFiguras(ACirculoFiguras node);
    void caseALineaFiguras(ALineaFiguras node);
    void caseARectanguloFiguras(ARectanguloFiguras node);
    void caseAElipseFiguras(AElipseFiguras node);
    void caseAPoligonoFiguras(APoligonoFiguras node);
    void caseAPolilineaFiguras(APolilineaFiguras node);
    void caseACirculo(ACirculo node);
    void caseACx(ACx node);
    void caseACy(ACy node);
    void caseAR(AR node);
    void caseAFill(AFill node);
    void caseAStroke(AStroke node);
    void caseAStrokewidth(AStrokewidth node);
    void caseAStyle(AStyle node);
    void caseALinestyle(ALinestyle node);
    void caseALinea(ALinea node);
    void caseAX1(AX1 node);
    void caseAX2(AX2 node);
    void caseAY1(AY1 node);
    void caseAY2(AY2 node);
    void caseARectangulo(ARectangulo node);
    void caseAX(AX node);
    void caseAY(AY node);
    void caseAElipse(AElipse node);
    void caseARx(ARx node);
    void caseARy(ARy node);
    void caseAPoligono(APoligono node);
    void caseAPoints(APoints node);
    void caseAPolilinea(APolilinea node);

    void caseTNumero(TNumero node);
    void caseTComa(TComa node);
    void caseTEspacio(TEspacio node);
    void caseTFinfigura(TFinfigura node);
    void caseTTab(TTab node);
    void caseTBlank(TBlank node);
    void caseTNl(TNl node);
    void caseTSemicolon(TSemicolon node);
    void caseTAbrir(TAbrir node);
    void caseTCerrar(TCerrar node);
    void caseTIgual(TIgual node);
    void caseTSlash(TSlash node);
    void caseTAlert(TAlert node);
    void caseTDoctype(TDoctype node);
    void caseTValor(TValor node);
    void caseTAtributo(TAtributo node);
    void caseTBody(TBody node);
    void caseTFinbody(TFinbody node);
    void caseTSvgEti(TSvgEti node);
    void caseTCirculoEti(TCirculoEti node);
    void caseTRectanguloEti(TRectanguloEti node);
    void caseTLineaEti(TLineaEti node);
    void caseTElipseEti(TElipseEti node);
    void caseTPoligonoEti(TPoligonoEti node);
    void caseTPolilineaEti(TPolilineaEti node);
    void caseTComillas(TComillas node);
    void caseTHtml(THtml node);
    void caseTFinhtml(TFinhtml node);
    void caseTWidth(TWidth node);
    void caseTHeight(THeight node);
    void caseTCxw(TCxw node);
    void caseTCyw(TCyw node);
    void caseTRw(TRw node);
    void caseTFillw(TFillw node);
    void caseTStrokew(TStrokew node);
    void caseTStrokewidthw(TStrokewidthw node);
    void caseTStylew(TStylew node);
    void caseTX1w(TX1w node);
    void caseTX2w(TX2w node);
    void caseTY1w(TY1w node);
    void caseTY2w(TY2w node);
    void caseTFinsvg(TFinsvg node);
    void caseTXw(TXw node);
    void caseTYw(TYw node);
    void caseTRxw(TRxw node);
    void caseTRyw(TRyw node);
    void caseTPointsw(TPointsw node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
