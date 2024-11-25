package disc;

public class DigitalVideoDisc {
	  private static int nbDigitalVideoDiscs = 0;
	  private int id;
	  private String title;
	  private String category;
	  private String director;
	  private int length;
	  private float cost;
	  
	  public String getTitle() {
	    return title;
	  }
	  public String getCategory() {
	    return category;
	  }
	  public String getDirector() {
	    return director;
	  }
	  public int getLength() {
	    return length;
	  }
	  public float getCost() {
	    return cost;
	  }
	  public int getId() {
		return id;
	  }
	  
	  
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
    // Constructor full
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
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
		return "DVD - " + this.title + " - " + this.category + " - " 
				+ this.category + " - "+ this.length + " minutes: " 
				+ this.cost + "$";
	}
	
	// check title
	public boolean isMatch(String title) {
		return this.title.equals(title);
	}
   
	  
}
