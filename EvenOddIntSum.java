import java.util.Scanner;
public class EvenOddIntSum {
    public static void main(String args[]) {

Scanner stdin = new Scanner(System.in);
int number = 1;
int even = 0;
int evenCount = 0;
int odd = 0;
int oddCount = 0;
while (stdin.hasNextInt() && number > 0){
	number = stdin.nextInt();
	if(number % 2 == 0 && number > 0){
		even = even + number;
		evenCount = evenCount + 1;
	}
	if (number % 2 != 0 && number > 0){
		odd = odd + number;
		oddCount = oddCount + 1;
	}
}
System.out.println(even + " " + odd + " " + evenCount + " " + oddCount);
}
}
//requires stdin input