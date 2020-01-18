package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 2);
        Book book2 = new Book("War and Peace", 3);
        Book book3 = new Book("Carnegie", 1);
        Book book4 = new Book("Java for Dummies", 2);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (Book currentBook : books) {
            System.out.println(currentBook.getName() + " - " + currentBook.getCount());
        }

        System.out.println("Show books by index 0 and 3.");
        for (int index = 0; index < books.length; index++) {
            if (index == 0 || index == 3) {
                Book currentBook = books[index];
                System.out.println(currentBook.getName() + " - " + currentBook.getCount());
            }
        }

        System.out.println("Show books with name = 'Clean code'.");
        for (Book currentBook : books) {
            if (currentBook.getName() == "Clean code")
            System.out.println(currentBook.getName() + " - " + currentBook.getCount());
        }
    }
}
