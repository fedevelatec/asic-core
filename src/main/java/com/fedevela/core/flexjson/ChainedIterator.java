package com.fedevela.core.flexjson;

/**
 * Created by fvelazquez on 16/04/14.
 */
import java.util.Iterator;
import java.util.Set;

public class ChainedIterator implements Iterator
{
    Iterator[] iterators;
    int current = 0;

    public ChainedIterator(Set... sets)
    {
        this.iterators = new Iterator[sets.length];
        for (int i = 0; i < sets.length; i++) {
            this.iterators[i] = sets[i].iterator();
        }
    }

    public boolean hasNext()
    {
        if (this.iterators[this.current].hasNext()) {
            return true;
        }
        this.current += 1;
        return (this.current < this.iterators.length) && (this.iterators[this.current].hasNext());
    }

    public Object next()
    {
        return this.iterators[this.current].next();
    }

    public void remove()
    {
        this.iterators[this.current].remove();
    }
}
