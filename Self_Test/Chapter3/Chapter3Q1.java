// 1. Write a program that reads characters from the keyboard until a period is received. Have the
// program count the number of spaces. Report the total at the end of the program.

import java.io.*;

class Chapter3Q1{
	public static void main(String args[]) throws IOException{
		char input, ignore;
		int counter = 0;
		do{
			System.out.print("Please enter a character: ");

			input = (char) System.in.read();

			do {
			 	ignore = (char) System.in.read();
			 } while(ignore != '\n');

			if(input == ' ')
				counter++;
		}while(input != '.');
		System.out.println("Number of spaces: " + counter);
	}
}