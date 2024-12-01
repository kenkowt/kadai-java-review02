
public class Triangle {

    public static void main(String[] args) {
     // 代入する数値は自由に変更してください
        int a = 4;
        int b = 4;
        int c = 4;
        
        //三角形の種類を判定
        if (a == b && a == c) {
            System.out.println("正三角形です");
        } else if (a == b || a == c || b == c) {
            System.out.println("二等辺三角形です");
        } else {
            System.out.println("不等辺三角形です。");
        }
        
    }

}
