/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ACirculoFiguras extends PFiguras
{
    private PCirculo _circulo_;

    public ACirculoFiguras()
    {
        // Constructor
    }

    public ACirculoFiguras(
        @SuppressWarnings("hiding") PCirculo _circulo_)
    {
        // Constructor
        setCirculo(_circulo_);

    }

    @Override
    public Object clone()
    {
        return new ACirculoFiguras(
            cloneNode(this._circulo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACirculoFiguras(this);
    }

    public PCirculo getCirculo()
    {
        return this._circulo_;
    }

    public void setCirculo(PCirculo node)
    {
        if(this._circulo_ != null)
        {
            this._circulo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._circulo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._circulo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._circulo_ == child)
        {
            this._circulo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._circulo_ == oldChild)
        {
            setCirculo((PCirculo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
