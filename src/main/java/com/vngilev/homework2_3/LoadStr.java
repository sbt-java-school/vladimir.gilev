package com.vngilev.homework2_3;

/**
 * Created by 1 on 10.08.2016.
 */
public class LoadStr extends AbstractLoad {
    private String load;

    public LoadStr(String string) {
        this.load = new String(string);
        setWeight();
    }

    @Override
    protected void setWeight() {
        super.weight = load.length();
    }
}

