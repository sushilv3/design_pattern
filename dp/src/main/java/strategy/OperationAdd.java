package strategy;

public class OperationAdd implements IStrategy {

	public OperationAdd() {

	}

	public int doOperation(int v1, int v2) {

		return v1 + v2;
	}

}
