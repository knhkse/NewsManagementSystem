import java.util.Scanner;

public class MenuManager {		//Menu Management Ŭ����
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int menu;				// �޴� �Է� ���� ����
		
		do {					//���α׷� ���� �� ������ 1���� ������ �޴�
			System.out.println(">>> News Article Management System Menu <<<\n");
			System.out.println("1. Add Article");				// 1. ��� �߰�
			System.out.println("2. Delete Article");			// 2. ��� ����
			System.out.println("3. Edit Article");				// 3. ��� ����
			System.out.println("4. View All Article List");		// 4. ��� ��� ��� ����
			System.out.println("5. View Favorite Article");		// 5. ���� ��� ��� ����
			System.out.println("6. View Article Category List");// 6. ��� ���� ��� ����
			System.out.println("7. Exit");						// 7. ������ (���α׷� ����)
			System.out.print("Select number: ");				// ���ϴ� �޴� ����
			menu = input.nextInt();
			
			switch (menu) {			// �Է��� ���ڿ� ���� �ش� �޼ҵ� ����
			case 1:
				addNews();
				break;
			case 2:
				deleteNews();
				break;
			case 3:
				editNews();
				break;
			case 4:
				viewAllNews();
				break;
			case 5:
				viewFavNews();
				break;
			case 6:
				viewCategories();
				break;
			}
		} while (menu != 7);			// 7��(������)�� �Է����� ���� ��� �ٽ� �޴��� �����
	}
	
	
	public static void addNews() {		// ��� �߰� �޼ҵ�
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n## Add Article ##");
		System.out.print("Article Number: ");
		int num = input.nextInt();		// ��� ��ȣ �Է�
		System.out.print("News Title: ");
		input.nextLine();		// nextInt ���� nextLine���� �߻��ϴ� ������ �ذ��ϱ� ���� ��ĳ�� �Է� ����
		String title = input.nextLine();	// ��� ������(����) �Է�
		System.out.print("News Date: ");
		String date = input.next();			// ��� ��¥ �Է�
		System.out.print("News Category: ");
		String cat = input.next();			// ��� ���� �Է�
		input.nextLine();		// next ���� nextLine���� �߻��ϴ� ������ �ذ��ϱ� ���� ��ĳ�� �Է� ����
		System.out.print("News Link Adress: ");
		String link = input.nextLine();		// ��� ��ũ �ּ� �Է�
		System.out.print("Set this article to Favorite? (y/n): ");
		char fav = input.next().charAt(0);	// ���� ��� ���� ���� �Է� (y �Է� �� ���ɱ�� ����)
		
		
		System.out.println("\n**********Check News Information**********");	// �߰��� ��� Ȯ��
		System.out.println("Number: "+num);
		System.out.println("Title: "+title);
		System.out.println("Date: "+date);
		System.out.println("Category: "+cat);
		System.out.println("Link Adress: "+link);
		if (fav == 'y')System.out.println("@@ Favorite Article @@");		// ���� ���� ���� �� ��µǴ� ����
		System.out.println("==========Add Complete!==========\n\n");
	}
	
	public static void deleteNews() {		// ��� ���� �޼ҵ�
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n## Delete Article ##");
		System.out.println("News Number: ");
		int num = input.nextInt();
	}
	
	public static void editNews() {			// ��� ���� �޼ҵ�
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n## Edit Article ##");
		System.out.println("Article Number: ");
		int num = input.nextInt();
	}
	
	public static void viewAllNews() {		// ��� ��� ���� �޼ҵ�
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n## View All Article ##");
		
		System.out.println("\n\n");
		
	}
	
	public static void viewFavNews() {		// ���� ��� ���� �޼ҵ�
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n## View Favorite Article ##");
		
		System.out.println("\n\n");
		
	}
	
	public static void viewCategories() {	// ��� ���� ��� ���� �޼ҵ�
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n## View Article Categories ##");
		
		System.out.println("\n\n");
		
	}
}
