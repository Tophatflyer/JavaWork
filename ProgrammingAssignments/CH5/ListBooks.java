class ListBooks{
	public static void main(String args[]){
		Book b1 = new Book("Ray Bradbury", "R is for Rocket", 281842, 12.99);
		Book b2 = new Book("Idk", "Hello, World: Java Newbies", 123123213, 18.57);

		Book b_list[] = new Book[10];
		b_list[0] = b1;
		b_list[1] = b2;

		for(int i = 0; i < 2; ++i)
			System.out.println(b_list[i].getAuthor() + " " + b_list[i].getTitle() + " " + b_list[i].getID() + " " + b_list[i].getCost());
	}
}