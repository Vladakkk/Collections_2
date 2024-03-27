import phonebook.Entry;
import phonebook.PhoneBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add(new Entry("Оксана Бойко", "0674567832"));
        phoneBook.add(new Entry("Петро Колісник", "0986754521"));
        phoneBook.add(new Entry("Оксана Бойко", "0674573489"));
        phoneBook.add(new Entry("Олег Швачко", "0662117633"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ім'я для пошуку: ");
        String findName = scanner.nextLine();
        Entry foundEntry = phoneBook.find(findName);
        if (foundEntry != null) {
            System.out.println("Знайдено запис для " + findName + ": " + foundEntry);
        } else {
            System.out.println("Запис для " + findName + " не знайдено.");
        }
    }
}
