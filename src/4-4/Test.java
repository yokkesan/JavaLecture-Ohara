
// public class Test {
//     public static void main(String[] args) {

//         int sansu = 20;

//         int kokugo = 30;

//         int rika = 40;

//         int eigo = 50;

//         int syakai = 80;

//         int sum = sansu + kokugo + rika + eigo + syakai;

//         int avg = sum / 5;

//         System.out.println("合計点；" + sum);

//         System.out.println("平均点；" + avg);
//     }
// }


// 配列にした場合

public class Test {
    public static void main(String[] args) {

        int[] scores = {20, 30, 40, 50, 80};

        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        int avg = sum / scores.length;

        System.out.println("i");
        System.out.println("合計点：" + sum);
        System.out.println("平均点：" + avg);
    }
}