/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AFightml extends PFightml
{
    private THtml _html_;
    private PCuerpo _cuerpo_;
    private TFinhtml _finhtml_;

    public AFightml()
    {
        // Constructor
    }

    public AFightml(
        @SuppressWarnings("hiding") THtml _html_,
        @SuppressWarnings("hiding") PCuerpo _cuerpo_,
        @SuppressWarnings("hiding") TFinhtml _finhtml_)
    {
        // Constructor
        setHtml(_html_);

        setCuerpo(_cuerpo_);

        setFinhtml(_finhtml_);

    }

    @Override
    public Object clone()
    {
        return new AFightml(
            cloneNode(this._html_),
            cloneNode(this._cuerpo_),
            cloneNode(this._finhtml_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFightml(this);
    }

    public THtml getHtml()
    {
        return this._html_;
    }

    public void setHtml(THtml node)
    {
        if(this._html_ != null)
        {
            this._html_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._html_ = node;
    }

    public PCuerpo getCuerpo()
    {
        return this._cuerpo_;
    }

    public void setCuerpo(PCuerpo node)
    {
        if(this._cuerpo_ != null)
        {
            this._cuerpo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cuerpo_ = node;
    }

    public TFinhtml getFinhtml()
    {
        return this._finhtml_;
    }

    public void setFinhtml(TFinhtml node)
    {
        if(this._finhtml_ != null)
        {
            this._finhtml_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._finhtml_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._html_)
            + toString(this._cuerpo_)
            + toString(this._finhtml_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._html_ == child)
        {
            this._html_ = null;
            return;
        }

        if(this._cuerpo_ == child)
        {
            this._cuerpo_ = null;
            return;
        }

        if(this._finhtml_ == child)
        {
            this._finhtml_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._html_ == oldChild)
        {
            setHtml((THtml) newChild);
            return;
        }

        if(this._cuerpo_ == oldChild)
        {
            setCuerpo((PCuerpo) newChild);
            return;
        }

        if(this._finhtml_ == oldChild)
        {
            setFinhtml((TFinhtml) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
