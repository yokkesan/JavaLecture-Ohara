public class Main01 {

    // 引数が2つのaddメソッド
    public static int add(int x, int y) {
        return x + y;
    }

    // 引数が3つのaddメソッド
    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static void main(String[] args) {

        System.out.println("10 + 20 = " + add(10, 20));
    }
}