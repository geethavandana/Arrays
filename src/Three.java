
public class Three {
	public static void main(String[] args) {
		int s[]={1,4,34,56,7};
		int i,n=0;
		int a=Integer.parseInt(args[0]);
		for(i=0;i<s.length;i++) {
			if(s[i]==a) {
				n++;
				break;
			}
		}
		if(n==0)
			System.out.println(-1);
		else
			System.out.println(i);
	}

}
