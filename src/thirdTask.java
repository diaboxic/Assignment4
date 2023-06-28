public class thirdTask {

	public static void main(String[] args) {
		
		int num = 1;
		int r = 3;
		
		for (int row = 1; row <=3; row++) {
			
			for (int col = 1; col <=r; col++) {
				System.out.print(num + " ");
				num++;
			}
			
			System.out.println();
			r--;
		}

	}

}
