public class Kuku {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println("");
        }
    }
}

// 中断

public class Kuku {
    public static void main(String[] args) {

        outer: for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 3 && j == 4) {
                    break outer; // 外側 for まで中断
                }
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}

for (int i = 1; i <= 9; i++) {
    for (int j = 1; j <= 9; j++) {
        if (j == 5) {      // 条件
            break;          // 内側 for を中断
        }
        System.out.print(i * j + "\t");
    }
    System.out.println();
}