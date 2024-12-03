package aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	private static int nbDigitalVideoDiscs = 0;
	private String director;
	private int length;
	
	// Constructor full
	public DigitalVideoDisc() {	
	}
    public DigitalVideoDisc(String title, float cost) {
        super(title, cost);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
        this.setTitle(title);
        this.setCategory(category);
        this.director = director;
        this.length = length;
        this.setCost(cost);
    }
	
	/////////

	public String getDirector() {
	    return director;
	  }
	public int getLength() {
	    return length;
	  }
	public void setDirector(String director) {
		this.director = director;
	  }
	public void setLength(int length) {
		this.length = length;
	 }	
	
	// in thong tin DVD
//	public String toString() {
//		return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " 
//				+ this.director + " - "+ this.length + " minutes: " 
//				+ this.getCost() + "$";
//	}
	
	// check title
	public boolean isMatch(String title) {
		return this.getTitle().equals(title);
	}
   
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
