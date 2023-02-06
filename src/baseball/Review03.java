package baseball;

public class Review03 {

    public static void main(String[] args) {
        // 東京ヤクルトスワローズ
        BaseBallTeam yakult = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        Double win_rate  = yakult.getRate();
        String result = yakult.report(win_rate);
        System.out.println(result);

        // 横浜DeNAベイスターズ
        BaseBallTeam baystars = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        Double win_rate1  = baystars.getRate();
        String result1 = baystars.report(win_rate1);
        System.out.println(result1);

        // 阪神タイガース
        BaseBallTeam tigers = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        Double win_rate2  = tigers.getRate();
        String result2 = tigers.report(win_rate2);
        System.out.println(result2);

        // 読売ジャイアンツ
        BaseBallTeam giants = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        Double win_rate3  = giants.getRate();
        String result3 = giants.report(win_rate3);
        System.out.println(result3);

        // 広島東洋カープ
        BaseBallTeam carp = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        Double win_rate4  = carp.getRate();
        String result4 = carp.report(win_rate4);
        System.out.println(result4);

        // 中日ドラゴンズ
        BaseBallTeam dragons = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);
        Double win_rate5  = dragons.getRate();
        String result5 = dragons.report(win_rate5);
        System.out.println(result5);
    }

}
