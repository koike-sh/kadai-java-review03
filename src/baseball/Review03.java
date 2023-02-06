package baseball;

public class Review03 {

    public static void main(String[] args) {
        // 東京ヤクルトスワローズ
        BaseBallTeam yakult = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        String result = yakult.report();
        System.out.println(result);

        // 横浜DeNAベイスターズ
        BaseBallTeam baystars = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        String result1 = baystars.report();
        System.out.println(result1);

        // 阪神タイガース
        BaseBallTeam tigers = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        String result2 = tigers.report();
        System.out.println(result2);

        // 読売ジャイアンツ
        BaseBallTeam giants = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        String result3 = giants.report();
        System.out.println(result3);

        // 広島東洋カープ
        BaseBallTeam carp = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        String result4 = carp.report();
        System.out.println(result4);

        // 中日ドラゴンズ
        BaseBallTeam dragons = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);
        String result5 = dragons.report();
        System.out.println(result5);
    }

}
