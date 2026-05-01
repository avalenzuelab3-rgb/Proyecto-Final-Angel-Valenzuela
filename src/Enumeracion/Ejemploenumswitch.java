package Enumeracion;



enum Size {
	 SMALL, MEDIUM, LARGE, EXTRALARGE
	}

class Test {
Size pizzaSize;
public Test(Size pizzaSize) {
  this.pizzaSize = pizzaSize;
}
public void orderPizza() {
  switch(pizzaSize) {
    case SMALL:
    	System.out.println("I ORDERED A SMALL SIZE PIZZA.");
        break;
      case MEDIUM:
        System.out.println("I ORDERED A MEDIUM SIZE PIZZA.");
        break;
      default:
        System.out.println("I DON'T KNOW WHICH ONE TO ORDER.");
        break;
  }
}
}
public class Ejemploenumswitch {
	 public static void main(String[] args) {
		   Test t1 = new Test(Size.SMALL);
		   t1.orderPizza();
		 }

}