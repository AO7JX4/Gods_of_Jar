package Gyak1;
import java.util.Scanner;

public class Main {

	public static boolean tokeletes(int n)
	{
		
		if(n==1)
		{
			return true;
		}
		int osszeg=0;
		boolean tok=false;
		int osztok[]=new int[n];
	    for (int i=1;i<=n;i++)
	    {
	    	if (n%i==0) {
            	osztok[i-1]=i;
            }
	    	
	    }  
	              
		for(int i=0; i<n-1; i++)
		{
			
			osszeg+=osztok[i];
		}
		if(osszeg==n)
		{
			tok=true;
		}
		return tok;
	}
	
	public static void listaTok(int n)
	{
		for(int i=1; i<n; i++)
		{
			if(tokeletes(i))
			{
				System.out.println(i);
			}
		}
			
	}
	
	public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			int x=in.nextInt();
			listaTok(x);
		}
	}

