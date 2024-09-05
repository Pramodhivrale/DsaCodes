package com.dsa1;

public class SquereBinary {
	public static int findSquareRoot(int key, int high, int low) {
	    while (low <= high) {
	        int mid = (low + high) / 2;
	        int midSquared = mid * mid;

	        if (midSquared == key) {
	            return mid;
	        } else if (midSquared > key) {
	            high = mid - 1;
	        } else {
	            low = mid + 1;
	        }
	    }

//	    // Return the closest integer square root
//	    if (high * high <= key) {
//	        return high;
//	    } else {
//	        return low - 1;
//	    }
	    return 0;
	}

	public static void main(String[] args) {
      SquereBinary s=new SquereBinary();
      int key=16;
      int high=25;
      int low=1;
      
      int index = findSquareRoot(key,high,low);
      System.out.println(index);
      
	}

}
