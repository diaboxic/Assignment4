public class fourthTask {

	public static void main(String[] args) {
		
		int num = 1;
		int r = 3;
		int space = 1;
		
		for (int row = 1; row <=3; row++) {
			
			for (int col = 1; col <space; col++) {
				System.out.print(" ");
				
			}
			
			for (int col = 1; col <=r; col++) {
				System.out.print(num + " ");
				num++;
			}
			
			System.out.println();
			r--;
			space=space+++2;
		}

	}

}
