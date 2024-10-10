package org.example.book;

public class Book implements Displayable {
    private String name;
    private String author;
    private int year;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void display() {
        System.out.println("Название книги - " + this.name);
        System.out.println("Автор - " + this.author);
        System.out.println("Год - " + this.year);
    }
}
