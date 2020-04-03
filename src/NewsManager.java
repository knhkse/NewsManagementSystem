import java.util.Scanner;

public class NewsManager {
	NewsArticle news;
	Scanner input;
	NewsManager(Scanner input){
		this.input = input;
	}
	
	
	public void addNews() {		// 기사 추가 메소드
		news = new NewsArticle();
		System.out.println("\n## Add Article ##");
		System.out.print("Article Number: ");
		news.num = input.nextInt();		// 기사 번호 입력
		System.out.print("News Title: ");
		input.nextLine();		// nextInt 다음 nextLine에서 발생하는 오류를 해결하기 위한 스캐너 입력 삽입
		news.title = input.nextLine();	// 기사 헤드라인(제목) 입력
		System.out.print("News Date: ");
		news.date = input.next();			// 기사 날짜 입력
		System.out.print("News Category: ");
		news.cat = input.next();			// 기사 주제 입력
		input.nextLine();		// next 다음 nextLine에서 발생하는 오류를 해결하기 위한 스캐너 입력 삽입
		System.out.print("News Link Address: ");
		news.link = input.nextLine();		// 기사 링크 주소 입력
		System.out.print("Set this article to Favorite? (y/n): ");
		news.fav = input.next().charAt(0);	// 관심 기사 설정 여부 입력 (y 입력 시 관심기사 설정)
		
		
		System.out.println("\n**********Check News Information**********");	// 추가한 기사 확인
		System.out.println("Number: "+news.num);
		System.out.println("Title: "+news.title);
		System.out.println("Date: "+news.date);
		System.out.println("Category: "+news.cat);
		System.out.println("Link Address: "+news.link);
		if (news.fav == 'y')System.out.println("@@ Favorite Article @@");		// 관심 기사로 설정 시 출력되는 문장
		System.out.println("==========Add Complete!==========\n\n");
	}
	
	public void deleteNews() {		// 기사 삭제 메소드
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
	
	public void editNews() {			// 기사 수정 메소드
		
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
	
	public void viewNews() {		// 기사 보기 메소드
		
		System.out.println("\n## View Article ##");
		int num = input.nextInt();
		if (news.num == num) {
			news.printInfo();
		}
		
		
	}
	
	public void viewFavNews() {		// 관심 기사 보기 메소드
		
		System.out.println("\n## View Favorite Article ##");
		
		System.out.println("\n\n");
		
	}
	
	public void viewCategories() {	// 기사 주제 목록 보기 메소드
		
		System.out.println("\n## View Article Categories ##");
		
		System.out.println("\n\n");
		
	}

}
