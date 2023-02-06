// 人間クラス
public class Human {
    // フィールドの定義
    String name;           // 氏名
    int age;               // 年齢
    Company company;       // 勤務先
    String prefecture;     // 現住地

    // ...(他のフィールドは省略)...

    // メソッドの定義
    void introduce() {     // 自己紹介する
        System.out.println("わたしの名前は" + name + "です。");
    }

    void talk() {          // 話す
        // ...(内容は省略)...
    }

    // ...(他のメソッドは省略)...
}