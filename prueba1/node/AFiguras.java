/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AFiguras extends PFiguras
{
    private TFinsvg _finsvg_;

    public AFiguras()
    {
        // Constructor
    }

    public AFiguras(
        @SuppressWarnings("hiding") TFinsvg _finsvg_)
    {
        // Constructor
        setFinsvg(_finsvg_);

    }

    @Override
    public Object clone()
    {
        return new AFiguras(
            cloneNode(this._finsvg_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFiguras(this);
    }

    public TFinsvg getFinsvg()
    {
        return this._finsvg_;
    }

    public void setFinsvg(TFinsvg node)
    {
        if(this._finsvg_ != null)
        {
            this._finsvg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._finsvg_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._finsvg_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._finsvg_ == child)
        {
            this._finsvg_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._finsvg_ == oldChild)
        {
            setFinsvg((TFinsvg) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}