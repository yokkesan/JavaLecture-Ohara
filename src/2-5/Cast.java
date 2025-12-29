
// 自動変換とキャスト（強制変換）
// public class Cast{

//     public static void main(String[] args) {

//         // int → long → float → double

//         int a = 10;

//         double b = a;

//         // double a = 10.5;

//         // int b = a;

//         System.out.println(a);

//         System.out.println(b);

//     }
// }

// 重要：変数は「箱」ではなく「型付きの値」静的型付け言語だから
// 右辺の型から左辺の型への「自動型変換が許可されているか」だけを見る

// 演算時の自動変換
public class Cast{

    public static void main(String[] args) {

        double d = 8.5 / 2; // int → double

        long l = 5 + 2L;

        System.out.println(d);

        System.out.println(l);
    }
}