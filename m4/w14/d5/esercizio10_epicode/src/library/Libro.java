package library;

public class Libro extends Books{
	private String author;
	private String genre;
	public Libro(String title, int year, int pages, long isbn, String author, String genre) {
		super(title, year, pages, isbn);
		this.author = author;
		this.genre = genre;		
	}
	public String getAuthor() {
		return author;
	}
	public String getGenre() {
		return genre;
	}
}
