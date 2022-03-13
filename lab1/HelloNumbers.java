public class HelloNumbers {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while (x < 9) {
			x = x + 1;
			y = y + x;
			System.out.print(y + " ");
		}
	}
}