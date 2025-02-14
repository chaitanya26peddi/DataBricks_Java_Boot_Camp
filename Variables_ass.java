
public class Variables_ass {
	public static void Swap2_temp(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("\nAfter Swapping\n a:"+x+"\nb:"+y);
	}
	public static void Swap2(int x, int y) {
		int sum = x+y;
		x = sum-x;
		y = sum-y;
		System.out.println("\nAfter Swapping\n a:"+x+"\nb:"+y);
	}
	public static void Swap3_temp(int x,int y, int z) {
		int temp;
		temp = x;
		x = y;
		y = z;
		z = temp;
		System.out.println("\nAfter Swapping\n a:"+x+"\nb:"+y+"\nc:"+z);
	}
	public static void Swap3(int x,int y, int z) {
		x = x+y+z;
		z = x - (y+z);
		y = x - (z+y);
		x = x - (y+z);
		System.out.println("\nAfter Swapping\n a:"+x+"\nb:"+y+"\nc:"+z);
	}
	public static void Swap4_temp(int x,int y, int z,int w) {
		int temp;
		temp = x;
		x = y;
		y = z;
		z = w;
		w = temp;
		System.out.println("\nAfter Swapping\n a:"+x+"\nb:"+y+"\nc:"+z+"\nd:"+w);
	}
	public static void Swap4(int x,int y, int z,int w) {
		x = x+y+z+w;
		w = x -(z+w+y);
		z = x -(w+y+z);
		y = x -(w+y+z);
		x = x -(y+w+z);
		System.out.println("\nAfter Swapping\n a:"+x+"\nb:"+y+"\nc:"+z+"\nd:"+w);
	}
	
	public static void Jio_plan(int x,int i) {
		System.out.println("\n\nThe final price after adding the 18% gst to the jio silver silver plan is:"+ ((i+100)*x)/100);
	}
	public static void Sam_pizza(int n, double p) {
		System.out.println("\n\nThe total cost of sampath's Pizza after 20% discount is:" + ((n*p)*80)/100);
	}
	public static void Vikram_tax(long x, int y) {
		System.out.println("\n\n The tax amount Vikram has to pay is: "+ (x*y)/100);
	}
	public static void Sarath_interest(double p, double i, int t) {
		System.out.println("\n\n The interest earned by sarath at end of five years is:" + (p*i*t)/100);
	}
	public static void Hima_sal(double sal,int ta,int da,int hra,int pf,int tax) {
		System.out.println("\n\nHima's Gross Salary is:"+ ((100+ta+da+hra)*sal)/100);
		System.out.println("\nHIma's Net Salary is:" + (((100-(pf+tax))*sal))/100);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 6;
		int c = 8;
		int d = 10;
		
		// Swap two numbers with temp
		System.out.println("Q1");
		System.out.println("\nBefore Swapping\n a:"+a+"\n b:"+b);
		Swap2_temp(a,b);
		System.out.println("\n\nQ2");
		// Swap two numbers without temp
		System.out.println("\nBefore Swapping\n a:"+a+"\n b:"+b);
		Swap2(a,b);
		System.out.println("\n\nQ3");
		//Swap three numbers with temp
		System.out.println("\nBefore Swapping\n a:"+a+"\n b:"+b+"\nc:"+c);
		Swap3_temp(a,b,c);
		System.out.println("\n\nQ4");
		//Swap three numbers without temp
		System.out.println("\nBefore Swapping\n a:"+a+"\n b:"+b+"\nc:"+c);
		Swap3(a,b,c);
		System.out.println("\n\nQ5");
		//Swap four numbers with temp
		System.out.println("\nBefore Swapping\n a:"+a+"\n b:"+b+"\nc:"+c+"\nd:"+d);
		Swap4_temp(a,b,c,d);
		System.out.println("\n\nQ6");
		//Swap four numbers without temp
		System.out.println("\nBefore Swapping\n a:"+a+"\n b:"+b+"\nc:"+c+"\nd:"+d);
		Swap4(a,b,c,d);
		System.out.println("\n\nQ7");
		//Jio silver plan final price after 18% gst
		Jio_plan(699,18);
		System.out.println("\n\nQ8");
		// Sampath's Pizzas cost
		Sam_pizza(2,399.0);
		System.out.println("\n\nQ9");
		//Vikram Salary's Tax
		Vikram_tax(85000,20);
		System.out.println("\n\nQ10");
		//Sarath's Interest earned
		Sarath_interest(500000,6.8,5);
		System.out.println("\n\nQ11");
		//Hima's Salary
		Hima_sal(85000,15,20,18,20,25);
		
	}

}
