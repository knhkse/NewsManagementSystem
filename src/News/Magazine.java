package News;

import java.util.Scanner;

public class Magazine extends NewsETC{
	
	public Magazine(NewsKind kind) {
		super(kind);
	}
	
	public void getNewsInput(Scanner input) {
		setNewsNum(input);
		input.nextLine();		// nextInt ���� nextLine���� �߻��ϴ� ������ �ذ��ϱ� ���� ��ĳ�� �Է� ����
		setNewsTitle(input);
		setNewsDate(input);
		setNewsCat(input);
		setNewsLinkwithYN(input);
		setNewsFav(input);
		System.out.println();
	}
	

}
