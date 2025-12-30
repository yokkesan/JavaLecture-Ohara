
// booleanをそのまま使う
public class Sample1 {
    public static void main(String[] args) {
        boolean tenki = true;

        if (tenki) {
            System.out.println("外に出る");
        } else {
            System.out.println("家にいる");
        }
    }
}

// ② 否定（!）を使う
public class Sample2 {
    public static void main(String[] args) {
        boolean doorClose = false;

        if (!doorClose) {
            System.out.println("ドアは開いている");
        }
    }
}

// ③ 数値比較を条件式にする
public class Sample3 {
    public static void main(String[] args) {
        int age = 19;

        if (age >= 20) {
            System.out.println("お酒OK");
        } else {
            System.out.println("未成年");
        }
    }
}

// ④ 論理 AND（&&）
public class Sample4 {
    public static void main(String[] args) {
        int age = 22;
        boolean hasID = true;

        if (age >= 20 && hasID) {
            System.out.println("入店できます");
        }
    }
}

// ⑤ 論理 OR（||）
public class Sample5 {
    public static void main(String[] args) {
        boolean isHoliday = false;
        boolean isSunday = true;

        if (isHoliday || isSunday) {
            System.out.println("今日は休み");
        }
    }
}

// ⑥ 条件式を組み合わせる（カッコ）

public class Sample6 {
    public static void main(String[] args) {
        int age = 18;
        boolean isStudent = true;

        if (age < 20 && isStudent) {
            System.out.println("学割適用");
        }
    }
}

// ⑦ while で使う条件式
public class Sample7 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 3) {
            System.out.println("ノックする");
            count++;
        }
    }
}
