package com.vngilev.homework2_3;

/**
 * Created by 1 on 10.08.2016.
 */
public class LoadInt extends AbstractLoad {
    Integer load;

    public LoadInt(Integer integer) {
        this.load = new Integer(integer);
        setWeight();
    }

    @Override
    protected void setWeight() {
        super.weight = load.intValue();
    }
}
