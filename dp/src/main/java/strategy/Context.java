package strategy;

public class Context {
	private IStrategy strategy;
	
	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}
	public int executeStrategy(final int v1, final int v2 ) {
		return strategy.doOperation(v1, v2);
	}

}
