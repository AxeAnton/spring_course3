package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public  void beforeAddExceptionHandlingAspect(){
        System.out.println("beforeAddExceptionHandlingAspect: ловим/обрабатываем сообщение при попытке получить книгу/журнал");
        System.out.println("------------------------------------");
    }

}
