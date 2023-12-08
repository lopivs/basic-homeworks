package ru.lopatin.homeworks.homework.oop4;

import java.util.Arrays;
// Реализуйте метод, аргументом которого является двумерный строковый массив размером 4х4.
// Если передан массив другого размера необходимо бросить исключение AppArrayDataException.
// Метод должен обойти все элементы массива, преобразовать в int и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит текст вместо числа),
// должно быть брошено исключение AppArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
// В методе main() необходимо вызвать полученный метод, обработать возможные исключения AppArrayDataException
// и AppArrayDataException и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).
public class MainApp {
    public static void main(String[] args) {
        String okArray[][] = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String errArray1[][] = {{"1", "2", "3", "4","0"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15"}};
        String errArray2[][] = {{"1", "2", "3", "4"}, {"5", "шесть", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        //
        sumArray(okArray);
        //sumArray(errArray1);
        sumArray(errArray2);
    }

    public static void sumArray(String[][] array) {
        int sum = 0;
        int i = 0;
        int j = 0;
        try {
            for (i = 0; i < 4; i++) {
                if (array.length != 4 || array[i].length!=4){
                    throw new AppArrayDataException(array.length, array[i].length);
                }
                for (j = 0; j < 4; j++) {
                    sum += Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException ex) {
            throw new AppArrayDataException(i, j, array[i][j]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new AppArrayDataException(i, j);
        } catch (Throwable ex){
            throw new AppArrayDataException(ex.getMessage());
        }
        System.out.println("Сумма элесментов массива = " + sum);

    }

}
