package com.revision;

public class MissingElementInArray_Day7
{
	public static void main(String[] args) {
		 int[] arr = {1, 2, 4, 5, 6}; 
		 int totalsum=0;
		 int actulsum=0;
		 for(int num:arr) {
			 actulsum=actulsum+num;
		 }
		 for(int i=1;i<=6;i++) {
			 totalsum=totalsum+i;
		 }
		 System.out.println("Missing element :"+(totalsum-actulsum));
	}

}
