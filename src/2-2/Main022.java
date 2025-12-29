public class Main022 {
    public static void main(String[] args) {

        String prof1 = "名前:浅香あゆみ\n（あさかあゆみ）"; //\nの後に改行されない

        String prof2 =  """
                        名前:水門雄介
                        （みなとゆうすけ）
                        """;


        System.out.println(prof1);
        System.out.println(prof2);
    }
}