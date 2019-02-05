

public class ArgRanner {
	public static void main(String[] args) {
		double first = Double.valueOf(args[0]);
		double second = Double.valueOf(args[1]);
		Calculator calc = new Calculator();
		calc.add(first, second);
		System.out.println("Result: "+calc.getResult());
		calc.cleanResult();
		
		
	}
	
	
}