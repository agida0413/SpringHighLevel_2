package hello.proxy.pureproxy.kim;

public class RealKim implements KimSub{
    @Override
    public String oper() {
        return "ABC";
    }
}
