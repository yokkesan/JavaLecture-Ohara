// 条件分岐
public class Main {
    public static void main(String[] args) {
        boolean tenki = true;
        if (tenki = true) { //キーワード
            System.out.println("洗濯します");
            System.out.println("散歩に行きます");
        } else {
            System.out.println("映画を観ます");
        }
    }
}


// 実際

public class Main {
    public static void main(String[] args) {
        boolean tenki = true;

        if (tenki) {
            System.out.println("洗濯します");
            System.out.println("散歩に行きます");
        } else {
            System.out.println("映画を観ます");
        }
    }
}