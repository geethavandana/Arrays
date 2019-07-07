import java.util.Scanner;
public class Eight {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i,sum=0;
	int a[]=new int[n];
	for(i=0;i<n;i++) {
		a[i]=sc.nextInt();		
	}
	if(a[0]==7&&a[n-1]==6) {
		for(i=0;i<n;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	else {
		for(i=0;i<n;i++) {
			sum=sum+a[i];
			if(a[i]==6) {
				break;
			}
		}
		sum=sum-6;
		for(i=n-1;i>0;i--) {
			sum=sum+a[i];
			if(a[i]==7) {
				break;
			}
		}
		sum=sum-7;
		System.out.println(sum);
		}
}
}
