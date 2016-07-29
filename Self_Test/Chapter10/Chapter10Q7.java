import java.io.*;

class Chapter10Q7{
	public static void main(String args[]){
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;

		if(args.length != 2){
			System.out.println("did not specify 2 files");
			return;
		}
		
		try{
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);

			do{
				i = fin.read();

				if((char) i == ' ')
					i = '-';

				if(i != -1)
					fout.write(i);

			}while(i != -1);
		}catch(IOException e){
			System.out.println("An error has occurred while reading file: " + e);
		}finally{
			try{
				if(fin != null)
					fin.close();
			}catch(IOException e){
				System.out.println("Could not close input file: " + e);
			}
			try{
				if(fout != null)
					fout.close();
			}catch(IOException e){
				System.out.println("Could not close output file: " + e);
			}
		}

	}
}