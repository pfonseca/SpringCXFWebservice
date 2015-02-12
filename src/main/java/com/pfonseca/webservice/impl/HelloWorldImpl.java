package com.pfonseca.webservice.impl;
import javax.jws.WebService;

import com.pfonseca.webservice.HelloWorld;
 
@WebService(endpointInterface = "com.pfonseca.webservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
 
    public String sayHi(String text) {
        System.out.println("sayHi called");
        return "Hello " + text;
    }
}