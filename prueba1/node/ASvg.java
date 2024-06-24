/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ASvg extends PSvg
{
    private TSvgEti _svgEti_;
    private PDatosvg _datosvg_;
    private TCerrar _cerrar_;
    private TTab _tab_;
    private PFiguras _figuras_;

    public ASvg()
    {
        // Constructor
    }

    public ASvg(
        @SuppressWarnings("hiding") TSvgEti _svgEti_,
        @SuppressWarnings("hiding") PDatosvg _datosvg_,
        @SuppressWarnings("hiding") TCerrar _cerrar_,
        @SuppressWarnings("hiding") TTab _tab_,
        @SuppressWarnings("hiding") PFiguras _figuras_)
    {
        // Constructor
        setSvgEti(_svgEti_);

        setDatosvg(_datosvg_);

        setCerrar(_cerrar_);

        setTab(_tab_);

        setFiguras(_figuras_);

    }

    @Override
    public Object clone()
    {
        return new ASvg(
            cloneNode(this._svgEti_),
            cloneNode(this._datosvg_),
            cloneNode(this._cerrar_),
            cloneNode(this._tab_),
            cloneNode(this._figuras_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASvg(this);
    }

    public TSvgEti getSvgEti()
    {
        return this._svgEti_;
    }

    public void setSvgEti(TSvgEti node)
    {
        if(this._svgEti_ != null)
        {
            this._svgEti_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._svgEti_ = node;
    }

    public PDatosvg getDatosvg()
    {
        return this._datosvg_;
    }

    public void setDatosvg(PDatosvg node)
    {
        if(this._datosvg_ != null)
        {
            this._datosvg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._datosvg_ = node;
    }

    public TCerrar getCerrar()
    {
        return this._cerrar_;
    }

    public void setCerrar(TCerrar node)
    {
        if(this._cerrar_ != null)
        {
            this._cerrar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cerrar_ = node;
    }

    public TTab getTab()
    {
        return this._tab_;
    }

    public void setTab(TTab node)
    {
        if(this._tab_ != null)
        {
            this._tab_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tab_ = node;
    }

    public PFiguras getFiguras()
    {
        return this._figuras_;
    }

    public void setFiguras(PFiguras node)
    {
        if(this._figuras_ != null)
        {
            this._figuras_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._figuras_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._svgEti_)
            + toString(this._datosvg_)
            + toString(this._cerrar_)
            + toString(this._tab_)
            + toString(this._figuras_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._svgEti_ == child)
        {
            this._svgEti_ = null;
            return;
        }

        if(this._datosvg_ == child)
        {
            this._datosvg_ = null;
            return;
        }

        if(this._cerrar_ == child)
        {
            this._cerrar_ = null;
            return;
        }

        if(this._tab_ == child)
        {
            this._tab_ = null;
            return;
        }

        if(this._figuras_ == child)
        {
            this._figuras_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._svgEti_ == oldChild)
        {
            setSvgEti((TSvgEti) newChild);
            return;
        }

        if(this._datosvg_ == oldChild)
        {
            setDatosvg((PDatosvg) newChild);
            return;
        }

        if(this._cerrar_ == oldChild)
        {
            setCerrar((TCerrar) newChild);
            return;
        }

        if(this._tab_ == oldChild)
        {
            setTab((TTab) newChild);
            return;
        }

        if(this._figuras_ == oldChild)
        {
            setFiguras((PFiguras) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}