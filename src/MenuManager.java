import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {		//Menu Management Ŭ����
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		NewsManager newsManager = new NewsManager(input);	// NewsManager Ŭ���� �ҷ�����
		selectMenu(input, newsManager);
	}
	
	public static void selectMenu(Scanner input, NewsManager newsManager) {
		int menu;				// �޴� �Է� ���� ����
		do {
			try {
			showMenu();
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
					newsManager.viewNewslist();
					break;
				case 5:
					newsManager.viewFavNews();
					break;
				case 6:
					newsManager.viewCategories();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("++ Please put an ingeger between 1~5 ++\n");
				if (input.hasNext()) {
					input.next();
				}
				menu = -1;
			}
		} while (menu != 7);
	}
	
	public static void showMenu() {
		System.out.println(">>> News Article Management System Menu <<<\n");
		System.out.println("1. Add Article");				// 1. ��� �߰�
		System.out.println("2. Delete Article");			// 2. ��� ����
		System.out.println("3. Edit Article");				// 3. ��� ����
		System.out.println("4. View Article List");			// 4. ��� ����
		System.out.println("5. View Favorite Article");		// 5. ���� ��� ��� ����
		System.out.println("6. View Article Category List");// 6. ��� ���� ��� ����
		System.out.println("7. Exit");						// 7. ������ (���α׷� ����)
		System.out.print("Select number: ");				// ���ϴ� �޴� ����
		
	}

}
