import java.util.*;
class Main{
    public static void main(String arg[]){
         //write your code here
         Scanner sc = new Scanner(System.in);
         int largest = Integer.MIN_VALUE;
         int secondlargest = Integer.MIN_VALUE;
         while(true) {
            int n = sc.nextInt();
            if(n==-1) {
                break;
            }
            if(n > largest) {
                secondlargest = largest;
                largest = n;
            } else if(n>secondlargest && n!=largest) {
                secondlargest = n;
            }
         }
         System.out.println(secondlargest);
    }
}

Time : O(n) Space : O(1)
