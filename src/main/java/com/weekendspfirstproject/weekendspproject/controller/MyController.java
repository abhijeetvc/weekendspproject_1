package com.weekendspfirstproject.weekendspproject.controller;

import com.weekendspfirstproject.weekendspproject.impl.MyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //  @Autowired   // Using spring's dependency injection facilities
    private MyImpl myImpl;  // field based DI

//    public MyController(MyImpl myImpl){   // Constructor
//        this.myImpl=myImpl;
//    }

    @Autowired
    public void setMyImpl(MyImpl myImpl) {
        this.myImpl = myImpl;
    }

    @GetMapping("/check")
    public String check(){
        return myImpl.getData();
    }
}
