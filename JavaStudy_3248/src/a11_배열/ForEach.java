package a11_배열;

public class ForEach {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("-------------------------");
		
		int j = 0;
		for(int num : numbers) {
			if(j % 2 == 0) {
				j++;
				continue;
			}
			System.out.println(num);
			j++;
		}

	}

}
