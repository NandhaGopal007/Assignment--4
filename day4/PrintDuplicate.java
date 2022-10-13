package week1.day4;

public class PrintDuplicate {
	public static void main(String[]args) {
		int[] num= {11,22,43,27,54,66,22,27};
		for (int i=0;i<num.length;i++) {
		for(int j=i+1;j<num.length;j++) {
	    if (num [i] == num [j]) {
		System.out.println(num[j]);
	    }
	  }
	}
  }
}

