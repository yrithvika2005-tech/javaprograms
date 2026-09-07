
public class ExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0;
		System.out.println("Exception Demo");
		try {
			c=a/b;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Result: "+c);
	}

}
