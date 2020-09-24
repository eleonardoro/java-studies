package lambda.stream.api;

@FunctionalInterface
public interface Operator {
	
	int execute (int x, int y);

}
