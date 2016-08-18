package com.vngilev.homework2_2.Str;


import com.vngilev.homework2_2.interfaces.ILoader;

public class StrLoader implements ILoader {
    private String load;

    @Override
    public void takeItem(Object load) {
        this.load = (String) load;
    }

    @Override
    public Object giveItem() {
        return this.load;
    }

    @Override
    public int getWeigthOfItem() {
        return this.load.length();
    }
}
