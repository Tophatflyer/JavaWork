import java.io.*;

class Chapter10Q8{
	public static void main(String args[]) throws IOException{
		int i;

		if(args.length != 2){
			System.out.println("Not enough arguments specified.");
			return;
		}

		try(FileReader fin = new FileReader(args[0]); FileWriter fout = new FileWriter(args[1])){
			do{
				i = fin.read();
				if((char) i == ' ')
					i = '-';
				if(i != -1)
					fout.write(i);
			}while(i != -1);
		}catch(IOException e){
			System.out.println("Error reading file: " + e);
		}
	}
}