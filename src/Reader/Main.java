package Reader;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Введите имя, телефон, факультет, дату рождения, телефон:");
        System.out.print("имя: ");
        String fcs = scanner.nextLine();
        System.out.println();
        System.out.print("телефон: ");
        int number = scanner1.nextInt();
        System.out.println();
        System.out.print("факультет: ");
        String faculty = scanner.nextLine();
        System.out.println();
        System.out.print("дата рождения: ");
        String birth = scanner.nextLine();
        System.out.println();
        System.out.print("телефон: ");
        String phone = scanner.nextLine();
        System.out.println();
        Reader reader = new Reader(fcs, number, faculty, birth, phone);

        System.out.println("Данные о книге: название, автор ");
        System.out.print("название: ");
        String name = scanner.nextLine();
        System.out.println();
        System.out.print("автор: ");
        String author = scanner.nextLine();
        System.out.println();
        Book book = new Book(name, author);
        Book book1 = new Book("Сказки", "Пушкин");
        Book[] books = {book, book1};

        String[] books_string = {"Стихи", "Есенин"};

        reader.takeBook(3);
        reader.takeBook(books_string);
        reader.takeBook(books);

        reader.returnBook(3);
        reader.returnBook(books_string);
        reader.returnBook(books);
    }
}