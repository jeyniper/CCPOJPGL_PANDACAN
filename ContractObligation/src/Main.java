import java.util.List;
import java.util.ArrayList;
import org.junit.Test;


public class Main {

	List<Book> favorites = new ArrayList<Book>();
	
	@Test
	public void testBooks()
	{
		Book b1 = new Book("title1", 11, false);
		Book b2 = new Book("title2", 11, false);
		Book b3 = new Book("title3", 11, false);
		
		List<Book> temp = new ArrayList<Book>();
		
		temp.add(b1);
		temp.add(b2);
		temp.add(b3);
		
		merge(temp);
	}
	
	public void merge(List<Book>listOfBooksFromTemp)
	{
		assert !listOfBooksFromTemp.isEmpty() : " is empty";
		
		favorites.addAll(listOfBooksFromTemp);
		
		assert !favorites.isEmpty() : " favorite is empty";
	}
	public static void main(String[] args) {
	    System.out.println("Jennifer O. Pandacan");
	}
}
