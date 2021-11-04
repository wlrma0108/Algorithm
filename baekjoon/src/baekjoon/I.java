package baekjoon;
import java.util.Scanner;
public class I {
				public static void main(String[] args) {
					Scanner in = new Scanner(System.in);
					String str_A=in.next();
					String str_B=in.next();
					int max_length= Math.max(str_A.length(),str_B.length());
					int[] A=new int[max_length+1];
					int[] B=new int[max_length+1];
					for(int i=str_A.length()-1,idx=0;i>=0;i--,idx++) {
						A[idx]= str_A.charAt(i)-'0';
						
					}
					for(int i=str_B.length()-1,idx=0; i>=0;i--,idx++) {
						B[idx]=str_B.charAt(i)-'0';
						
					}
					for(int i= 0; i<max_length;i++) {
						int value=A[i]+B[i];
						A[i]=value%10;
						A[i+1]+=(value/10);
					}
					StringBuilder sb = new StringBuilder();
					if(A[max_length]!=0) {
						sb.append(A[max_length]);
					}
					for(int i=max_length-1;i>=0;i--) {
						sb.append(A[i]);
						
					}
					System.out.println(sb);
				}
}
