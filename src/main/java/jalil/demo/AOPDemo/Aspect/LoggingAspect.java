package jalil.demo.AOPDemo.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("@annotation(Loggable)")
    public void logAllMethodCallsPointcut(){

    }

    @Before("logAllMethodCallsPointcut()")
    // @Before("@annotation(Loggable)") or we can inline the Pointcut directly into the Advice
    public void logAllMethodCallsAdvice(){
        System.out.println("From Aspect");
    }

}
