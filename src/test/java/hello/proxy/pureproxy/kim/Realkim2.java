package hello.proxy.pureproxy.kim;

public class Realkim2 implements KimSub{
    private KimSub kimSub;

    public Realkim2(KimSub kimSub) {
        this.kimSub = kimSub;
    }

    @Override
    public String oper() {
       String a= kimSub.oper()+"ddd";
        return a;
    }
}
