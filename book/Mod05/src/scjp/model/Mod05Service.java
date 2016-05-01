package scjp.model;

public class Mod05Service {
	public String isOddEvenByIf(int num) {
		if(num%2 == 0) {
			return "is Even";
		}else {
			return "is Odd";
		}
	}
	
	public String isOddEvenBySwitch(int num) {
		String s;
		switch (num%2) {
			case 0:
				s = "is Even";
				break;
			case 1:
			case -1:
				s = "is Odd";
				break;
			default:
				s = "What!";
		}
		
		return s;
	}
	
	public void print99MultiplicationTableByFor() {
		for(int i=1; i<10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i + " * " + j + " = " + i*j +"\t");
			}
			System.out.println();
		}
	}
	
	public void print99MultiplicationTableByWhile() {
		int i=1,j=1;
		while(i<10) {
			while(j<=i) {
				System.out.print(i + " * " + j + " = " + i*j +"\t");
				j++;
			}
			i++;
			j = 1;
			System.out.println();
		}
	}
	
	public void print99MultiplicationTableByDoWhile() {
		int i=1,j=1;
		do {
			do {
				System.out.print(i + " * " + j + " = " + i*j +"\t");
				j++;
			} while(j<=i);
			i++;
			j=1;
			System.out.println();
		} while(i<10);
	}

	public void print99MultiplicationTableByFor(boolean triangle) {
		System.out.println("print99MultiplicationTableByFor :");
		outloop:
		for(int i=1; i<10; i++) {
			
			for(int j=1; j<10; j++) {
				System.out.print(i + " * " + j + " = " + i*j +"\t");
				
				if(triangle && i==j) {
					System.out.println();
					continue outloop;
				}
			}
			System.out.println();
		}
	}
	
	public void print99MultiplicationTableByWhile(boolean triangle) {
		int i=1,j=1;
		
		while(i < 10) {
			
			while(j < 10) {
				System.out.print(i + " * " + j + " = " + i*j +"\t");
				if(triangle && j==i) {
					break;
				}
				j++;
			}
			i++;
			j = 1;
			System.out.println();
		}
	}
}
