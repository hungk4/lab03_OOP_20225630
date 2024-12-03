package aims.media;

import java.util.Comparator;

public class CompareByCostTitle implements Comparator<Media> {
	@Override
	public int compare(Media m1, Media m2) {
		int costComparsion = Float.compare(m2.getCost(), m1.getCost());
		if(costComparsion == 0) {
			return  m1.getTitle().compareTo(m2.getTitle());
		}
		return costComparsion;
	}
}
