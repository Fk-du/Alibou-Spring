package com.fkadu.example;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/hello1")
    public String sayHello(){
        return "Hello from First Controller Class";
    }

    @PostMapping("/post")
    public String post(
            @RequestBody String message
    ){
        return "request accepted and message is: "+ message;
    }

    @PostMapping("/post-order")
    public String postOrder( @RequestBody Order order ){

        return "request accepted and Order is: "+ order.toString();
    }

    @PostMapping("/post-record")
    public String postRecord( @RequestBody Record record ){

        return "request accepted and Record is: "+ record.toString();
    }

    @GetMapping("/hello/{Product-Name}")
    public String pathVar(
            @PathVariable("Product-Name") String productName
    ){
        return "Hello from First Controller Class " + productName;
    }


    @GetMapping("/hello")
    public String pathVar(
            @RequestParam("UserName") String userName,
            @RequestParam("UserLName") String userLName
    ){
        return "Hello from First Controller Class " + userName + " "+ userLName;
    }
}
