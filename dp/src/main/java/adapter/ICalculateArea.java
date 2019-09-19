package adapter;

public interface ICalculateArea {

	static final double PI = 3.14;   
	static final int half = 1/2;
			
	public void areaOfRectangle(int w, int h);

	public void areaOfSquare(int a);

	public void areaOfParallelogram(int b, int h);

	public void areaOfTriangle(int half,int b, int h);

	public void areaOfCircle(double pi,int r);

}
