/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TFinfigura extends Token
{
    public TFinfigura()
    {
        super.setText("/>");
    }

    public TFinfigura(int line, int pos)
    {
        super.setText("/>");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFinfigura(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFinfigura(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFinfigura text.");
    }
}