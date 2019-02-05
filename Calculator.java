

public class Calculator {
	
	private double result;
	
	public void add(double... params) //Три точки означают, 
	                                  //что в качестве аргумента (ов) для этого метода
	                                  //могут быть переданы ноль или более объектов double (или их массив).
	{
		
		for(Double param : params) //Двоеточие означает что для каждого цикличного повторения каждый раз параметру 
		                           // Double param присваевается по очереди значения массива данных params
		{
			
			this.result += param;
		}
		
	}
	
	public double getResult() {
		return this.result;
	}
	
	public void cleanResult() {
		this.result = 0;
	}
	
}