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
		int num = input.nextInt();			// 기사 번호 입력
		this.setNum(num);
		
		System.out.print("News Title: ");
		input.nextLine();		// nextInt 다음 nextLine에서 발생하는 오류를 해결하기 위한 스캐너 입력 삽입
		String title = input.nextLine();	// 기사 헤드라인(제목) 입력
		this.setTitle(title);
		
		System.out.print("News Date: ");
		String date = input.next();			// 기사 날짜 입력
		this.setDate(date);
		
		System.out.print("News Category: ");
		String cat = input.next();			// 기사 주제 입력
		this.setCat(cat);
		input.nextLine();		// next 다음 nextLine에서 발생하는 오류를 해결하기 위한 스캐너 입력 삽입
		
		System.out.print("News Link Address: ");
		String link = input.nextLine();		// 기사 링크 주소 입력
		this.setLink(link);
		
		System.out.print("Set this article to Favorite? (y/n): ");
		char fav = input.next().charAt(0);	// 관심 기사 설정 여부 입력 (y 입력 시 관심기사 설정)
		this.setFav(fav);
		System.out.println();
	}
}
