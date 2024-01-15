package ru.lopatin.homeworks.homework11;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static java.lang.System.out;

public class FileReaderWriter {
    public String directory;
    public String selectedFile;

    public int fileSize;

    public FileReaderWriter() {
        this.directory = "src/main/java/ru/lopatin/homeworks/homework11/files/";
    }
    public FileReaderWriter(String directory) {
        this.directory = directory;
    }

    public void printFileList () {
        File fileDir = new File(directory);
        File[] listFiles = fileDir.listFiles();
        for (int i = 0; i < listFiles.length; i++) {
            out.println(listFiles[i].getName());
        }
    }

    public void readFile(String fileName) {
        selectedFile = fileName;
        try (InputStreamReader in = new InputStreamReader(new FileInputStream(directory+fileName))) {
            int n = in.read();
            while (n != -1) {
                fileSize += n;
                System.out.print((char)n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFile(String text, boolean append) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(directory+selectedFile, append))) {
            byte[] buffer = text.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
