import java.util.Scanner;

public class NewsManager {
	NewsArticle news;
	Scanner input;
	NewsManager(Scanner input){
		this.input = input;
	}
	
	
	public void addNews() {		// ��� �߰� �޼ҵ�
		news = new NewsArticle();
		System.out.println("\n## Add Article ##");
		System.out.print("Article Number: ");
		news.num = input.nextInt();		// ��� ��ȣ �Է�
		System.out.print("News Title: ");
		input.nextLine();		// nextInt ���� nextLine���� �߻��ϴ� ������ �ذ��ϱ� ���� ��ĳ�� �Է� ����
		news.title = input.nextLine();	// ��� ������(����) �Է�
		System.out.print("News Date: ");
		news.date = input.next();			// ��� ��¥ �Է�
		System.out.print("News Category: ");
		news.cat = input.next();			// ��� ���� �Է�
		input.nextLine();		// next ���� nextLine���� �߻��ϴ� ������ �ذ��ϱ� ���� ��ĳ�� �Է� ����
		System.out.print("News Link Address: ");
		news.link = input.nextLine();		// ��� ��ũ �ּ� �Է�
		System.out.print("Set this article to Favorite? (y/n): ");
		news.fav = input.next().charAt(0);	// ���� ��� ���� ���� �Է� (y �Է� �� ���ɱ�� ����)
		
		
		System.out.println("\n**********Check News Information**********");	// �߰��� ��� Ȯ��
		System.out.println("Number: "+news.num);
		System.out.println("Title: "+news.title);
		System.out.println("Date: "+news.date);
		System.out.println("Category: "+news.cat);
		System.out.println("Link Address: "+news.link);
		if (news.fav == 'y')System.out.println("@@ Favorite Article @@");		// ���� ���� ���� �� ��µǴ� ����
		System.out.println("==========Add Complete!==========\n\n");
	}
	
	public void deleteNews() {		// ��� ���� �޼ҵ�
		System.out.println("\n## Delete Article ##");
		System.out.println("News Number: ");
		int num = input.nextInt();
		if (news == null) {
			System.out.println("can't find the news number");
			return;
		}
		if (news.num == num) {
			news = null;
			System.out.println("news deleted");
		}
	}
	
	public void editNews() {			// ��� ���� �޼ҵ�
		
		System.out.println("\n## Edit Article ##");
		System.out.println("Article Number: ");
		int num = input.nextInt();
		if (news.num == num) {
			int menu;				
								
				System.out.println("** News Info Edit Menu **\n");
				System.out.println("1. Edit Title");				
				System.out.println("2. Edit Date");					
				System.out.println("3. Edit Category");				
				System.out.println("4. Edit Link Address");				
				System.out.println("5. Change Favorite or not");		
				System.out.println("6. Exit");
						
			do {
				System.out.print("Select number: ");				
				menu = input.nextInt();	
				switch (menu) {
				case 1:
					input.nextLine();
					System.out.print("New Title: ");
					news.title = input.nextLine();
					break;
				case 2:
					System.out.print("New Date: ");
					news.date = input.next();
					break;
				case 3:
					System.out.print("New Category: ");
					news.cat = input.next();
					break;
				case 4:
					input.nextLine();
					System.out.print("New Link Address: ");
					news.link = input.nextLine();
					break;
				case 5:
					System.out.print("Set this article to Favorite? (y/n): ");
					news.fav = input.next().charAt(0);
					break;
				case 6:
					break;
				}
			} while (menu != 6);
			
		}
	}
	
	public void viewNews() {		// ��� ���� �޼ҵ�
		
		System.out.println("\n## View Article ##");
		int num = input.nextInt();
		if (news.num == num) {
			news.printInfo();
		}
		
		
	}
	
	public void viewFavNews() {		// ���� ��� ���� �޼ҵ�
		
		System.out.println("\n## View Favorite Article ##");
		
		System.out.println("\n\n");
		
	}
	
	public void viewCategories() {	// ��� ���� ��� ���� �޼ҵ�
		
		System.out.println("\n## View Article Categories ##");
		
		System.out.println("\n\n");
		
	}

}
