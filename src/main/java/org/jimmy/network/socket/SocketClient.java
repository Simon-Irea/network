package org.jimmy.network.socket;

import java.io.OutputStream;
import java.net.Socket;

/**
 * @Auth:Jimmy
 * @Email: 349676014@qq.com
 * @Date: 2020/8/2 21:52
 **/
public class SocketClient {
    public static void main(String args[]) throws Exception {
        // 要连接的服务端IP地址和端口
        String host = "127.0.0.1";
        int port = 55533;
        // 与服务端建立连接
        Socket socket = new Socket(host, port);
        // 建立连接后获得输出流
        OutputStream outputStream = socket.getOutputStream();
        String message = "你好  yiwangzhibujian";
        socket.getOutputStream().write(message.getBytes("UTF-8"));
        outputStream.close();
        socket.close();
    }
}