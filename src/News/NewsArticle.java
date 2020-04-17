package News;

import java.util.Scanner;

public class NewsArticle {

	protected NewsKind kind = NewsKind.Newspaper;
	protected int num;
	protected String title;
	protected String date;
	protected String cat;
	protected String link;
	protected char fav;
	
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

	public void setLink(String link) {
		this.link = link;
	}

	public char getFav() {
		return fav;
	}

	public void setFav(char fav) {
		this.fav = fav;
	}
	
	public void printInfo() {
		System.out.println(num + ". " + title + " ("+date+") _"+cat);
	}
	
	public void getNewsInput(Scanner input) {
		System.out.print("Article Number: ");
		int num = input.nextInt();			// ��� ��ȣ �Է�
		this.setNum(num);
		
		System.out.print("News Title: ");
		input.nextLine();		// nextInt ���� nextLine���� �߻��ϴ� ������ �ذ��ϱ� ���� ��ĳ�� �Է� ����
		String title = input.nextLine();	// ��� ������(����) �Է�
		this.setTitle(title);
		
		System.out.print("News Date: ");
		String date = input.next();			// ��� ��¥ �Է�
		this.setDate(date);
		
		System.out.print("News Category: ");
		String cat = input.next();			// ��� ���� �Է�
		this.setCat(cat);
		input.nextLine();		// next ���� nextLine���� �߻��ϴ� ������ �ذ��ϱ� ���� ��ĳ�� �Է� ����
		
		System.out.print("News Link Address: ");
		String link = input.nextLine();		// ��� ��ũ �ּ� �Է�
		this.setLink(link);
		
		System.out.print("Set this article to Favorite? (y/n): ");
		char fav = input.next().charAt(0);	// ���� ��� ���� ���� �Է� (y �Է� �� ���ɱ�� ����)
		this.setFav(fav);
		System.out.println();
	}
}
