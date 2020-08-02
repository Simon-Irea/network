package org.jimmy.network.channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @Auth:Jimmy
 * @Email: 349676014@qq.com
 * @Date: 2020/8/2 22:03
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        //调用connect()方法建立连接，也可以直接调用Socket中的方法
        socketChannel.connect(new InetSocketAddress("127.0.0.1", 8000));

        ByteBuffer writeBuffer = ByteBuffer.allocate(128);
        writeBuffer.put("hello ".getBytes());

        writeBuffer.flip();
        socketChannel.write(writeBuffer);
        socketChannel.close();
    }
}