package com.dsa;

public class MissingNoInArray 
{
	public static void main(String[] args) 
	{
		int arr[] = { 1, 2, 3, 4, 6, 7, 8, 9 };
		int res=m(arr);
		
	}

	private static int m(int[] arr) {
		for(int i=1;i<=9;i++)
			{
				Boolean flag=false;
	             
				for(int j=0;i<=arr.length-1;j++)
				{
					if(arr[j]==i)
					{
						flag=true;
						break;
						
					}
				}
				if(flag==false)
				{
				   return i;
				}
			
			
			}
		return 0;
	}
}

	

//	private static int m1(int[] arr) 
//	{
//		for(int i=1;i<=9;i++)
//			{
//				Boolean flag=false;
//	             
//				for(int j=0;i<=arr.length-1;i++)
//				{
//					if(arr[j]==i)
//					{
//						flag=true;
//						break;
//						
//					}
//				}
//				if(flag==false)
//				{
//				   return i;
//				}
//			
//			
//			}
//		
//
//	
//		
//	
//	
//}
//}
/*
 * Method 1 of solving this Problem statement
 * 
int arr[] = { 1, 2, 3, 4, 6, 7, 8, 9 };
int sum = 0;
int total = 0;

for (int i = 0; i <= arr.length - 1; i++) {
	total = total + arr[i];
}
for (int i = 0; i <= 9; i++) {
	sum = sum + i;
}
int missingelement = sum - total;
System.out.println("missing element :" + missingelement);
}
*/

