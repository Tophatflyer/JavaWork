/*
 Try This 1-2
 This program displays a conversion
 table of gallons to liters.
 Call this program "GalToLitTable.java".

 10. Adapt Try This 1-2 so that it prints a conversion table of inches to meters. Display 12 feet
 of conversions, inch by inch. Output a blank line every 12 inches. (One meter equals
 approximately 39.37 inches.)

*/
class Chapter1Q10 {
	public static void main(String args[]) {
		double gallons, liters, inches, meters;
		int counter;
		counter = 0;
		// for(gallons = 1; gallons <= 100; gallons++) {
		// 	liters = gallons * 3.7854; // convert to liters
		// 	System.out.println(gallons + " gallons is " + liters + " liters.");
		// 	counter++;
		// 	// every 10th line, print a blank line
		// 	if(counter == 10) {
		// 		System.out.println();
		// 		counter = 0; // reset the line counter
		// 	}
		// }
		for(inches = 1; inches <= 144; inches++){
			meters = inches/39.37;
			System.out.println(inches + " inches is " + meters + " meters.");
			counter++;
			if(counter == 12){
				System.out.println();
				counter = 0;
			}
		}
	}
}