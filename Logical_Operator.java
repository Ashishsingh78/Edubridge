
public class Logical_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 200;
		int c = 500;
		boolean bn;
		bn = (a == 100) && (b == 200) && (c == 300);
		System.out.println("&& symbol : " + bn);
		bn = (a == 200) && (b == 100) && (c == 452);
		System.out.println("&& symbol : " + bn);
		bn = (a == 150) || (b == 250) || (c == 300);
		System.out.println("|| symbol : " + bn);
		bn = (a == 450) || (b == 350) || (c == 120);
		System.out.println("|| symbol : " + bn);
		bn = !(140 == 150);
		System.out.println("! symbol : " + bn);
	
	}

}
