package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
// 148 - создаем строчку контейнера
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook();
        uniLibrary.addBook("Антон", book);
        uniLibrary.addMagazine();
//        uniLibrary.returnBook();
//        uniLibrary.returnMagazine();
//        schoolLibrary.getBook();
//        uniLibrary.addBook();

// 149 - получаем бин ивызываем метод, результат: beforeGetBookAdvice: Попытка получить книгу / Мы берем книгу-> конспект
        context.close();
    }
}
