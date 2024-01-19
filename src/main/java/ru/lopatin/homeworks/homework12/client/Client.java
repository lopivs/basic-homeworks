package ru.lopatin.homeworks.homework12.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public void connect() {
        try (Socket socket = new Socket("localhost", 8081);
             DataInputStream in = new DataInputStream(socket.getInputStream());
             DataOutputStream out = new DataOutputStream(socket.getOutputStream())) {

            // получаем входящее сообщениеот сервера
            new Thread(() -> {
                try {
                    while (true) {
                        String inMessage = in.readUTF();
                        System.out.println(inMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            //отправляем сообщение на сервер
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String outMessage = scanner.nextLine();
                out.writeUTF(outMessage);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
