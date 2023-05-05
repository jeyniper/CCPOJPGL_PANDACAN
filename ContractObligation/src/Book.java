
public class Book {
	
     private final String title;
     private int price;
     private boolean favorites;
     
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFavorite() {
		return favorites;
	}
	public void setFavorite(boolean favorites) {
		this.favorites = favorites;
	}
	public String getTitle() {
		return title;
	}
	public Book(String title, int price, boolean favorites) {
		this.title = title;
		this.price = price;
		this.favorites = favorites;

	}
}
