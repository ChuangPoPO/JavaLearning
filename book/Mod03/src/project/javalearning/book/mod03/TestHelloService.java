package project.javalearning.book.mod03;

public class TestHelloService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HelloService service = new HelloService();
			String answer = service.sayHello("Gaduo");
			System.out.println(answer);
	}

}
