public class MainPie01 {
    public static void main(String[] args) {
        final double PI = 3.14;
        int pie = 5;
        System.err.println("半径" + pie + "cmの円の面積は");
        System.err.println(PI * pie * pie);
        System.err.println("半径を倍にします");

        PI = 10;
        System.err.println("半径" + pie + "cmの円の面積は");
        System.err.println(PI * pie * pie);
    }
}