package aop;

import org.springframework.stereotype.Component;

//@Component("library")
public class UniLibrary extends AbstractLibrary {
//142 - создали класс


    public  void  getBook (){
        System.out.println("Мы берем книгу из UniLibrary ");
        System.out.println("------------------------------------");
    }

   public String returnBook() {
        int a = 10/0;
        System.out.println("Мы вернули книгу в UniLibrary");
       return "Война и мир";
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary ");
        System.out.println("------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Мы вернули журнал в UniLibrary");
        System.out.println("------------------------------------");
    }

    public  void  addBook (String person_name, Book book){
        System.out.println("Мы добавили книгу из UniLibrary ");
        System.out.println("------------------------------------");
    }

    public  void  addMagazine (){
        System.out.println("Мы добавили журнал из UniLibrary ");
        System.out.println("------------------------------------");
    }

// 143 - создали метод -> MyConfig
}
