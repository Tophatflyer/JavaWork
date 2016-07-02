class LogicalOpTable{
	public static void main(String args[]){
		boolean p, q;

 		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

 		p = true; q = true;
 		System.out.print(p + "\t" + q +"\t");
 		System.out.print((p&q) + "\t" + (p|q) + "\t");
 		System.out.println((p^q) + "\t" + (!p));
 		p = true; q = false;
 		System.out.print(p + "\t" + q +"\t");
 		System.out.print((p&q) + "\t" + (p|q) + "\t");
 		System.out.println((p^q) + "\t" + (!p));
 		p = false; q = true;
 		System.out.print(p + "\t" + q +"\t");
 		System.out.print((p&q) + "\t" + (p|q) + "\t");
 		System.out.println((p^q) + "\t" + (!p));

 		/*
		6. On your own, try modifying the program so that it uses and displays 1’s and 0’s, rather than
		true and false. This may involve a bit more effort than you might at first think!
 		*/

 		System.out.println();

 		 System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

 		p = true; q = true;
 		if(p){
 			System.out.print(1 + "\t");
 		}else{
 			System.out.print(0 + "\t");
 		}
 		if(q){
 			System.out.print(1 +"\t");
 		}
 		else{
 			System.out.print(0 + "\t");
 		}
 		if(p & q){
 			System.out.print(1 + "\t");
 		}else{
 			System.out.print(0 + "\t");
 		}
 		if(p | q){
			System.out.print(1 + "\t");
		}else{
			System.out.print(0 + "\t");
		}
 		if(p^q){
 			System.out.print(1 + "\t");
 		}else{
 			System.out.print(0 + "\t");
 		}
 		if(!p == true){
 			System.out.println(1 + "\t");
 		}else{
 			System.out.println(0 + "\t");
 		}

 		p = true; q = false;
 		 if(p){
 			System.out.print(1 + "\t");
 		}else{
 			System.out.print(0 + "\t");
 		}
 		if(q){
 			System.out.print(1 +"\t");
 		}
 		else{
 			System.out.print(0 + "\t");
 		}
 		if(p & q){
 			System.out.print(1 + "\t");
 		}else{
 			System.out.print(0 + "\t");
 		}
 		if(p | q){
			System.out.print(1 + "\t");
		}else{
			System.out.print(0 + "\t");
		}
 		if(p^q){
 			System.out.print(1 + "\t");
 		}else{
 			System.out.print(0 + "\t");
 		}
 		if(!p == true){
 			System.out.println(1 + "\t");
 		}else{
 			System.out.println(0 + "\t");
 		}

 		p = false; q = true;
 		if(p){
 			System.out.print(1 + "\t");
 		}else{
 			System.out.print(0 + "\t");
 		}
 		if(q){
 			System.out.print(1 +"\t");
 		}
 		else{
 			System.out.print(0 + "\t");
 		}
 		if(p & q){
 			System.out.print(1 + "\t");
 		}else{
 			System.out.print(0 + "\t");
 		}
 		if(p | q){
			System.out.print(1 + "\t");
		}else{
			System.out.print(0 + "\t");
		}
 		if(p^q){
 			System.out.print(1 + "\t");
 		}else{
 			System.out.print(0 + "\t");
 		}
 		if(!p == true){
 			System.out.println(1 + "\t");
 		}else{
 			System.out.println(0 + "\t");
 		}

	}
}