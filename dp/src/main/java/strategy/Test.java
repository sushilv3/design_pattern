package strategy;

public class Test {

	public static void main(String[] args) {

		Context cont = new Context(new OperationAdd());
		System.out.println("Opration add : " + cont.executeStrategy(5, 3));
		System.out.println("----------");

		Context cont1 = new Context(new OprationSubstraction());
		System.out.println("Opration substraction : " + cont1.executeStrategy(5, 3));
		System.out.println("----------");

		Context cont2 = new Context(new OpreationMultiplication());
		System.out.println("Opration Multiplication : " + cont2.executeStrategy(5, 3));
		System.out.println("----------");

		System.out.println("----------Another type use");
		IStrategy str = new OperationAdd();
		System.err.println("Add: " +str.doOperation(5, 5));
		

		IStrategy str2 = new OprationSubstraction();
		System.err.println("Substraction: " +str2.doOperation(5, 5));
		

		IStrategy str3 = new OpreationMultiplication();
		System.err.println("Multiplication: " +str3.doOperation(5, 5));

	}
}
