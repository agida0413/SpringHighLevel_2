package hello.proxy.pureproxy.decorator;

import hello.proxy.pureproxy.decorator.code.*;
import hello.proxy.pureproxy.kim.KimSub;
import hello.proxy.pureproxy.kim.RealKim;
import hello.proxy.pureproxy.kim.Realkim2;
import hello.proxy.pureproxy.kim.Realkim3;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class DecoratorPatternTest {

    @Test
    void noDecorator() {
        Component realComponent = new RealComponent();
        DecoratorPatternClient client = new DecoratorPatternClient(realComponent);
        client.execute();
    }

    @Test
    void decorator1() {
        Component realComponent = new RealComponent();
        Component messageDecorator = new MessageDecorator(realComponent);
        DecoratorPatternClient client = new DecoratorPatternClient(messageDecorator);
        client.execute();
    }

    @Test
    void decorator2() {
        Component realComponent = new RealComponent();
        Component messageDecorator = new MessageDecorator(realComponent);
        Component timeDecorator = new TimeDecorator(messageDecorator);
        DecoratorPatternClient client = new DecoratorPatternClient(timeDecorator);
        client.execute();
    }


    @Test
    void decorator3() {
        KimSub kimSub = new RealKim();
      Realkim2 realkim2 = new Realkim2(kimSub);
        Realkim3 realkim3 = new Realkim3(realkim2);
       String b =  realkim3.oper();
        log.info("b={}",b);


    }
}
