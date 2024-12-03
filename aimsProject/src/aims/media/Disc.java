package aims.media;

public class Disc extends Media {
	private String director;
	private int length;
	
	public Disc() {
		// TODO Auto-generated constructor stub
	}
    public Disc(String title, float cost) {
        super(title, cost);
    }

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}
	@Override
	public String toString() {
		return "DVD: " + this.getTitle() + ", Director: " + this.director + ", Length: " + length + " mins, Cost: $" + this.getCost();
	}

}
