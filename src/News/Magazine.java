package News;

import java.util.Scanner;

public class Magazine extends NewsArticle {
	
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
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer !='n' && answer != 'N')
		{
			System.out.println("Do you have an Link address? (Y/N)");
				answer = input.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				System.out.print("News Link Address: ");
				String link = input.nextLine();		// ��� ��ũ �ּ� �Է�
				this.setLink(link);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setLink("");
				break;
			}
			else {
			}
		}
		
		
		System.out.print("Set this article to Favorite? (y/n): ");
		char fav = input.next().charAt(0);	// ���� ��� ���� ���� �Է� (y �Է� �� ���ɱ�� ����)
		this.setFav(fav);
		System.out.println();
	}

}
