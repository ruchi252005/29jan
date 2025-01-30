public class FirstTypeFunction {
	static void pattern(char ch,int num) {
		for(int i=1;i<=num;i++) {
			System.out.println(ch);
		}
		System.out.println("");
		System.out.println("############");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern('#',10);
		System.out.println("hello");
		pattern('%',6);
		System.out.println("welcome");
		pattern('&',4);
		System.out.println("hyd");
		}
}

