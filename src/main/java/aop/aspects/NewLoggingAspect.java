package aop.aspects;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class NewLoggingAspect {

    @Around("execution( public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(
            ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        // ProceedingJoinPoint - связь с тагет(БЛ) методом,
        // необходим, что бы в ручную запустить нас метод.
        System.out.println("aroundReturnBookLoggingAdvice: " +
                "В библиотеку пытаются вернуть книгу");
//        long begin = System.currentTimeMillis();
        Object targetMethodResult = null;
// FIXME ВАЖНЫЙ момент перед помещением targetMethodResult в
//  try/ catch необходимо вынести переменную из блокировки зоны видимости.
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        }
        catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice: " +
                    "было поймано исключение");
//            throw e;
// FIXME проброс исключения

           targetMethodResult = "Неизвестное название книги";
// FIXME Пример того что внутри Advice мы можем обрабатывать исключения.
        }
                targetMethodResult = "Преступление и наказание";
//        long finish = System.currentTimeMillis();
        System.out.println("aroundReturnBookLoggingAdvice: " +
                "В библиотеку успешно вернули книгу");
//        System.out.println("aroundReturnBookLoggingAdvice: "
//                "Метод returnBook выполняет работу за " + (finish-begin) + " миллисекунд");
        return targetMethodResult;
    }

}
