package hello.proxy.pureproxy.kim.dynamic;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

@Slf4j
public class ReflectionTest {

    @Test
    void reflection(){
        Hello target = new Hello();

        log.info("start");
        String result = target.callA();
        log.info("result = {}",result);


        log.info("start");
        String result2 = target.callB();
        log.info("result = {}",result2);
    }

    @Slf4j
    static class Hello{
        public String callA(){
            log.info("callA");
        return  "A";
        }
        public String callB(){
            log.info("callB");
            return  "B";
        }
    }

    @SneakyThrows
    @Test
    void refletion2() throws ClassNotFoundException {
        Class<?> forName = Class.forName("hello.proxy.pureproxy.kim.dynamic.ReflectionTest$Hello");

        Hello target = new Hello();

        Method callA = forName.getMethod("callB");

        Object invoke = callA.invoke(target);
        log.info("result ={}",invoke);
    }



}
