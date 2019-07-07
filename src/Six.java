
public class Six {
	public static void main(String[] args) {
		int a[]= {1,23,54,2,45,6,9};
		int i,j,k,temp;
		for(i=0;i<a.length;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(k=0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}
	}

}
