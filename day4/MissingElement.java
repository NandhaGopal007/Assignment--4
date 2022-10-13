package week1.day4;

public class MissingElement {
	public void main(String[]args) {
		 int[] arr = {1,2,3,4,6,5,8};
	        int n = arr.length + 1;
	        int sum = (n * (n+1)%2);
	        for(int i = 0; i < n; i++) {
	            sum = sum - arr[i];
	        }
	 
	        System.out.println( " Missing Element is" + sum);
	  }
	 
}
