import java.util.Scanner;

public class InterractRanner {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		try                                              //У каждого раздела try должен быть, 
		                                                   //по крайней мере, или один раздел catch, или блок finally. 
			                                               //Блок finally очень удобен для закрытия файлов 
														   //и освобождения любых других ресурсов, 
														   //захваченных для временного использования в начале выполнения метода. 
		/*
Тело оператора try выполняется вплоть до возбуждения исключения или до успешного завершения. 
Если возникает исключение, то по порядку просматриваются все условия catch, 
пока не будет найдено исключение нужного класса или одного из его суперклассов. 
Если подходящее условие catch так и не найдено, то исключение выходит из текущего оператора try во внешний, 
который может обработать его. В операторе try может присутствовать любое количество условий catch, 
в том числе и ни одного. 
Если ни одно из условий catch внутри метода не перехватывает исключение, 
то оно передается в тот фрагмент программы, который вызвал данный метод.

Если в try присутствует условие finally, то составляющие его операторы выполняются после того, 
как вся обработка внутри try будет завершена. 
Выполнение finally происходит независимо от того, как завершился оператор — нормально, 
в результате исключения или при выполнении управляющего оператора типа return или break.
*/


        {
			Calculator calc = new Calculator();     	   
			String exit = "no";
			while(!exit.equals("yes")) {                   //"!" - Называется логический оператор «НЕ». 
			                                               //Использование меняет логическое состояние своего операнда. 
			                                               //Если условие имеет значение true, 
														   //то оператор логического «НЕ» будет делать false
			/*У класса String уже переопределенный метод equals(). 
			  И сравнивает он не ссылки, а именно последовательность символов в строках. 
			  И если текст в строках одинаковый, неважно, как они были созданы и где хранятся: 
			  в пуле строк, или в отдельной области памяти. 
			  Результатом сравнения будет true.	*/										   
														   
				System.out.println("Enter first arg: ");
				String first = reader.next();              //next() - чтоб пользователь ввёл любое слово или фразу. 
				                                           //И при этом, чтобы программа вывела в консоль всё до первого пробела.
				System.out.println("Enter second arg: ");
				String second = reader.next();
				calc.add(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Result add: "+calc.getResult());
				calc.cleanResult();
				
				calc.sub(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Result sub: "+calc.getResult());
				calc.cleanResult();
				
				calc.mult(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Result mult: "+calc.getResult());
				calc.cleanResult();
				
				calc.div(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Result div: "+calc.getResult());
				calc.cleanResult();
				
			    calc.pow(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Result pow: "+calc.getResult());
			    calc.cleanResult();
				
				
				System.out.println("Exit: yes/no");
				exit = reader.next();
			}
				
		}finally {                                          //Если в try присутствует условие finally, то составляющие его операторы выполняются после того, 
                                                            //как вся обработка внутри try будет завершена. 
                                                            //Выполнение finally происходит независимо от того, как завершился оператор — нормально, 
                                                            //в результате исключения или при выполнении управляющего оператора типа return или break.
			reader.close();
		         }
	}
	
	
	
}