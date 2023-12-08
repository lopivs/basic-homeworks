package ru.lopatin.homeworks.homework.oop4;

class AppArrayDataException extends RuntimeException {
    public AppArrayDataException (int i, int j, String value){
        super("Ошибка преобразования значения '" + value + "' в число. Значение расположено в элементе [" + i + "][" + j + "]");
    }

    public AppArrayDataException(int i, int j){
        super("Неверный размер массива, получен " + i + "x" + j + ", должен быть 4х4!");
    }

    public AppArrayDataException (String message){
        super(message);
    }

}
