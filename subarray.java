package class5;

public class subarray {
	public static void main(String[] args) {

		int a[] = { 5, 3, 2, 4, 6, 8,1 };
						
			
	int max=0;
	
		for (int i = 0; i < a.length-1; i++) {
			int j=i;
			while (a[j] < a[j + 1] && j < a.length-1) {
				j++;
			
			}
		if (j-i> max) {
				max = j - i;
				System.out.println("i:"+i);
				System.out.println("j:"+j);
			System.out.println("update length of subarray:"+max);
		}
	}
	}
}
