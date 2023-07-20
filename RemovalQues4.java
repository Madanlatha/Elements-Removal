package elementRemoval;

import java.util.Arrays;
import java.util.Scanner;

public class RemovalQues4 {
	public static int removal(int ar[]) {
		int n=ar.length;
		for(int i=n-1;i>=0;i--) {
			for(int j=i-1;j>=0;j--) {
				if(ar[i]>ar[j]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}				
		int cost=0;
		for(int i=0;i<n;i++) {
			cost+=ar[i]*(i+1);
		}
		return cost;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int value=removal(ar);
		System.out.println(value);
	}

}
