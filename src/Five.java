
public class Five {
	public static void main(String[] args) {
		int a[]= {1,23,54,2,45,6,9};
		int i,j,temp;
		for(i=0;i<a.length;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Smallest two numbers of array: "+a[0]+" and "+a[1]);
		System.out.print("Largest two numbers of array: "+a[a.length-1]+" and "+a[a.length-2]);
		}
}
