package onlyfun.caterpillar;

public class ProxyDemo {
    public static void main(String[] args) {
        IHello proxy = new HelloProxy(new HelloSpeaker());
        proxy.hello("Steven");
    }
}