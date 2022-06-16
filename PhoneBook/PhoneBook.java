package Lesson_4.PhoneBook;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {
    HashMap<String,String> hashMap = new HashMap<>();

    public void add(String phone, String secondName){
        hashMap.put(phone, secondName);
    }


    public Set<String> getPhone(String secondName){
        return hashMap.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), secondName))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }
}
