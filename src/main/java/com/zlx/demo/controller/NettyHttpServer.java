package com.zlx.demo.controller;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.util.ArrayList;

public class NettyHttpServer {

    public static void main(String[] args) {
        /*
        bossgroup、workgroup默认线程数为CPU内核数的2倍
        bossgroup用于接受客户端发来的请求，接收到后将后续操作交由workergroup来处理
         */
        //两个线程组
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            /*
            bootstrap用来为Netty启动配置一些必要组件，如上面两个线程池
            channel方法用于指定服务器监听套接字通道NIOServerSocketChannel，其内部管理了一个java nio中的ServerSocketChannel实例
            channelHandler方法用于设置业务职责链，其实就是一个个的ChannelHandler串联而成，形成的链式结构。正是这一个个的ChannelHandler帮我们完成了要处理的事情
             */
            //服务端启动辅助类
            ServerBootstrap bootstrap=new ServerBootstrap();
            bootstrap.group(bossGroup,workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new NettyHttpServerInitializer());

            /*
            bootstrap的bind方法将服务绑定在8080端口，bind方法内部会执行端口绑定等一系列的操作，使前面的配置各司其职
            加锁--->同步
             */
            ChannelFuture future=bootstrap.bind(8080).sync();

            //等待服务器关闭
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            //退出，释放线程池资源
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}
