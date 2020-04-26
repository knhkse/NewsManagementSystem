package News;

import java.util.Scanner;

public class Research extends NewsArticle {
	
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
		System.out.print("Article Number: ");
		int num = input.nextInt();			// ��� ��ȣ �Է�
		this.setNum(num);
		
		System.out.print("Title: ");
		input.nextLine();		// nextInt ���� nextLine���� �߻��ϴ� ������ �ذ��ϱ� ���� ��ĳ�� �Է� ����
		String title = input.nextLine();	// ��� ������(����) �Է�
		this.setTitle(title);
		
		System.out.print("Author name: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Category: ");
		String cat = input.next();			// ��� ���� �Է�
		this.setCat(cat);
		input.nextLine();		// next ���� nextLine���� �߻��ϴ� ������ �ذ��ϱ� ���� ��ĳ�� �Է� ����
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer !='n' && answer != 'N')
		{
			System.out.println("Do you have an Source Link address? (Y/N)");
				answer = input.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				System.out.print("News Link Address: ");
				input.nextLine();
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
	
	public void printInfo() {
		System.out.println("Research: " + num + ". " + title + " ("+name+") _"+cat);
				
	}

}
