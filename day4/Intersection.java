package week1.day4;

public class Intersection {
	public static void main(String[]args) {
		int a[]= {0,4,3,5,6,8};
		int b[]= {2,3,7,5,8,9};
		for(int i=0;i<a.length;i++) {
		for(int j=1;j<b.length;j++) {
			if (a[i]==b[j]) {
            System.out.println(b[j]);
		}
		}
		}
	}

}

