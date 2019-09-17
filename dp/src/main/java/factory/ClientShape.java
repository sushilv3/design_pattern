package factory;

public class ClientShape {
	public static void main(String[] args)  throws Exception{
		ShapeFactory sf = new ShapeFactory();
		
		IShape c = sf.getShape("Triangle");
		c.draw();

//		IShape c1 = sf.getShape("qq");
//		c1.draw();
		
		
		
		/*
		 * another way use switch case and Exception
		 */
		ShapeFactoryV1 sfv1 = new ConcreteShapeFactory();
			IShape triangle = sfv1.getShape("Triangle");
			triangle.draw();
			IShape unk = sfv1.getShape("sdsds");
			unk.draw();
		
		

	}
}
