package com.dsa1;

public class Cabinate_Partationing 
{
	public static void main(String[] args) {
		int arr[]= {3,5,2,7,1,9,4,8,10,2,7,4};
		int n=arr.length;
		int k=4;
		int ans=solve(arr,n,k);
		System.out.println(ans);
	}

	private static int solve(int[] arr, int n, int k) {
	   int low=max(arr);
	   int high=sum(arr);
	   int ans=0;
	   
	   while (low <= high)
	   {
		   int mid=(low+high)/2;
		   int val=partition(arr,n,k,mid);
		   if(val < k) {
			   high =mid-1;
		   }
		   else if (val > k) {
			low=mid+1;
		}
		   else if (val == k) {
			ans=mid;
			high=mid-1;
		}
		   
		
	   }
		return ans;
	}

	private static int partition(int[] arr, int n, int k, int mid) {
		int part=1;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(sum+arr[i]> mid) {
				sum=arr[i];
				part++;
			}
			else {
				sum=sum+arr[i];
			}
		}
		return part;
	}

	private static int sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

	private static int max(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
