// 従来のfor文
public class Extension {
    public static void main(String[] args) {
        int [] scores = {20, 30, 40, 50, 80};
        for(int i = 0; i < scores.length; i++){
            System.out.println(scores[i]);
        }

    }
}


// 拡張
public class Extension {
    public static void main(String[] args) {
        int[] scores = {20, 30, 40, 50, 80};

        for (int score : scores) {
            System.err.println(score);
        }
    }
}