package aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		
	}

	public void addAuthor(String authorName) {
		if(authors.contains(authorName)) {
			System.out.println("Da ton tai tac gia trong danh sach");
		} else {
			authors.add(authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			authors.remove(authorName);
		} else {
			System.out.println("Khong ton tai tac gia trong danh sach");
		}
	}
}
