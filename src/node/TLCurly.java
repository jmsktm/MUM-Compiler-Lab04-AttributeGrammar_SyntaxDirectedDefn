/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TLCurly extends Token
{
    public TLCurly()
    {
        super.setText("{");
    }

    public TLCurly(int line, int pos)
    {
        super.setText("{");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLCurly(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLCurly(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLCurly text.");
    }
}