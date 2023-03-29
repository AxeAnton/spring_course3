package aop;

import aop.aspects.*;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//@ComponentScan("aop")
@EnableAspectJAutoProxy
public class MyConfig {
// 144 - создали класс, проставили аннатацию @Configuration и @EnableAspectJAutoProxy (т.к, будет работать с Proxi), а @ComponentScan("aop") закаментил, т.к он у меня НЕ работает (не знаю почему),
    @Bean
    public UniLibrary uniLibrary(){
        return new UniLibrary();
    }
    @Bean
    public LoggingAspect loggingAspect(){
        return new LoggingAspect();
    }
    // 145 - вместо него использую аннотации, над методами тех классов бины которых будут созданы -> LoggingAspect.
    @Bean
    public SchoolLibrary schoolLibrary(){
        return  new  SchoolLibrary();
    }
    @Bean
    public Book book(){
        return  new Book();
    }
    @Bean
    public ExceptionHandlingAspect exceptionHandlingAspect(){
        return new ExceptionHandlingAspect();
    }
    @Bean
    public SecurityAspect securityAspect(){
        return new SecurityAspect();
    }
    @Bean
    public University university(){
        return new University();
    }
    @Bean
    public UniversityLoggingAspect universityLoggingAspect(){
        return new UniversityLoggingAspect();
    }
    @Bean
    public NewLoggingAspect newLoggingAspect() {return  new NewLoggingAspect();}

}
