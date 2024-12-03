package aims.media;

import java.util.Comparator;

public abstract class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	public Media() {
		// TODO Auto-generated constructor stub
	}
    public Media(String title, float cost) {
        this.title = title;
        this.cost = cost;
    }
    
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null || !(obj instanceof Media)) {
			return false;
		}
		
		Media media = (Media) obj;
		return this.title.equals(media.title);
	}
    public abstract String toString();
 // Comparator instances for sorting by title + cost, or cost + title
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new CompareByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new CompareByCostTitle();
    
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
    

}
