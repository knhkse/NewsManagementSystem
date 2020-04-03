import java.util.Scanner;

public class MenuManager {		//Menu Management 클래스
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		NewsManager newsManager = new NewsManager(input);
		
		int menu;				// 메뉴 입력 변수 설정
		
		do {					//프로그램 실행 시 무조건 1번은 나오는 메뉴
			System.out.println(">>> News Article Management System Menu <<<\n");
			System.out.println("1. Add Article");				// 1. 기사 추가
			System.out.println("2. Delete Article");			// 2. 기사 삭제
			System.out.println("3. Edit Article");				// 3. 기사 수정
			System.out.println("4. View Article");				// 4. 기사 보기
			System.out.println("5. View Favorite Article");		// 5. 관심 기사 목록 보기
			System.out.println("6. View Article Category List");// 6. 기사 주제 목록 보기
			System.out.println("7. Exit");						// 7. 나가기 (프로그램 종료)
			System.out.print("Select number: ");				// 원하는 메뉴 선택
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
				newsManager.viewNews();
				break;
			case 5:
				newsManager.viewFavNews();
				break;
			case 6:
				newsManager.viewCategories();
				break;
			}
		} while (menu != 7);			// 7번(나가기)를 입력하지 않을 경우 다시 메뉴를 출력함
	}
	
	

}
