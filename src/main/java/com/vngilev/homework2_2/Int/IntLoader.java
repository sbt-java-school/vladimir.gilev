package com.vngilev.homework2_2.Int;

import com.vngilev.homework2_2.interfaces.ILoader;

public class IntLoader implements ILoader {
    private Integer load;

    public void takeItem(Object load) {
        this.load = (Integer) load;
    }

    @Override
    public int getWeigthOfItem() {
        return this.load;
    }

    public Object giveItem() {
        return this.load;
    }
}
