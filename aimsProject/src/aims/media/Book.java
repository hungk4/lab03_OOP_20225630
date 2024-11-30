package aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		
	}

	public void addAuthor(String authorName) {
		if(authors.contains(authorName)) {
			System.out.println("Da ton tai "+ authorName + " trong danh sach");
		} else {
			authors.add(authorName);
			System.out.println("Da xoa" + authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println("Da xoa" + authorName);
		} else {
			System.out.println("Khong ton tai" + authorName + "trong danh sach");
		}
	}
}
