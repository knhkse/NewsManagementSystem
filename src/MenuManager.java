import java.util.Scanner;

public class MenuManager {		//Menu Management 클래스
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int menu;				// 메뉴 입력 변수 설정
		
		do {					//프로그램 실행 시 무조건 1번은 나오는 메뉴
			System.out.println(">>> News Article Management System Menu <<<\n");
			System.out.println("1. Add Article");				// 1. 기사 추가
			System.out.println("2. Delete Article");			// 2. 기사 삭제
			System.out.println("3. Edit Article");				// 3. 기사 수정
			System.out.println("4. View All Article List");		// 4. 모든 기사 목록 보기
			System.out.println("5. View Favorite Article");		// 5. 관심 기사 목록 보기
			System.out.println("6. View Article Category List");// 6. 기사 주제 목록 보기
			System.out.println("7. Exit");						// 7. 나가기 (프로그램 종료)
			System.out.print("Select number: ");				// 원하는 메뉴 선택
			menu = input.nextInt();
			
			switch (menu) {			// 입력한 숫자에 따라 해당 메소드 실행
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
		} while (menu != 7);			// 7번(나가기)를 입력하지 않을 경우 다시 메뉴를 출력함
	}
	
	
	public static void addNews() {		// 기사 추가 메소드
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n## Add Article ##");
		System.out.print("Article Number: ");
		int num = input.nextInt();		// 기사 번호 입력
		System.out.print("News Title: ");
		input.nextLine();		// nextInt 다음 nextLine에서 발생하는 오류를 해결하기 위한 스캐너 입력 삽입
		String title = input.nextLine();	// 기사 헤드라인(제목) 입력
		System.out.print("News Date: ");
		String date = input.next();			// 기사 날짜 입력
		System.out.print("News Category: ");
		String cat = input.next();			// 기사 주제 입력
		input.nextLine();		// next 다음 nextLine에서 발생하는 오류를 해결하기 위한 스캐너 입력 삽입
		System.out.print("News Link Adress: ");
		String link = input.nextLine();		// 기사 링크 주소 입력
		System.out.print("Set this article to Favorite? (y/n): ");
		char fav = input.next().charAt(0);	// 관심 기사 설정 여부 입력 (y 입력 시 관심기사 설정)
		
		
		System.out.println("\n**********Check News Information**********");	// 추가한 기사 확인
		System.out.println("Number: "+num);
		System.out.println("Title: "+title);
		System.out.println("Date: "+date);
		System.out.println("Category: "+cat);
		System.out.println("Link Adress: "+link);
		if (fav == 'y')System.out.println("@@ Favorite Article @@");		// 관심 기사로 설정 시 출력되는 문장
		System.out.println("==========Add Complete!==========\n\n");
	}
	
	public static void deleteNews() {		// 기사 삭제 메소드
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n## Delete Article ##");
		System.out.println("News Number: ");
		int num = input.nextInt();
	}
	
	public static void editNews() {			// 기사 수정 메소드
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n## Edit Article ##");
		System.out.println("Article Number: ");
		int num = input.nextInt();
	}
	
	public static void viewAllNews() {		// 모든 기사 보기 메소드
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n## View All Article ##");
		
		System.out.println("\n\n");
		
	}
	
	public static void viewFavNews() {		// 관심 기사 보기 메소드
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n## View Favorite Article ##");
		
		System.out.println("\n\n");
		
	}
	
	public static void viewCategories() {	// 기사 주제 목록 보기 메소드
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n## View Article Categories ##");
		
		System.out.println("\n\n");
		
	}
}
