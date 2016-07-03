//10. The ASCII lowercase letters are separated from the uppercase letters by 32. Thus, to convert
// a lowercase letter to uppercase, subtract 32 from it. Use this information to write a program
// that reads characters from the keyboard. Have it convert all lowercase letters to uppercase,
// and all uppercase letters to lowercase, displaying the result. Make no changes to any other
// character. Have the program stop when the user enters a period. At the end, have the program
// display the number of case changes that have taken place.

import java.io.IOException;

class Chapter3Q10{
	public static void main(String args[]) throws IOException{
		char input, ignore;
		int counter = 0;
		do{
			System.out.print("Please enter a character in the alphabet (press . to quit): ");
			input = (char) System.in.read();

			do{
				ignore = (char) System.in.read();
			}while(ignore != '\n');

			if(input >= 'a' && input <= 'z'){
				System.out.print("The letter " + input + " is uppercased to: ");
				input -= 32;
				System.out.println(input + " ");
				counter++;
			}else if(input >= 'A' && input <= 'Z'){
				System.out.print("The letter " + input + " is lowercased to: ");
				input += 32;
				System.out.println(input + " ");
			}else{
				System.out.println("Input is not a letter in the alphabet: " + input);
			}
		}while(input != '.');
		System.out.println("The number of letters uppercased and lowercased is: " + counter);
	}
}