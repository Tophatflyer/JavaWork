class Book{
	private String author;
	private String title;
	private int id;
	private double cost;

	Book(String author, String title, int id, double cost){
		this.author = author;
		this.title = title;
		this.id = id;
		this.cost = cost;
	}

	String getAuthor(){
		return author;
	}

	String getTitle(){
		return title;
	}

	int getID(){
		return id;
	}

	double getCost(){
		return cost;
	}
}