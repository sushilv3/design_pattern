package adapter;

public class CalculateAdapter implements ICalculateAdapter{
	private ICalculateArea ca = new CalculateArea();

	@Override
	public void areaOfRectangle(int w, int h) {
		ca.areaOfRectangle(w, h);
		
	}

	@Override
	public void areaOfSquare(int a) {
		ca.areaOfSquare(a);
		
	}
	
	

}
