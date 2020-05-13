import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {		//Menu Management 클래스
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		NewsManager newsManager = new NewsManager(input);	// NewsManager 클래스 불러오기
		selectMenu(input, newsManager);
	}
	
	public static void selectMenu(Scanner input, NewsManager newsManager) {
		int menu;				// 메뉴 입력 변수 설정
		do {
			try {
			showMenu();
			menu = input.nextInt();
			
				switch (menu) {			// 입력한 숫자에 따라 해당 메소드 실행
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
		System.out.println("1. Add Article");				// 1. 기사 추가
		System.out.println("2. Delete Article");			// 2. 기사 삭제
		System.out.println("3. Edit Article");				// 3. 기사 수정
		System.out.println("4. View Article List");			// 4. 기사 보기
		System.out.println("5. View Favorite Article");		// 5. 관심 기사 목록 보기
		System.out.println("6. View Article Category List");// 6. 기사 주제 목록 보기
		System.out.println("7. Exit");						// 7. 나가기 (프로그램 종료)
		System.out.print("Select number: ");				// 원하는 메뉴 선택
		
	}

}
