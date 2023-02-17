package library;

public class Rivista extends Books{
	private Period period;
	public Rivista(String title, int year, int pages, long isbn, Period period) {
		super(title, year, pages, isbn);
		this.period = period;
	}
	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}
}
