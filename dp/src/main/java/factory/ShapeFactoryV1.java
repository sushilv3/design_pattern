package factory;

public abstract class ShapeFactoryV1 {

	public abstract IShape getShape(String type) throws Exception;
}

class ConcreteShapeFactory extends ShapeFactoryV1{

	@Override
	public IShape getShape(String type) throws Exception {
		switch(type) {
		case "Triangle":
			return new Triangle();
		case "Circle":
			return new Circle();
		case "Rectangle":
			return new Rectangle();
		default:
				throw new Exception("Invalide Shape Type : "+type);
		}
		
	}
	
}