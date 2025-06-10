package hello.proxy.pureproxy.kim;

public class Realkim3 implements KimSub{
    private KimSub kimSub;

    public Realkim3(KimSub kimSub) {
        this.kimSub = kimSub;
    }

    @Override
    public String oper() {
       String b =  kimSub.oper()+"ccc";
        return b;
    }
}
