package News;

import java.util.Scanner;

public class Newspaper extends NewsArticle{
	
	public Newspaper(NewsKind kind) {
		super(kind);
	}
	
	
	public void getNewsInput(Scanner input) {
		setNewsNum(input);
		input.nextLine();		// nextInt 다음 nextLine에서 발생하는 오류를 해결하기 위한 스캐너 입력 삽입
		setNewsTitle(input);
		setNewsDate(input);
		setNewsCat(input);
		input.nextLine();		// next 다음 nextLine에서 발생하는 오류를 해결하기 위한 스캐너 입력 삽입
		setNewsLink(input);
		setNewsFav(input);
		System.out.println();
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println(skind + num + ". " + title + " ("+date+") _"+cat);
	}

}
