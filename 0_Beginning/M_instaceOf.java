class demo {}
class demo2 extends demo {}


public class M_instaceOf {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s instanceof String);

        demo2 d2 = new demo2();
        System.out.println(d2 instanceof demo);
    }
}
