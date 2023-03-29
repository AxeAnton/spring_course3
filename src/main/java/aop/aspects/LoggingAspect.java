package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
@Aspect
//@Component
@Order(1)
public class LoggingAspect {
// 146 - класс будет иметь аннотацию @Aspect, т.к он будет работать с Proxy

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//    }
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineFromUniLibrary() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineFromUniLibrary: Log #10");
//    }

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: Log #1");
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: Log #2");
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() {
//    }
//
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: Log #3");
//    }


    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        // FIXME С помощью JoinPoint получаем СИГНАТУРУ метода - модификатор доступа, ТД ... и ТД параметров/аргументов
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature() = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            // FIXME С помощью joinPoint.getArgs(); мы получаем ПАРАМЕТРЫ/АРГУМЕНТЫ метода
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название "
                            + myBook.getName() + ", автор: " + myBook.getAuthor()
                            + ", год издания: " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("Книгу в библиотеку добавляет " + obj);

                }
            }
        }
        System.out.println("beforeAddLoggingAdvice: Логирование попытки получить книгу/журнал");
        System.out.println("------------------------------------");
    }
// 147 - данный метод называют pointcut. т.к он должен выполнится сквозной код, существует несколько типов (смотри слайды выше). -> Test1
}
