package aims.media;

public class DigitalVideoDisc extends Media {
	  private static int nbDigitalVideoDiscs = 0;
	  private String director;
	  private int length;
	  
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
	// Constructor full
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
        this.setTitle(title);
        this.setCategory(category);
        this.director = director;
        this.length = length;
        this.setCost(cost);
    }

    public DigitalVideoDisc(String title) {
        this(title, null, null, 0, 0.0f); 
    }
	public DigitalVideoDisc(String title, String category, float cost) {
		this(title, category, null, 0, cost); 
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this(title, category, category, 0, cost); 
	}
	
	
	// in thong tin DVD
	public String toString() {
		return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " 
				+ this.director + " - "+ this.length + " minutes: " 
				+ this.getCost() + "$";
	}
	
	// check title
	public boolean isMatch(String title) {
		return this.getTitle().equals(title);
	}
   
	  
}