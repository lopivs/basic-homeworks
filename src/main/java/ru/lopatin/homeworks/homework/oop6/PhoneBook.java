package ru.lopatin.homeworks.homework.oop6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    Map<String, HashSet<String>> phonebook = new HashMap<>();

    public boolean add(String name, String phone) {
        HashSet<String> phones = new HashSet<>();
        if (phonebook.containsKey(name)) {
            phones = phonebook.get(name);
        }
        phones.add(phone);
        phonebook.put(name, phones);
        return true;
    }

    public String find(String name){
        String phoneList;
        HashSet<String> phones = new HashSet<>();
        if (phonebook.containsKey(name)) {
            phones = phonebook.get(name);
            return phones.toString();
        }
        return "В книге нет записей для: " + name;
    }

    public boolean containsPhoneNumber(String phone){
        HashSet<String> phones = new HashSet<>();
        for (String m: phonebook.keySet()) {
            if(phonebook.get(m).contains(phone)){
                System.out.println("Номер найден у контакта: " + m);
                return true;
            }
        }
        System.out.println("Номер не найден");
        return false;
    }
}

