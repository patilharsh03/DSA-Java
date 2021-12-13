import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun();
        // multiple(3, 5, "Harsh", "Patil");
        // demo(4,5,6,7);
        demo("Harsh", "Shubham");
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
