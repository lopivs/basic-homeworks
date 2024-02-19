package ru.lopatin.homeworks.homework22;

public class MainApp {
    public int[] checkArray(int[] array) {
        int pos = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                pos = i+1;
            }
        }
        if (pos == -1) {
            throw new RuntimeException();
        }
        int[] newArray = new int[array.length-(pos)];
        for (int i = pos; i < array.length; i++) {
            newArray[i-pos] = array[i];
        }
        return newArray;
    }

    public boolean checkArrayOneAndTwo(int[] array) {
        int one = 0;
        int two = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                one ++;
            }
            if (array[i] == 2) {
                two ++;
            }
        }
        return one+two == array.length;
    }
}
