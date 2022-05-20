package Day2_assignments;

class Book {
	private int bookprice = 254;

	private String booktitle = "JAVA";

	public int getBookprice() {
		return bookprice;

	}

	public void setShowBook(int bookprice) {
		this.bookprice = bookprice;
	}

	public String geCreateBook() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

}

public class BookInfo {

	public static void main(String[] args) {

		Book bk = new Book();
		
		System.out.println(bk.getBookprice());
		
		System.out.println(bk.geCreateBook());

	}

}
