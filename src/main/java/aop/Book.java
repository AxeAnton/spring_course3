package aop;

import org.springframework.beans.factory.annotation.Value;
// тест 1
public class Book {
    @Value("Преступление и наказание")
    private String name;

    @Value("Ф.М.Достаевский")
    private String author;

    @Value("1866")
    private String yearOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }
}
