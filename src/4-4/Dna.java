// public class Dna {
//     public static void main(String[] args) {

//         int[] seq = new int[10];

//         // 塩基配列をランダムに生成（0～3）
//         for (int i = 0; i < seq.length; i++) {
//             seq[i] = new java.util.Random().nextInt(4);
//         }

//         // 生成した塩基配列の記号を表示
//         for (int i = 0; i < seq.length; i++) {
//             switch (seq[i]) {
//                 case 0 -> {
//                     System.out.print("A ");
//                 }
//                 case 1 -> {
//                     System.out.print("T ");
//                 }
//                 case 2 -> {
//                     System.out.print("G ");
//                 }
//                 case 3 -> {
//                     System.out.print("C ");
//                 }
//             }
//         }
//     }
// }


public class Dna {
    public static void main(String[] args) {

        char[] base = {'A', 'T', 'G', 'C'}; // 文字（char）を複数まとめて持つための配列変数

        for (int i = 0; i < 10; i++) {
            int r = new java.util.Random().nextInt(4);
            System.out.print(base[r] + " ");
        }
    }
}