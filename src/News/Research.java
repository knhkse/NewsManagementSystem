package News;

import java.util.Scanner;

public class Research extends NewsETC{
	
	public Research(NewsKind kind) {
		super(kind);
	}
		
	protected String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getNewsInput(Scanner input) {
		setNewsNum(input);
		input.nextLine();		// nextInt 다음 nextLine에서 발생하는 오류를 해결하기 위한 스캐너 입력 삽입
		setNewsTitle(input);
		System.out.print("Author: ");
		String name = input.next();
		this.setName(name);
		input.nextLine();
		setNewsDate(input);
		setNewsCat(input);
		
		setNewsLinkwithYN(input);
		setNewsFav(input);
		System.out.println();
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println(skind + num + ". " + title + " ("+name+") _"+cat);
	}
}
