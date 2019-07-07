
public class Ten {
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int l=args.length;
		int i,j,k=0;
		int max=0;
		if(l<9) {
			System.out.println("Please enter 9 integer numbers");
		}
		if(l==9) {
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					a[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
			System.out.println("The given array is :");
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					if(a[i][j]>max) {
						max=a[i][j];
					}
				}
			}
			System.out.println("The biggest number in the given array is: "+max);
		}
			
		}

}
