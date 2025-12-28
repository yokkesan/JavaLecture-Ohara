public class MainPie {
    public static void main(String[] args) {
        double pi = 3.14;
        double radius = 5;
        System.err.println("半径" + radius + "cmの円の面積は");
        System.err.println(pi * radius * radius);
        System.err.println("半径を倍にします");

        radius = 10;
        System.err.println("半径" + radius + "cmの円の面積は");
        System.err.println(pi * radius * radius);
    }
}