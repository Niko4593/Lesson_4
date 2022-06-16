package Lesson_4.PhoneBook;

import java.util.HashMap;

public class MainClass {
    public static void main(String[] args) {

        PhoneBook PhoneBook = new PhoneBook();
        PhoneBook.add("89635768100", "Orlov");
        PhoneBook.add("89002984567", "Orlov");
        PhoneBook.add("89126784657", "Baranov");
        PhoneBook.add("89095674867", "Petrov");
        PhoneBook.add("89635768108", "Fedorov");
        PhoneBook.add("89002984564", "Ivanov");
        PhoneBook.add("89626364906", "Putin");
        PhoneBook.add("89095674811", "Gorbachev");
        PhoneBook.add("89002984000", "Ivanov");
        PhoneBook.add("89126784878", "Medvedev");
        PhoneBook.add("89095674564", "Baranov");

        System.out.println(PhoneBook.getPhone("Baranov"));
    }
}
