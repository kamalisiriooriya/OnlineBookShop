package BooKSPackage;

public class BookStoreModel {
	private int id;
	private String name;
	private String author;
	private String publication;
	private String price;
	
	public BookStoreModel(int id, String name, String author, String publication, String price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}
