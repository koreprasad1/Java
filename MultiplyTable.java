import java.util.Scanner;

public class MultiplyTable {

	public static void main(String[] args) {
		System.out.println("Enter the No.");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= 12; i++) {
        
            System.out.println(N + " X " + i + " = "
                               + N * i);
	}
	}
}
