package scjp.test;

public class TestFor3Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="*";
//		for (int i=1; i<6 ;i++) {
//			System.out.println(s);
//			s = s + "*";
//		}
		
		for (int i=1; i<6 ;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
