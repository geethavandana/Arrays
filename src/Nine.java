
public class Nine {
	  public static void main(String args[])
	    {
	    int l=args.length;
	    int i,j,k=0;
	    int a[][] = new int[2][2];
	    if(l<4)
	    {
	    System.out.println("Please enter 4 integer numbers");
	    }
	    if(l==4)      
	    {
	    for(i=0;i<2;i++)
	    {
	        for(j=0;j<2;j++)
	        {          
	        a[i][j]=Integer.parseInt(args[k]);
	        k++;
	        }
	    }
	    System.out.println("The given array is:");
	    for(i=0;i<2;i++)
	    {
	        for(j=0;j<2;j++)
	        {
	        System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	        
	    }
	    System.out.println("The reverse of array is:");
	    for(i=1;i>=0;i--)
	    {
	        for(j=1;j>=0;j--)
	        {
	        System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	        
	    }   
	    }  
	    }

}
