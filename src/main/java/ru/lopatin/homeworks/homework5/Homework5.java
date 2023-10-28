package ru.lopatin.homeworks.homework5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        int[] array = {2,15,65,8,4,5,2,1,52,5,14,4,5,45,46,4};
        int[] array2 = new int[10];
        int[] array3 = {2,1,5,4,8,3,54};
        printString("Hello World!", (int)(Math.random()*8));
        sumArray(array);
        fillArray((int)(Math.random()*10),array2);
        additionArr((int)(Math.random()*10),array2);
        compareArrayHalfs(array);
        // *
        sumArrays(array, array2, array3);
        isEqualPoint(new int[]{5,2,2,8,3,7,7});
        isDescArray(new int[]{6,5,4,3,2,1});
        reverseArray(new int[]{1,2,3,4,5,6,7,8,9});
    }

        //1) Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз;
        public static void printString(String text, int count) {
            System.out.println("1) printString");
            for (int i = 0; i < count; i++) {
                System.out.println(text);
            }
        }
        //2)Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль;
        public static void sumArray(int[] arr) {
            System.out.println("2) sumArray");
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>5){
                    sum+=arr[i];
                }
            }
            System.out.println("Сумма элементов, значение которых больше 5 = "+sum);
        }
        //3)Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, метод должен заполнить каждую ячейку массива указанным числом;
        public static void fillArray(int num, int[] arr){
            System.out.println("3) fillArray(num = "+ num+")");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = num;
            }
            System.out.println(Arrays.toString(arr));
        }
        //4)Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, увеличивающий каждый элемент массива на указанное число;
        public static void additionArr(int num, int[] arr) {
            System.out.println("4) additionArr(num = "+ num+")");
            for (int i = 0; i < arr.length; i++) {
                arr[i] += num;
            }
            System.out.println(Arrays.toString(arr));
        }
        //5)Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в консоль информацию о том, сумма элементов какой из половин массива больше;
        public static void compareArrayHalfs(int[] arr) {
            System.out.println("5) compareArrayHalfs");
            int mid = arr.length / 2;
            int half1 = 0, half2 = 0, sum=0;


            System.out.println(arr.length +" mid " +  mid + "arr.length - mid" + (arr.length - mid));

            for (int i = 0; i < arr.length; i++) {
                sum+=arr[i];
                if (i <= (mid-1)) {
                    half1 += arr[i];
                } else if (arr.length - mid <= i) {
                    half2 += arr[i];
                }
            }
            if (half1 > half2) {
                System.out.println("Первая половина больше " + half1 + ">" + half2);
            } else if (half1 == half2) {
                System.out.println("Обе половина равны " + half1 + " = " + half2);
            } else if (half1 < half2) {
                System.out.println("Первая половина меньше " + half1 + "<" + half2);
            }
        }
    //6)Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
    //        массив равный сумме входящих;
    //        Пример:
    //        { 1, 2, 3 }
    //        { 2, 2 }
    //        { 1, 1, 1, 1, 1}
    //= { 4, 5, 4, 1, 1 }
    public static void sumArrays (int[] ... arrays) {
        System.out.println("6) *sumArrays");
        int maxLen = arrays[0].length;
        for (int i = 1; i < arrays.length; i++) {
            maxLen = Math.max(maxLen, arrays[i].length);
        };
        int[] arrSum = new int[maxLen];
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("arrays["+i+"]"+Arrays.toString(arrays[i]));
            for (int j = 0; j < arrays[i].length; j++) {
                arrSum[j]+=arrays[i][j];
            }
        }
        System.out.println(Arrays.toString(arrSum));
    }
    //7)Реализуйте метод, проверяющий что есть “точка” в массиве, в которой сумма левой и правой части
    //        равны. “Точка находится между элементами”;
    //        Пример: { 1, 1, 1, 1, 1, | 5 }, { 5, | 3, 4, -2 }, { 7, 2, 2, 2 }, { 9, 4 }
    public static void isEqualPoint(int[] arr) {
        System.out.println("7) *isEqualPoint");
        int sumArr = 0;
        int half = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr+=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sumArr+" "+sumArr/2);
        if(sumArr%2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                half += arr[i];
                if(half==sumArr/2){
                    System.out.println("Точка найдена "+i);
                    return;
                }
            }
        }
        System.out.println("Точка не найдена ");

    }
    //8)Реализуйте метод, проверяющий что все элементы массива идут в порядке убывания или
    //        возрастания (по выбору пользователя)
    public static void isDescArray(int[] arr) {
        System.out.println("8) *isDescArray");
        Scanner scanner = new Scanner(System.in);
        int typeCheck = 0;
        do {
            System.out.println("Укажите вариант проверки: 1 - по возрастанию, 2 по убыванию");
            typeCheck = scanner.nextInt();
            if (!(typeCheck == 1||typeCheck == 2)){
                typeCheck = 0;
            }
        } while (typeCheck == 0);

        for (int i = 0; i < arr.length-1; i++) {
            if((arr[i]>arr[i+1] && typeCheck == 1)||(arr[i]<arr[i+1] && typeCheck == 2)) {
                System.out.println("Массив не отсортирован");
                return;
            }
        }
        System.out.println("Массив отсортирован");
    }
    //9)Реализуйте метод, “переворачивающий” входящий массив
    //        Пример: { 1 2 3 4 } => { 4 3 2 1 }*/
    public static void reverseArray(int[] arr) {
        System.out.println("9) *reverseArray");
        System.out.println("До    "+Arrays.toString(arr));
        int tmp =0;
        for (int i = 0; i < arr.length/2; i++) {
            tmp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i] = tmp;
        }
        System.out.println("После "+Arrays.toString(arr));
    }
}
