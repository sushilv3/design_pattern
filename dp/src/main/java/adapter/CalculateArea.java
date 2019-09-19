package adapter;

public class CalculateArea implements ICalculateArea{

	@Override
	public void areaOfRectangle(int w, int h) {
		
		System.out.println("area Of Rectangle : "+w*h);
	}

	@Override
	public void areaOfSquare(int a) {
		System.out.println("area Of Square : "+a*a);
		
	}

	@Override
	public void areaOfParallelogram(int b, int h) {
		System.out.println("area Of Parallelogram : "+b*h);
		
	}

	@Override
	public void areaOfTriangle(int half, int b, int h) {
		int hlf = half; 
		System.out.println("area Of Triangle : "+hlf*b*h);
		
	}

	@Override
	public void areaOfCircle(double pi, int r) {
		double p = pi;
		System.out.println("area Of Circle : "+p*r*r);
		
	}

}
