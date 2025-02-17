import java.util.Scanner;
public class Operators_ass {
	
	public static void q1(Scanner scn) {
		System.out.println("\nEnter two numbers:");
		int x = scn.nextInt();
		int y = scn.nextInt();
		System.out.println("The result of performing addition operation is: "+ (x+y));
		System.out.println("The result of performing subtraction operation is: "+ (x-y));
		System.out.println("The result of performing division operation is: "+ (x/y));
		System.out.println("The result of performing multiplication operation is: "+ (x*y));
		System.out.println("The result of performing Modulus operation is: "+ (x%y));
		
	}
	
	public static void q2(Scanner scn) {
		System.out.println("\nEnter a number:");
		int x = scn.nextInt();
		System.out.println("Preincrement:"+ (++x));
		System.out.println("Postincrement:"+ (x++));
		System.out.println("Predecrement:"+ (--x));
		System.out.println("Postidecrement:"+ (x--));
	
	}
	
	public static void q3(Scanner scn) {
		System.out.println("Enter a number:");
		int x = scn.nextInt();
		System.out.println("The result of performing addition and assign operation on 2 is: "+ (x+=2));
		System.out.println("The result of performing subtraction and assign operation on 2 is: "+ (x-=2));
		System.out.println("The result of performing multiplication and assign operation on 2 is: "+ (x*=2));
		System.out.println("The result of performing divion and assign operation on 2 is: "+ (x/=2));		
		System.out.println("The result of performing modulo and assign operation on 2 is: "+ (x%=2));


	}
	
	public static void q4(Scanner scn) {
		System.out.println("\nEnter two numbers:");
		int x = scn.nextInt();
		int y = scn.nextInt();
		System.out.println("Relation check for == operator:" + (x==y));
		System.out.println("Relation check for != operator:" + (x!=y));
		System.out.println("Relation check for > operator:" + (x>y));
		System.out.println("Relation check for < operator:" + (x<y));
		System.out.println("Relation check for >= operator:" + (x>=y));
		System.out.println("Relation check for <= operator:" + (x<=y));
	}
	
	public static void q5(Scanner scn) {
		System.out.println("\nEnter two booleans:");
		Boolean x = scn.nextBoolean();
		Boolean y = scn.nextBoolean();
		System.out.println("Result of logical AND:" + (x && y));
		System.out.println("Result of logical OR:" + (x || y));
		System.out.println("Result of logical NOT on second input:" + (!y));
	}
	
	public static void q6(Scanner scn) {
		System.out.println("\nEnter two numbers:");
		int x = scn.nextInt();
		int y = scn.nextInt();
		System.out.println("Result of bitwise AND:" + (x&y));
		System.out.println("Result of bitwise Or:" + (x|y));
		System.out.println("Result of bitwise xor:" + (x^y));
		System.out.println("Result of bitwise complememnt on first input:" + (~x));
		System.out.println("Result of left shift on second input by 2:" + (y<<2));
		System.out.println("Result of right shift on second input by 2:" + (y>>2));
	}
	
	public static void q7(Scanner scn) {
		System.out.println("Enter a number:");
		int x = scn.nextInt();
		String res = ((x%2)==0)? "Even" : "Odd";
		System.out.println(res);
	}
	
	public static void q8(Scanner scn) {
		System.out.println("\nEnter three numbers:");
		int x = scn.nextInt();
		int y = scn.nextInt();
		int z = scn.nextInt();
		if ((x + y > z) && (y != 0)) {
			System.out.println(((x + y > z) && (y != 0)));
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("\n\nQuestion 1");
		q1(scn);
		System.out.println("\n\nQuestion 2");
		q2(scn);
		System.out.println("\n\nQuestion 3");
		q3(scn);
		System.out.println("\n\nQuesion 4");
		q4(scn);
		System.out.println("\n\nQuesion 5");
		q5(scn);
		System.out.println("\n\nQuesion 6");
		q6(scn);
		System.out.println("\n\nQuesion 7");
		q7(scn);
		System.out.println("\n\nQuesion 8");
		q8(scn);

	}

}
