
public class Loops {

	public static void main(String[] args) {
		// Week 2 Coding Assignment Luke Bingham
		
		// While loop that prints all even numbers from 0 to 100
		
		int x = 0;
		while (x <= 100) {
			System.out.println(x);
			x+= 2;
		}
		
		// While loop that prints every 3rd number backwards from 100 to 0
		
		int i = 100;
		while (i >= 0) {
			System.out.println(i);
			i-= 3;
		}
		
		// For loop that prints every other number from 1 to 100
		
		for (int a = 1; a <= 100; a+= 2) {
			System.out.println(a);
		}
		
		// For loop every number from 0 to 100
		// If divisible by 3 prints "Hello"
		// If divisible by 5 prints "World"
		// If divisible by 3 and 5 prints "Hello World"
		
		
		for (int y = 0; y <= 100; y++) {
			if (y % 3 == 0 && y % 5 ==0) {
				System.out.println("Hello World");
			}
			else if (y % 3 == 0) {
				System.out.println("Hello");
			}
			else if (y % 5 == 0) {
				System.out.println("World");
			}
			else {
				System.out.println(y);
			}
			
			
			
				
			
		}
		
	}

}
