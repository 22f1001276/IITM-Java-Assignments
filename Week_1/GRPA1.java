import java.util.*;
public class GRPA1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            sum += j*j;
        }
    }
System.out.println(sum);
    sc.close();
  }
}