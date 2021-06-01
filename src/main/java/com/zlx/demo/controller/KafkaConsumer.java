package com.zlx.demo.controller;


import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumer {

    //消费监听
    @KafkaListener(topics={"test.topic"})
    public void onMessage(ConsumerRecode<?,?> recode){
        /*
        消费的哪个topic、partition的消息，打印出消息内容
        System.out.println("简单消费："+recode.topic()+"-"+recode.partition()+"-"+recode.value);
         */
        MyRpcClientFacade clientFacade = new MyRpcClientFacade("127.0.0.1", 4141);
        clientFacade.sendDataToFlume(recode.topic+"-"+recode.partition()+"_"+recode.value());
    }
}
