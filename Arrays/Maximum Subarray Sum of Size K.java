// Maximum Subarray Sum of Size K using Sliding Window
import java.util.Scanner;
class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your code here
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            for(int i=0;i<k;i++) {
                sum += arr[i];
            }
            int max = sum;
            for(int i=k;i<n;i++) {
                sum = sum - arr[i-k] + arr[i];
                max = Math.max(max,sum); 
            }
            System.out.println(max);
        }
   }
}
