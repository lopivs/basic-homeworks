package ru.lopatin.homeworks.homework.arrays1;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = minMaxList(8, 15);
        int sum = sumList(arrayList);
        replaysItems(7, arrayList);
        increaseItems(9, arrayList);


        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Bob", 44));
        empList.add(new Employee("Jan", 55));
        empList.add(new Employee("Helen", 23));
        empList.add(new Employee("Valera", 35));
        empList.add(new Employee("Anna", 40));

        System.out.println("nameList: " + nameList(empList));

        System.out.println("nameListOlder: " + nameListOlder(empList, 25));

        System.out.println("avgAgeCheck: " + avgAgeCheck(empList, 30));

        System.out.println("youngestEmp: " + youngestEmp(empList) + " " + youngestEmp(empList).getAge());
    }

    //    Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с набором последовательных значений
    //    в указанном диапазоне (min и max включительно, шаг - 1);
    public static ArrayList<Integer> minMaxList(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) list.add(i);
        System.out.println("minMaxList " + list);
        return list;
    }

    //    Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы, значение которых больше 5, и возвращающий сумму;
    public static int sumList(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println("sumList " + sum);
        return sum;
    }

    //    Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, метод должен переписать каждую заполненную ячейку списка указанным числом;
    public static void replaysItems(int newVal, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, newVal);
        }
        System.out.println("replaysItems " + list);
    }

    //    Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, увеличивающий каждый элемент списка на указанное число;
    public static void increaseItems(int newVal, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, (list.get(i) + newVal));
        }
        System.out.println("increaseItems " + list);
    }

    //    Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
    public static ArrayList<String> nameList(ArrayList<Employee> list) {
        ArrayList<String> nameList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            nameList.add(list.get(i).getName());
        }
        return nameList;
    }

    //    Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
    //    и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
    //    Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
    public static ArrayList<Employee> nameListOlder(ArrayList<Employee> list, int minAge) {
        ArrayList<Employee> nameList = new ArrayList<>();
        for (Employee e : list) {
            if (e.getAge() >= minAge) {
                nameList.add(e);
            }
        }
        return nameList;
    }

    //    Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст, и проверяющий
    //    что средний возраст сотрудников превышает указанный аргумент;
    public static boolean avgAgeCheck(ArrayList<Employee> list, int avgAge) {
        int sumAge = 0;
        for (Employee e : list) {
            sumAge += e.getAge();
        }
        System.out.println("AVG " + (sumAge/list.size()) + " " + sumAge + " " + list.size());
        return (sumAge/list.size())>avgAge;
    }

    //    Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.
    public static Employee youngestEmp(ArrayList<Employee> list) {
        Employee emp = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(emp.getAge()>list.get(i).getAge()) {
                emp = list.get(i);
            }
        }
        return emp;
    }


}



