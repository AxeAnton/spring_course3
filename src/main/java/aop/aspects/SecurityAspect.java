package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
@Aspect
@Order(2)
public class SecurityAspect {

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeAddSecurityAdvice: Проверка прав " +
                "на получение книги или журнала");
        System.out.println("------------------------------------");
    }
}
