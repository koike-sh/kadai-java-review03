package baseball;

public class BaseBallTeam {

    // チームの名前
    private String name;
    // 勝ち数
    private int win;
    // 負け数
    private int lose;
    // 引き分け数
    private int draw;

    // 引数なしのコンストラクタ
    public BaseBallTeam() {
    }

    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //勝率を求める処理
    public double getRate() {
        double win_rate = win / ((double) win + lose);
        return win_rate;
    }

    public String report(double win_rate) {
        String result = name + " の2022年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、勝率は " + win_rate + "です。";
        return result;
    }

    }

