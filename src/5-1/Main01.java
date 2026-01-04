
public class Main01 {
    public static void methodA() {
        System.out.println("メソッドA");
        methodB();
    }

    public static void methodB(){
        System.out.println("メソッドB");
    }

    public static void main(String[] args) {
        methodA();
    }
}
