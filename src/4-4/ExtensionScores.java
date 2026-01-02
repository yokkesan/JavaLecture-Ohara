public class ExtensionScores {
    public static void main(String[] args) {
        int[] scores = {20, 30, 40, 50, 80};

        int sum = 0;

        // 全員分の点数を合計する
        for (int score : scores) {
            sum += score;
        }

        double average = (double) sum / scores.length;

        System.out.println("合計点: " + sum);
        System.out.println("平均点: " + average);
    }
}