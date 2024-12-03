package aims.media;

import java.util.Comparator;

public class CompareByTitleCost implements Comparator<Media> {
	@Override
	public int compare(Media m1, Media m2) {
		int titleComparsion = m1.getTitle().compareTo(m2.getTitle());
		if(titleComparsion == 0) {
			return Float.compare(m2.getCost(), m1.getCost());
		}
		return titleComparsion;
	}
}
