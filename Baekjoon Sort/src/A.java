import java.util.Scanner;
public class A {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int N= in.nextInt();
			int[] arr= new int[N];
			for(int i =0; i<N;i++) {
				arr[i]=in.nextInt();
				
			}
			
			for(int i =0; i<N-1;i++) {
				for(int j =i+1; j<N;j++) {
					if(arr[i]>arr[j]) {
						int temp =arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
					}
				}
			}
			for(int val : arr) {
				System.out.println(val);
			}
		}
}
