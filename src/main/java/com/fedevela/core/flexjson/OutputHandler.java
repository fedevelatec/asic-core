package com.fedevela.core.flexjson;

/**
 * Created by fvelazquez on 16/04/14.
 */
public abstract interface OutputHandler
{
    public abstract OutputHandler write(String paramString);

    public abstract int write(String paramString1, int paramInt1, int paramInt2, String paramString2);

    public abstract int write(String paramString, int paramInt1, int paramInt2);
}
