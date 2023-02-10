package library;

public abstract class Books {
	protected String title;
	protected int year;
	protected int pages;
	protected long isbn;
	public Books(String title, int year, int pages, long isbn) {
		this.title = title;
		this.year = year;
		this.pages = pages;
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return year;
	}
	public int getPages() {
		return pages;
	}
	public long getIsbn() {
		return isbn;
	}
}
