public class fifthTask {

	public static void main(String[] args) {
		
		int num = 1;
		int space = 4;
		
		for (int row = 1; row <=5; row++) {
			
			for (int col = 1; col <=space; col++) {
				System.out.print(" ");
				
			}
			
			for (int col = 1; col <=row; col++) {
				System.out.print(num + " ");
				num++;
			}
			
			System.out.println();
			space=space---2;
			row++;
		}

	}

}
