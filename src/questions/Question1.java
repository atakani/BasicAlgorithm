package questions;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubfindMissing([4,12,9,5,6,1],[4,9,12,6])
			int array1[] = new int[]{4,12,9,5,6,1};
			int array2[] = new int[] {4,9,12,6};
			int j;
			for (int i = 0; i < array1.length; i++) {
				for (j = 0; j < array2.length; j++)
					if (array1[i]==array2[j]) {
						break;					}
				if (j==array2.length) {
					System.out.print(array1[i] + " ");
				}					
			}			
	}
}
