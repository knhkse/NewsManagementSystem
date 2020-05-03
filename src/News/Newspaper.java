package News;

import java.util.Scanner;

public class Newspaper extends NewsArticle{
	
	public Newspaper(NewsKind kind) {
		super(kind);
	}
	
	
	public void getNewsInput(Scanner input) {
		setNewsNum(input);
		input.nextLine();		// nextInt ���� nextLine���� �߻��ϴ� ������ �ذ��ϱ� ���� ��ĳ�� �Է� ����
		setNewsTitle(input);
		setNewsDate(input);
		setNewsCat(input);
		input.nextLine();		// next ���� nextLine���� �߻��ϴ� ������ �ذ��ϱ� ���� ��ĳ�� �Է� ����
		setNewsLink(input);
		setNewsFav(input);
		System.out.println();
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println(skind + num + ". " + title + " ("+date+") _"+cat);
	}

}
