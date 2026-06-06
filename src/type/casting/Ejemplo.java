package type.casting;

public class Ejemplo {

	public static void main(String[] args) {
		typeCastingIntToDouble();
		typeCastingDoubleToInt();
		typeCastingIntToString();
		typeCastingStringToInt(); 
	}

	public static void typeCastingIntToDouble() {
		System.out.println("DE ENTERO A DOUBLE");
		
		
		
	    int num = 50;

	    System.out.println("THE INTEGER VALUE: " + num);

	

	    double data = num;

	    System.out.println("THE DOUBLE VALUE: " + data);
	}

	public static void typeCastingDoubleToInt() {
		System.out.println("\nDE DOUBLE A ENTERO");
		
		  

	    double num = 50.55;

	    System.out.println("THE DOUBLE VALUE: " + num);

	   

	    int data = (int)num;

	    System.out.println("THE INTEGER VALUE: " + data);
	}

	public static void typeCastingIntToString() {
		System.out.println("\nDE ENTERO A STRING");
		
		

	    int num = 50;

	    System.out.println("THE INTEGER VALUE IS: " + num);

	 

	    String data = String.valueOf(num);

	    System.out.println("THE STRING VALUE IS: " + data);
	}

	public static void typeCastingStringToInt() {
		System.out.println("\nDE STRING A ENTERO");
		
		

	    String data = "50";

	    System.out.println("THE STRING VALUE IS: " + data);

	    

	    int num = Integer.parseInt(data);

	    System.out.println("THE INTEGER VALUE IS: " + num);
	}
}