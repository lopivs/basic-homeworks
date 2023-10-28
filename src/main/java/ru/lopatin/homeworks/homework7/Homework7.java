package ru.lopatin.homeworks.homework7;

import java.util.Arrays;

public class Homework7 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1,2,-5,8},{-2,0,1,7},{4,8,6,-7}};
        int[][] array2 = new int[][]{{1,2,-5,8},{-2,0,1,7}};

        System.out.println("sumOfPositive = "+sumOfPositiveElements(array));

        paintSquare(5);

        diagonalZero(new int[][]{{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1}});

        System.out.println("max = "+findMax(array));

        System.out.println("sumSecondRow = "+sumSecondRow(array2));
    }

    //1)Реализовать метод (..), принимающий в качестве аргумента целочисленный двумерный массив,
    // метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
    public static int sumOfPositiveElements(int[][] arr) {
        System.out.println("1) sumOfPositiveElements ");
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>0){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
    //2) Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из символов * со сторонами соответствующей длины;
    public static void paintSquare(int size) {
        System.out.println("2) paintSquare ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //3) Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив,
    // и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);
    public static void diagonalZero(int[][] arr) {
        System.out.println("3) diagonalZero ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j){
                    arr[i][j]=0;
                }
                if(i==arr[i].length-j-1){
                    arr[i][j]=0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    //4) Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        System.out.println("4) findMax ");
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    //5)  Реализуйте метод, который считает сумму элементов второй строки двумерного массива,
    // если второй строки не существует, то в качестве результата необходимо вернуть -1
    public static int sumSecondRow(int[][] arr) {
        int sum = 0;
        if(arr.length<3){
            return -1;
        }

        for (int j = 1; j < arr[2].length; j++) {
            sum += arr[2][j];
        }
        return sum;
    }
}