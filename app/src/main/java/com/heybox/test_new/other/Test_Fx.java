package com.heybox.test_new.other;

import java.util.List;

public  class Test_Fx<T> {
    T t;
    public Test_Fx(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public T getname() {
        int a = 1;
        return (T) (a + "");
    }

    public <C> String getC(){

        return "";
    }

}
