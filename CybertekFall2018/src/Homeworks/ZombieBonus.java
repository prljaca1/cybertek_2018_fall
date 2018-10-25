package Homeworks;

import java.util.Arrays;

public class ZombieBonus {
	public static void main(String[] args) {
		

			int population[] = {3, 6, 0, 4, 3, 2, 7, 1};
	        int count = 0;
			for(int x = population.length-1; x >= population[0]; x--){
				
				if(population[x] > 0){
					count--;
					population[x] = 0; 
					System.out.println(Arrays.toString(population));
				}
			}
			
			System.out.println(Arrays.toString(population));
			
			
	
	
	
	
	
	}
	

}
