
package ClaculatorAppPackage;
import java.io.IOException;
public class Entry {
	public static void main(String[] args) throws IOException {
		
		Menu m = new Menu();		
		m.show();
		
		int operation = BasicInput.readInteger();
		System.out.println(" Select operation \n");
		
		System.out.print("Enter 1st Number : ");
		int number1 = BasicInput.readInteger();
		
		System.out.print("Enter 2nd Number : ");
		int number2 = BasicInput.readInteger();
		
		switch(operation) {
		case 1:
			 m.add(number1, number2);
			 break;
		case 2:
			m.substract(number1, number2);
			break;
		case 3:
			m.multiply(number1, number2);
			break;
		case 4:
			m.div(number1, number2);
			break;
		
		}
		
		}
	}
