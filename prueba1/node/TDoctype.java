/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TDoctype extends Token
{
    public TDoctype()
    {
        super.setText("<!DOCTYPE html");
    }

    public TDoctype(int line, int pos)
    {
        super.setText("<!DOCTYPE html");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDoctype(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDoctype(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDoctype text.");
    }
}
