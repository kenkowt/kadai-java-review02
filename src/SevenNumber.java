
public class SevenNumber {

    public static void main(String[] args) {
     // iの値が0から100の間、処理を繰り返す
        for (int i = 1; i <= 100; i++) {
            // iの値が7の倍数の時
            if (i % 7 == 0) {
                // clap!を表示する
                System.out.println("clap!");
            }
            // iの値に7が入っているとき（70台）
            else if (i >= 70 && i <= 79) {
                // clap!を表示する
                System.out.println("clap!");
            }
            // iの値に7が入っているとき（7の倍数、70台以外）
            else if (i == 17 || i == 27 || i == 37 || i == 47 || i == 57 || i == 67 || i == 87 || i == 97) {
                // clap!を表示する
                System.out.println("clap!");
            }
            else {
                // iの値を表示する
                System.out.println(i);
            }
        }
    }

}
