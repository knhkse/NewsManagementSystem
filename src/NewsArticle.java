
public class NewsArticle {
	int num;
	String title;
	String date;
	String cat;
	String link;
	char fav;
	
	public NewsArticle() {
	}
	
	public NewsArticle(int num, String title) {
		this.num = num;
		this.title = title;
	}
	
	public NewsArticle(int num, String title, String date, String cat, String link, char fav) {
		this.num = num;
		this.title = title;
		this.date = date;
		this.cat = cat;
		this.link = link;
		this.fav = fav;
	}
	
	public void printInfo() {
		System.out.println(num + ". " + title + " ("+date+") _"+cat);
	}
}
