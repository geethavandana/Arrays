
public class Two {
	public static void main(String[] args) {
		int a[]= {12,2,3,64,12,34};
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(min+" is the minimum value");
		System.out.println(max+" is the maximum value");
	}
}
