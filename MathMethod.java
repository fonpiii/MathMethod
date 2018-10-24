import java.util.*;
class  MathMethod {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

				System.out.print("Enter number (x) : ");
			int number1 = sc.nextInt();
				System.out.print("Enter number (y): ");
			int number2 = sc.nextInt();

				System.out.println("===========================");
			int functionf = f(number1);
				System.out.println("ANS f(x) = x + 5 : "+functionf);

			int functiong = g(number1, number2);
				System.out.println("ANS g(x, y) = x + y : "+functiong);

			int functionh = h(number1);
				System.out.println("ANS g(x, f(x)) : "+functionh);
				System.out.println("===========================");
		}

	

		public static int f(int x) {
				return x + 5;
		}
		
		public static int g(int x, int y) {
				return x + y;
		}
	
		public static int h(int x) {
				return g(x, f(x));
		}
}
