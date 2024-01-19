package ru.lopatin.homeworks.homework12.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private Socket client;
    private DataOutputStream out;
    private DataInputStream in;

    public void start() {
        try (ServerSocket server = new ServerSocket(8081)) {
            client = server.accept();
            out = new DataOutputStream(client.getOutputStream());
            in = new DataInputStream(client.getInputStream());
            out.writeUTF("Добро пожаловать в калькулятор! \nРазрешенные знаки операций :\"+-*/\". Разделитель дробной и целой части \".\"(точка)");
            new Thread(() -> {
                try {
                    while (true) {
                        String inMessage = in.readUTF();
                        if (inMessage.equals("/exit")) {
                            break;
                        }
                        System.out.println(inMessage);
                        try {
                            out.writeUTF("Результат вычисления = " + String.valueOf(calculate(inMessage)));
                        } catch (Exception e) {
                            out.writeUTF("Неверный формат выражения, разрешенные знаки операций :\"+-*/\" . Разделитель дробной и целой части \".\"(точка), пробелы недопустимы");
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static float calculate(String query) throws ArithmeticException {
        String[] qSplit = query.split("[+\\-*/]");
        if (query.contains("+")) {
            return Float.valueOf(qSplit[0]) + Float.valueOf(qSplit[1]);
        } else if (query.contains("-")) {
            return Float.valueOf(qSplit[0]) - Float.valueOf(qSplit[1]);
        } else if (query.contains("*")) {
            return Float.valueOf(qSplit[0]) * Float.valueOf(qSplit[1]);
        } else if (query.contains("/")) {
            return Float.valueOf(qSplit[0]) / Float.valueOf(qSplit[1]);
        }
        throw new ArithmeticException("Кривая строка");
    }
}
