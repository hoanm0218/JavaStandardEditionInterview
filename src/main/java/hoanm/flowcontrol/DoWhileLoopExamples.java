package hoanm.flowcontrol;

public class DoWhileLoopExamples {
	public static void main(String[] args) {
		int count = 0;
		// do while also is used when it is not clear how many times loop has to
		// be executed.
		do {
			System.out.print(count);
			count++;
		} while (count < 5);// while this condition is true, loop is executed.
		// output is 01234

		// Code in do while is executed at least once.
		count = 5;
		do {
			System.out.print(count);
			count++;
		} while (count < 5);
		// output is 5
	}
}
