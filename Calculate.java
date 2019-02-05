

public class Calculate {
	public static void main(String[] args) {
		
		System.out.println("Calculate");
		//int first = Integer.valueOf(args[0]); //преобразует значение строкового массива в тип интнджер (класс-обертка)
		//int second = Integer.valueOf(args[1]);
		double first = Double.valueOf(args[0]);
		double second = Double.valueOf(args[1]);
		//int summ = first+second;
		double summ = first+second;
		double diff = first-second;
		double mult = first*second;
		double div = first/second;
		double pow = Math.pow(first, second);
		//System.out.println("Summ is: "+summ);
		System.out.println("Summ is: "+summ);
		System.out.println("Diff is: "+diff);
		System.out.println("Mult is: "+mult);
		System.out.println("Div is: "+div);
		System.out.println("Pow  is: "+pow);
		
	}
	
}