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
		input.nextLine();		// nextInt ���� nextLine���� �߻��ϴ� ������ �ذ��ϱ� ���� ��ĳ�� �Է� ����
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
