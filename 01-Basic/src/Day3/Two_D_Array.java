package Day3;

public class Two_D_Array {

	public static void main(String[] args) {
		
		int[] [] marks = {
				{65,50,64,43,33},
				{53,45,34,49,24},
				{56,35,53,35,23}
		};
		
		String[] names = {"John", "Yuri", "Cherry"};
		
//		Output
		
		for(var r = 0; r < 3 ; r++) {
			for(var c = 0; c < 5 ; c++) {
				System.out.println(marks[r][c] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\t----- For Each -----");
		for(int [] row : marks) {
			for(int col : row) {
				System.out.print(col + "\t");
			}
			System.out.println();
		}
		
//		System.out.println(Arrays.deepToString(marks));
		
		int row = marks.length;
		int col = marks[0].length;
		for(var i = 0; i < row; i++) {
			var total = 0;
			for(var j = 0; j < col; j++) {
				total += marks[i][j];
			}
			System.out.println("Total mark obtained by student " + names[i] + " : " + total + " marks.");
			System.out.println("Average mark : " + (float)total/5 + " marks.");
			System.out.println("-----------------------");
		}
		
	}

}
