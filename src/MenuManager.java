import java.util.Scanner;

public class MenuManager {		//Menu Management Ŭ����
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		NewsManager newsManager = new NewsManager(input);
		
		int menu;				// �޴� �Է� ���� ����
		
		do {					//���α׷� ���� �� ������ 1���� ������ �޴�
			System.out.println(">>> News Article Management System Menu <<<\n");
			System.out.println("1. Add Article");				// 1. ��� �߰�
			System.out.println("2. Delete Article");			// 2. ��� ����
			System.out.println("3. Edit Article");				// 3. ��� ����
			System.out.println("4. View Article");				// 4. ��� ����
			System.out.println("5. View Favorite Article");		// 5. ���� ��� ��� ����
			System.out.println("6. View Article Category List");// 6. ��� ���� ��� ����
			System.out.println("7. Exit");						// 7. ������ (���α׷� ����)
			System.out.print("Select number: ");				// ���ϴ� �޴� ����
			menu = input.nextInt();
			
			switch (menu) {			// �Է��� ���ڿ� ���� �ش� �޼ҵ� ����
			case 1:
				newsManager.addNews();
				break;
			case 2:
				newsManager.deleteNews();
				break;
			case 3:
				newsManager.editNews();
				break;
			case 4:
				newsManager.viewNews();
				break;
			case 5:
				newsManager.viewFavNews();
				break;
			case 6:
				newsManager.viewCategories();
				break;
			}
		} while (menu != 7);			// 7��(������)�� �Է����� ���� ��� �ٽ� �޴��� �����
	}
	
	

}
