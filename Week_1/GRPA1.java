public class GRPA1 {
    public static int seriesSum(int n) {
        int sum = 0;
        if (n <= 0) {
            return sum;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j*j;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(seriesSum(2));
    }
}
