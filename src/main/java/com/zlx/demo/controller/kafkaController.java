package com.zlx.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.ws.RequestWrapper;

public class kafkaController {

    @Autowired
    private KafkaTemple<String,Object> kafkaTemple;

    @RequestMapper()
    public String demo(@RequestParam("message") String message){

    }
}
