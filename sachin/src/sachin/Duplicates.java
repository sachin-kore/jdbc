package sachin;

public class Duplicates {
		void PrintDuplicates(int arr[],int size) {
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr.length; j++) {
					if(arr[i]==arr[j]) {
						System.out.println("print duplicate elements:"+arr[i]+" ");
					}
				}
			}
		}
		public static void main(String[] args) {
	         Duplicates d=new Duplicates();
			int arr[]= {4,2,4,52,3,1};
			
	}

}
