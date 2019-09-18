package decorator;

public class CircleDecorator implements IShape {
	private IShape circle;

	public CircleDecorator(IShape circle) {
		this.circle = circle;
	}

	@Override
	public void draw() {
		this.circle.draw();
		System.out.println("circle color is red");

	}
}

