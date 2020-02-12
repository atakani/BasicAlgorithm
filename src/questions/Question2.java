package questions;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubfindMissing([4,12,9,5,6,1],[4,9,12,6])
			int array1[] = new int[] {1, 2,3,4,5,6};
			int array2[] = new int[] {1};
			int j,ters=0;
			for (int i = 0; i < 5; i++) {
				ters =array1[array1.length-1];
				for (j = array1.length-1; j > 0; j--) {
					array1[j] =array1[j-1];	}
				array1[0]=ters;								  					
			}	
			  System.out.println("Rotate: ");    
		        for(int i = 0; i< array1.length; i++){    
		            System.out.print(array1[i] + " ");    
		        }  
	}
}
