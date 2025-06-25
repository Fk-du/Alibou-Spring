package com.fkadu.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {


    private final MyFirstClass myFirstClass;

    public MyFirstService(
            @Qualifier("bean1") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellStory(){
        return "my first class is saing "+ myFirstClass.sayHello();
    }


}
