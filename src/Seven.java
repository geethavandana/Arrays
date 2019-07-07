
public class Seven {
	public static void main(String[] args)
	{
	int a[]= {12,34,56,12,34,7,99} ;
	int a1[]= new int[7];
	for(int i=0;i<a.length-1;i++)
	{
	for(int j=i+1;j<a.length;j++)
	{
	if(a[i]==a[j])
	a1[j]=1;

	}
	}
	for(int i=0;i<a.length;i++)
	{
	if(a1[i]==0)
	System.out.println(a[i]);
	}


	}

}
