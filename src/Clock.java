
public class Clock {

    public static void main(String[] args) {
        getSeconds(18,32,47);
    }
    
    public static void getSeconds(int hour, int min, int sec) {
        int result = hour * 60 * 60 + min * 60 + sec;
        System.out.println("秒数：" + result + "秒");
    }

}
