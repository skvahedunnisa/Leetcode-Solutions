import java.util.*;

class Main{
	public static void main(String args[])
	{
		//Write your code here...
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int max = arr[i];
			int count = 0;
			for(int j=i+1;j<n;j++) {
				if(max<arr[j]) {
					count++;
				}
			}
			if(count == 0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
