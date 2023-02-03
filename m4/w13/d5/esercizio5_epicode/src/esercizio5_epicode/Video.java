package esercizio5_epicode;

public class Video extends MediaPlayer implements Volume, Lightness{
	private int volume;
	private int time;
	private int lightness;

	public Video(String title, int time, int volume, int lightness) {
		super(title);
		this.lightness = lightness;
		this.volume = volume;
		this.time = time;
		
	}
	
	@Override
	public int getVolume() {
		return volume;
	}
	
	@Override
	public int getLightness() {
		return lightness;
	}
	
	public int getTime() {
		return time;
	}
	
	@Override
	public int increaseVolume() {	
		return  ++volume;
	}

	@Override
	public int decreaseVolume() {		
		return --volume;
	}

	@Override
	public int increaseLightness() {
		return ++lightness;
	}

	@Override
	public int decreaseLightness() {
		return --lightness;
	}
	
	
	@Override
	public void play() {
		for (int i = 1; i <= this.getTime(); i++) {
			System.out.printf(this.getTitle());	
			for(int a = 0; a < this.getVolume(); a++) {
				System.out.printf("!");
			}

			for(int c = 0; c < this.getLightness(); c++) {
				System.out.printf("*");
			}			
			
			System.out.println();
		} 	
	}
	

	
	




	
	
	
	
}
