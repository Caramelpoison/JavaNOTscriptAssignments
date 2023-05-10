public class MethodReturnTypes {
    public static void main(String[] args) {

        String name = "Alexander";
        int take = 5;
        boolean boo = false;

        stringReturn(name);
        intReturn(take);
        booReturn(boo);

    }

    public static void stringReturn(String x) {
        System.out.println(x);
    }
    public static void intReturn(int x) {
        System.out.println(x);
    }
    public static void booReturn(boolean x) {
        System.out.println(x);
    }
}