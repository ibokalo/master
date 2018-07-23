package HomeWork3;

import java.util.Random;

public class RandomStringGenerator {

	public static void main(String[] args) {

		Random random = new Random();
		int min = 5;
		int max = 15;
		int randomNumber = random.nextInt(max + 1 - min) + min;
		System.out.println(generateRandomString(randomNumber));

	}

	public static String generateRandomString(int length) {
		String letters = new String("abcdefghijklmnopqrstuvwxyz");
		StringBuffer finalWord = new StringBuffer();

		int index = 0;
		for (int i = 0; i < length; i++) {
			index = new Random().nextInt();
			finalWord.append(letters.charAt(i));
		}

		return finalWord.toString();
	}

}
