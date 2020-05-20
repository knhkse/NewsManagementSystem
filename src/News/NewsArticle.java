package News;

import java.io.Serializable;
import java.util.Scanner;

import exception.LinkFormatException;

public abstract class NewsArticle implements NewsInput, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 652732243293425457L;
	
	protected NewsKind kind = NewsKind.Newspaper;
	protected int num;
	protected String title;
	protected String date;
	protected String cat;
	protected String link;
	protected char fav;
	
	public NewsArticle() {
	}
	
	public NewsArticle(NewsKind kind) {
		this.kind = kind;
	}
	
	public NewsArticle(int num, String title) {
		this.num = num;
		this.title = title;
	}
	
	public NewsArticle(NewsKind kind, int num, String title, String date, String cat, String link, char fav) {
		this.kind = kind;
		this.num = num;
		this.title = title;
		this.date = date;
		this.cat = cat;
		this.link = link;
		this.fav = fav;
	}
	
	public NewsKind getKind() {
		return kind;
	}

	public void setKind(NewsKind kind) {
		this.kind = kind;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) throws LinkFormatException{
		if (!link.contains(".") && !link.equals("")) {
			throw new LinkFormatException();
		}
		this.link = link;
	}

	public char getFav() {
		return fav;
	}

	public void setFav(char fav) {
		this.fav = fav;
	}
	
	

	public abstract void printInfo();
	
	public void setNewsNum(Scanner input) {
		System.out.print("Article number: ");
		int number = input.nextInt();
		this.setNum(number);
	}
	
	public void setNewsTitle(Scanner input) {
		System.out.print("News Title: ");
		String title = input.nextLine();
		this.setTitle(title);
	}
	
	public void setNewsDate(Scanner input) {
		System.out.print("News Date: ");
		String date = input.next();
		this.setDate(date);
	}
	
	public void setNewsCat(Scanner input) {
		System.out.print("News Category: ");
		String cat = input.next();
		this.setCat(cat);
	}

	public void setNewsLink(Scanner input) {
		String link = "";
		while (!link.contains(".")) {
			System.out.print("News Link Address: ");
			link = input.nextLine();
			try {
				this.setLink(link);
			} catch (LinkFormatException e) {
				System.out.println("Incorrect Link Format");
			}
		}
	}
	
	public void setNewsFav(Scanner input) {
		System.out.print("Set this article to Favorite? (y/n): ");
		char fav = input.next().charAt(0);
		this.setFav(fav);
	}
	
	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Newspaper:
			skind = "Newspapaer: ";
			break;
		case Magazine:
			skind = "Magazine: ";
			break;
		case Research:
			skind = "Research: ";
			break;
		default:
		}
		return skind;
	}
}
