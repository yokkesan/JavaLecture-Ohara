// 配列を引数にして「中身を変更する」例
public class Main01 {

    public static void changeArray(int[] array) {
        array[0] = 100;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        changeArray(array);

        System.out.println(array[0]);
    }
}