
public class Refrigerator {

	
	public FoodItem[] vegetableDrawer = new FoodItem[3];
	public FoodItem[] refrigeratorSpace = new FoodItem[7];
	boolean isOn = true;
	
	
	
	public void switchOn(){
		isOn = true;
	}
	
	public void switchOff(){
		if(isOn == true){
			System.out.println("De koelkast stond aan!");	
		}
		isOn = false;
	}
	
	public void addToVegetableDrawer(FoodItem foodItem){
		if (foodItem.typeOfFood.equals("vegetable")) {
			int counter = 0;

			while (counter < vegetableDrawer.length) {
				if (vegetableDrawer[counter] == null) {
					vegetableDrawer[counter] = foodItem;
					break;
				}

				counter++;
			}

			if (counter >= vegetableDrawer.length) {
				System.out.println("koelkast = vol");
			}

		} else {
			System.out.println("das geen groente");
		}
	}
	
	public void addToRefrigerator(FoodItem foodItem){
		if ((calculateWeight() + foodItem.weight) <= 17) {
			int counter = 0;

			while (counter < refrigeratorSpace.length) {
				if (refrigeratorSpace[counter] == null) {
					refrigeratorSpace[counter] = foodItem;
					break;
				}

				counter++;
			}

			if (counter >= refrigeratorSpace.length) {
				System.out.println("Sorry. The refrigerator is full.");
			}
		} else {
			System.out.println("Sorry. Too much weight.");
		}
	}
	
	public double calculateWeight(){
		double weight=0;
		int counter=0;
		
		while(counter < refrigeratorSpace.length){
			if(refrigeratorSpace[counter] != null){
				weight = weight + refrigeratorSpace[counter].weight;
			
			}
				counter++;
		}
			return weight;
	}
		
		
}

