package com.zlx.demo.controller;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

public class NettyServer {

    public static void main(String[] args) {
        /*
        bossgroup、workgroup默认线程数为CPU内核数的2倍
        bossgroup用于接受客户端发来的请求，接收到后将后续操作交由workergroup来处理
         */
        //两个线程组
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {

        }
    }
}
