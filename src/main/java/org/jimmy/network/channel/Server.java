package org.jimmy.network.channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @Auth:Jimmy
 * @Email: 349676014@qq.com
 * @Date: 2020/8/2 22:02
 **/

public class Server {
    public static void main(String[] args) throws IOException {
        //用静态的open( )工厂方法创建一个ServerSocketChannel 对象
        ServerSocketChannel server = ServerSocketChannel.open();
        //通过socket()获取ServerSocket对象，实现socket绑定。
        server.socket().bind(new InetSocketAddress("127.0.0.1", 8000));
        SocketChannel ssl=  server.accept();
        //创建ByteBuffer并读取输出
        ByteBuffer buffer = ByteBuffer.allocate(500);
        ssl.read(buffer);
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.print((char)buffer.get());
        }
        ssl.close();
        server.close();
    }
}