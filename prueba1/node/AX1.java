/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AX1 extends PX1
{
    private TX1w _x1w_;
    private TValor _valor_;

    public AX1()
    {
        // Constructor
    }

    public AX1(
        @SuppressWarnings("hiding") TX1w _x1w_,
        @SuppressWarnings("hiding") TValor _valor_)
    {
        // Constructor
        setX1w(_x1w_);

        setValor(_valor_);

    }

    @Override
    public Object clone()
    {
        return new AX1(
            cloneNode(this._x1w_),
            cloneNode(this._valor_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAX1(this);
    }

    public TX1w getX1w()
    {
        return this._x1w_;
    }

    public void setX1w(TX1w node)
    {
        if(this._x1w_ != null)
        {
            this._x1w_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._x1w_ = node;
    }

    public TValor getValor()
    {
        return this._valor_;
    }

    public void setValor(TValor node)
    {
        if(this._valor_ != null)
        {
            this._valor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._valor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._x1w_)
            + toString(this._valor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._x1w_ == child)
        {
            this._x1w_ = null;
            return;
        }

        if(this._valor_ == child)
        {
            this._valor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._x1w_ == oldChild)
        {
            setX1w((TX1w) newChild);
            return;
        }

        if(this._valor_ == oldChild)
        {
            setValor((TValor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
