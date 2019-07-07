
public class One {

		public static void main(String[] args) {
			int sum=0;
			float avg;
			int a[]= {24,3,34,12,35,8};
			for(int i=0;i<a.length;i++) {
				sum=sum+a[i];
			}
			avg=(float)sum/a.length;
			System.out.println(sum);
			System.out.println(avg);
		}
		}


