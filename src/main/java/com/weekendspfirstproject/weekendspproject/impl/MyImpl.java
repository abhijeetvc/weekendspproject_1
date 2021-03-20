package com.weekendspfirstproject.weekendspproject.impl;

import com.weekendspfirstproject.weekendspproject.repository.MyInterface;
import org.springframework.stereotype.Component;

@Component
public class MyImpl implements MyInterface {

    @Override
    public String getData() {
        return "Hello Spring";
    }
}
