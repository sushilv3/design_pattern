package decorator;

public class ClientCircleDecorator {

	public static void main(String[] args) {
		CircleDecorator c = new CircleDecorator(new Circle());
		c.draw();
	}
}
