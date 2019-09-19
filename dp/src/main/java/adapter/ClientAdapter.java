package adapter;

public class ClientAdapter {
	public static void main(String[] args) {
		
		ICalculateAdapter caa = new CalculateAdapter();
		caa.areaOfRectangle(2, 3);
	}
}
