package aims.media;

public class Book extends Media {
	private String author;
	
	public Book() {
	}
	
    public Book(String title, float cost) {
        super(title, cost);
    }
    public Book(String title,  String author, float cost) {
        super(title, cost);
        this.author = author;
    }
    
//	public void addAuthor(String authorName) {
//		if(authors.contains(authorName)) {
//			System.out.println("Da ton tai "+ authorName + " trong danh sach");
//		} else {
//			authors.add(authorName);
//			System.out.println("Da xoa" + authorName);
//		}
//	}
//	
//	public void removeAuthor(String authorName) {
//		if(authors.contains(authorName)) {
//			authors.remove(authorName);
//			System.out.println("Da xoa" + authorName);
//		} else {
//			System.out.println("Khong ton tai" + authorName + "trong danh sach");
//		}
//	}
	
    @Override
    public String toString() {
        return "Book: " + this.getTitle() + ", author: " + this.author + ", Cost: $" + this.getCost();
    }
}
