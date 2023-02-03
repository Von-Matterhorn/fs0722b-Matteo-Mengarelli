package esercizio5_epicode;

public class Audio extends MediaPlayer implements Volume{

	private int volume;
	private int time;
	
	public Audio(String title, int time,  int volume) {
		super(title);
		this.volume = volume;
		this.time = time;		
	}
	
	@Override
	public int getVolume() {		
		return this.volume;
	}
	
	public int getTime() {		
		return time;
	}
	
	@Override
	public int increaseVolume() {
		return ++volume;
	}
	
	@Override
	public int decreaseVolume() {
		return --volume;
	}
	
	@Override
	public void play() {
		for (int i = 1; i <= this.getTime(); i++) {
			System.out.printf(this.getTitle());
			for(int a = 0; a < this.getVolume(); a++) {
				System.out.printf("!");				
			}
			System.out.println();
		} 
	}

}
