package day_25_Array2;

public class KitchenItems_WarmUp {
	
	public static void main(String[] args) {
		
		String[] kitchenItems = {"knife","woodens poons ","plates ","cups","forks ","pan","pot ","trash can ","frdige ","dishwasher "};
		
		
		
		for (String item:kitchenItems) {
			
			System.out.println(item);
			
		
	         item=item.toLowerCase().trim();//also you can put in side switch
		
		switch(item) {
		case "knife":
	          System.out.println("Knife is used for cutting veggies");
	          break;
		case "wooden spoons":
	          System.out.println("wooden spoons is used for mixing soupe");
	          break;
		case "plates":
	          System.out.println("Plate is used for eating food");
	          break;
		case "cups":
	          System.out.println("Cups is used for drinking beverages");
	          break;
		case "forks":
	          System.out.println("Forks is used for eating food");
	          break;
		case "pan":
	          System.out.println("Pan is used for cooking food");
	          break;
		case "pot":
	          System.out.println("Pot is used for cooking food ");
	          break;
		case "trah can":
	          System.out.println("Trash canis used for storing garbage");
	          break;
		case "fridge":
	          System.out.println("Fridge is used to storage food");
	          break;
		case "dishwasher":
	          System.out.println("Dishawer is used for washing dishes");
	          break;
		default:
		
		}
		
		
		
	}

	}
}