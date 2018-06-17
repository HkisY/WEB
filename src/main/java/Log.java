import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Hxin
 * @describe
 * @since 2018/3/27 上午9:38
 */
@Component
@Aspect
public class Log {
    @Pointcut(value="execution(* Fruit..*.*(..))")
    public void point(){

    }
    @Before(value="point()")
    public void before(){
        System.out.println("Method start!");
    }

}
