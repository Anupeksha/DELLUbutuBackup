package Operators;

/**
 *
 *      2D Array and Jagged Array
 * */
class MultidimenArray {

	public static void main(String[] args) {

		int[][] myArray = {
				{2, 45, 6, 32},
				{4, 65, 34},
				{7, 8, 12, 5}
		};

		for (int r = 0; r < myArray.length; r++) {
			for (int c = 0; c < myArray[r].length; c++) {
				System.out.print(myArray[r][c] + " ");
			}
			System.out.println();
		}

		// WAP to find sum

		int sum = 0;
		for (int[] aMyArray: myArray) {
			for (int anMyArray: aMyArray) {
				sum = sum + anMyArray;
			}
		}

		System.out.println("Sum is: " + sum);

		int[][] myArr = {
				{20, 40, 60, 80},
				{10, 90},
				{25, 5, 15}
		};

//		for (int[] i:myArr)
//		{
//			for (int j:i)
//			{
//				System.out.print(j);
//				System.out.print("\t");
//			}
//			System.out.println();
//		}

		for (int i=0;i<myArr.length;i++)
		{
			for (int j=0;j<myArr[i].length;j++)
			{
				System.out.print("["+i+"]["+j+"]"+myArr[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
