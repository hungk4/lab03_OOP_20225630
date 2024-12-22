package aims.media;

import aims.exception.PlayerException;

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
        super(title, cost);
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
        this.setCategory(category);
        this.director = director;
        this.length = length;
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
	public String toString() {
		return "DVD: " + this.getTitle() + ", category: " + this.getCategory() + ", diretor: " 
				+ this.director + ", length: "+ this.length + " minutes, " 
				+ this.getCost() + "$";
	}
	
   
	@Override
	public void play() throws PlayerException {
		if(this.getLength() > 0) {
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		} else {
			throw  new PlayerException("ERROR: DVD length is non-positive");
		}
		
	}
}
