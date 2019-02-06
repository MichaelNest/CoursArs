

public class Calculator {
	
	private double result;
	private double memory;
	
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
	
	public void sub(double... params) {
		double result=0;
		for(Double param: params) {
			double a = (-1)*param;
		result = a - result;}
		this.result=result;
	}
	
	public void mult(double... params) {
		double result = 1;
		for(Double param: params) {
		result *= param;}
		this.result = result;
	}
	
	public void div(double... params) {
		double result1 = 1;
		for(Double param: params) {
			result1 = param/result1;
	
		}
		double result = 1/result1;
		this.result=result;
	}
	
	public void pow(Double a, Double b) {
	       this.result = Math.pow(a, b);
	}
	
	public double getMemory() {
		return this.memory;
	}
		
	public void saveMemory() {
         this.memory = this.result;
	}		 
	
	public void cleanMemory() {
		this.memory = 0;
	}
		
	
	public double getResult() {
		return this.result;
	}
	
	public void cleanResult() {
		this.result = 0;
	}
	
}