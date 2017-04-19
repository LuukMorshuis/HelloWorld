package week4;

public class CoffeeMachine {
	int 	amountOfCoffee = 10;
	int 	amountOfChocolate = 10;
	
	
	
	
	void makeCoffee(){
		
		while(amountOfCoffee > 0){
		System.out.println("Here you have a cup of coffee");
		amountOfCoffee = amountOfCoffee -1;
		
		if(amountOfCoffee == 0){
			System.out.println("koffie is op");
		}
		}
	}
	
	
	
	
	void makeHotChocolate(){
		System.out.println("Here you have a cup of chocolate");
		amountOfChocolate = amountOfChocolate -1;
	}
	
	
	
	
	void restock(){
		amountOfCoffee = 10;
		amountOfChocolate = 10;
	}
}
