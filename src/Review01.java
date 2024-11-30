
public class Review01 {

    public static void main(String[] args) {
        //税抜き価格を設定
        int priceWithoutTax = 1500;
        //消費税率を設定（%）
        int taxPercent = 10;
        
        //消費税額の算出
        int tax = getTax(priceWithoutTax,taxPercent);
        
        //税込価格の算出
        int priceIncludingTax = priceWithoutTax + tax;
        
        //演算結果の表示
        System.out.println(priceWithoutTax + "円の商品の税込価格は" + priceIncludingTax + "円（消費税は" + tax + "円）です。");
    }
    public static int getTax(int priceWithoutTax,int taxPercent) {
        int tax = priceWithoutTax * taxPercent / 100;
        int priceIncludingTax = priceWithoutTax + tax;
        return tax;
        //return priceIncludingTax;
    }

}
