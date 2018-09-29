package com.heybox.test_new.other;

public class StringBeans implements GetTest {
    String a = "from StringBeans";

    @Override
    public String getString() {
        return a;
    }
}
