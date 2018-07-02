package Homework1;

public class labor3 {

	public static void main(String[] args) {
		int [] numbers = new int[] { 1, 5, 8, 4, 9, 6, 2, 7};
		
		double average = 0;
		if (numbers.length > 0)
		{
		    double sum = 0;
		    for (int j = 0; j < numbers.length; j++) {
		         sum += numbers[j];
		    }
		    average = sum / numbers.length;
		}
		System.out.println(average);
		/*int min = 0;
		for (int m = 0; m < numbers.length; m++);
		System.out.print(numbers[m] + " ");
		System.out.println();*/
}
		
}