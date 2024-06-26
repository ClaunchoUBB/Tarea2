/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ACuerpo extends PCuerpo
{
    private TBody _body_;
    private PSvg _svg_;
    private TFinbody _finbody_;

    public ACuerpo()
    {
        // Constructor
    }

    public ACuerpo(
        @SuppressWarnings("hiding") TBody _body_,
        @SuppressWarnings("hiding") PSvg _svg_,
        @SuppressWarnings("hiding") TFinbody _finbody_)
    {
        // Constructor
        setBody(_body_);

        setSvg(_svg_);

        setFinbody(_finbody_);

    }

    @Override
    public Object clone()
    {
        return new ACuerpo(
            cloneNode(this._body_),
            cloneNode(this._svg_),
            cloneNode(this._finbody_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACuerpo(this);
    }

    public TBody getBody()
    {
        return this._body_;
    }

    public void setBody(TBody node)
    {
        if(this._body_ != null)
        {
            this._body_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._body_ = node;
    }

    public PSvg getSvg()
    {
        return this._svg_;
    }

    public void setSvg(PSvg node)
    {
        if(this._svg_ != null)
        {
            this._svg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._svg_ = node;
    }

    public TFinbody getFinbody()
    {
        return this._finbody_;
    }

    public void setFinbody(TFinbody node)
    {
        if(this._finbody_ != null)
        {
            this._finbody_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._finbody_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._body_)
            + toString(this._svg_)
            + toString(this._finbody_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._body_ == child)
        {
            this._body_ = null;
            return;
        }

        if(this._svg_ == child)
        {
            this._svg_ = null;
            return;
        }

        if(this._finbody_ == child)
        {
            this._finbody_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._body_ == oldChild)
        {
            setBody((TBody) newChild);
            return;
        }

        if(this._svg_ == oldChild)
        {
            setSvg((PSvg) newChild);
            return;
        }

        if(this._finbody_ == oldChild)
        {
            setFinbody((TFinbody) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
