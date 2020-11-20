package sachin;

import java.util.Scanner;
public class Bubblesort {
      void bubblesort(int arr[]) {
    	  int n=arr.length;
    	  for(int i=0; i<n; i++) {
    		  for(int j=0; j<n-i-1; j++) {
    			  if(arr[j]>arr[j+1]) {
    				  int temp=arr[j];
    				  arr[j]=arr[j+1];
    				  arr[j+1]=temp;
    			  }
    		  }
    	  }
      }
        void printarry(int arr[]) {
    	  for(int i=0; i<arr.length; i++) {
    		  System.out.print(arr[i]+" ");
    		  System.out.println();
    	  }
      }
        public static void main(String[] args) {
  		Bubblesort b=new Bubblesort();
  		int arr[]=new int[5];
  		Scanner sc=new Scanner(System.in);
  		System.out.print("enter the elements of an arr:");
  		int n=arr.length;
  		for(int i=0; i<n; i++) {
  			arr[i]=sc.nextInt();
  		}
  		sc.close();
  		b.bubblesort(arr);
  		b.printarry(arr);
  	}
}
