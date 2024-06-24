/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AStroke extends PStroke
{
    private TStrokew _strokew_;
    private TValor _valor_;

    public AStroke()
    {
        // Constructor
    }

    public AStroke(
        @SuppressWarnings("hiding") TStrokew _strokew_,
        @SuppressWarnings("hiding") TValor _valor_)
    {
        // Constructor
        setStrokew(_strokew_);

        setValor(_valor_);

    }

    @Override
    public Object clone()
    {
        return new AStroke(
            cloneNode(this._strokew_),
            cloneNode(this._valor_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStroke(this);
    }

    public TStrokew getStrokew()
    {
        return this._strokew_;
    }

    public void setStrokew(TStrokew node)
    {
        if(this._strokew_ != null)
        {
            this._strokew_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._strokew_ = node;
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
            + toString(this._strokew_)
            + toString(this._valor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._strokew_ == child)
        {
            this._strokew_ = null;
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
        if(this._strokew_ == oldChild)
        {
            setStrokew((TStrokew) newChild);
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
