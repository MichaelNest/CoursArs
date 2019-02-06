import java.util.Scanner;

public class InterractRanner1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		try                                             {
			Calculator calc = new Calculator();     	   
			String exit = "no";
			while(!exit.equals("yes")) {                   						   
														   
				System.out.println("Enter first arg: ");
				String first = reader.next();
				String mem = "m";
                double f1; 			
                if(first.equals(mem)){
				f1 = calc.getMemory();}
                else{f1 = Double.valueOf(first);}					
				System.out.println("Enter second arg: ");
				String second = reader.next();
				double s1; 
				if(second.equals(mem)){
				s1 = calc.getMemory();}
                else{s1 = Double.valueOf(second);}	
				System.out.println("Select type of operation: Enter \"+\" or \"-\" or \"*\" or \"/\" or \"p\"");
				String op = reader.next();
				switch (op) {
					case "+" : 
					calc.cleanResult();
					calc.add(f1, s1);
				    System.out.println("Result add: "+calc.getResult());
					break;

                    case "-" :
					calc.cleanResult();	
                    calc.sub(f1, s1);
				    System.out.println("Result sub: "+calc.getResult());
                    break;

                    case "*" :
					calc.cleanResult();	
                    calc.mult(f1, s1);
				    System.out.println("Result mult: "+calc.getResult());
                    break;

                    case"/" :
					calc.cleanResult();
 					calc.div(f1, s1);
				    System.out.println("Result div: "+calc.getResult());
				    break;
					
					case"p" :
					 calc.cleanResult();
					 calc.pow(f1, s1);
				     System.out.println("Result pow: "+calc.getResult());
				     break;
				}
				
				System.out.println("Save result: \"yes/no\"");
				String sv = reader.next();
				switch (sv) {
					case "yes" : 
					calc.saveMemory();
					break;
					
					case "no" : 
					calc.cleanResult();
					break;
				}
				System.out.println("Memory: "+calc.getMemory());
			
				System.out.println("Exit: yes/no");
				exit = reader.next();
			}
				
		}finally {                                         
			reader.close();
		         }
	}
	
	
	
}