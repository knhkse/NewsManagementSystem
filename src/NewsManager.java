import java.util.Scanner;

import News.Magazine;
import News.NewsArticle;
import java.util.ArrayList;
import java.util.*;

public class NewsManager {
	ArrayList<NewsArticle> articles = new ArrayList<NewsArticle>();
	Scanner input;
	NewsManager(Scanner input){	//NewsManager class에 대한 생성자 설정
		this.input = input;
	}
	
	
	public void addNews() {		// 기사 추가 메소드
		
		System.out.println("\n## Add Article ##");
		int kind = 0;
		NewsArticle news;
		while(kind != 1 && kind !=2) {
			System.out.println("1 for Newspaper");
			System.out.println("2 for Magazine");
			System.out.println("Select number for News Kind between 1 and 2: ");
			kind = input.nextInt();
			if (kind == 1) {
				news = new NewsArticle();
				news.getNewsInput(input);
				articles.add(news);
				break;
			}
			else if (kind == 2) {
				news = new Magazine();
				news.getNewsInput(input);
				articles.add(news);
				break;
			}
			else {
				System.out.println("Select number for News Kind between 1 and 2: ");
			}
		}
	}
	
	public void deleteNews() {		// 기사 삭제 메소드
		System.out.println("\n## Delete Article ##");
		System.out.println("News Number: ");	// 삭제할 기사 번호 입력
		int newsnum = input.nextInt();
		int index = -1;
		for (int i=0; i<articles.size(); i++) {
			if (articles.get(i).getNum() == newsnum) {	// 기사가 존재할 경우
				index = i;
				break;
			}
		}
		if (index >=0) {
			articles.remove(index);
			System.out.println("=== News " + newsnum + " is deleted ===");
		}
		else {
			System.out.println("can't find the news number");
			return;
		}

	}
	
	public void editNews() {			// 기사 수정 메소드
		System.out.println("\n## Edit Article ##");
		System.out.print("Article Number: ");		// 수정할 기사 번호 입력
		int newsnum = input.nextInt();
		for (int i=0; i<articles.size(); i++) {
			NewsArticle news = articles.get(i);
			if (news.getNum() == newsnum) {		// 기사가 존재할 경우
				int menu = -1;				
									// 수정 메뉴 출력
				System.out.println("\n** News Info Edit Menu **");
				System.out.println("1. Edit Title");				
				System.out.println("2. Edit Date");					
				System.out.println("3. Edit Category");				
				System.out.println("4. Edit Link Address");				
				System.out.println("5. Change Favorite or not");		
				System.out.println("6. Exit");
						
			do {		// 수정할 부분 선택 및 수정
				System.out.print("Select number: ");				
				menu = input.nextInt();	
				switch (menu) {
				case 1:		// 타이틀 수정
					input.nextLine();	// nextInt 다음 nextLine 오류 수정
					System.out.print("New Title: ");
					String title = input.nextLine();
					news.setTitle(title);
					break;
				case 2:		// 날짜 수정
					System.out.print("New Date: ");
					String date = input.next();
					news.setDate(date);
					break;
				case 3:		// 카테고리 수정
					System.out.print("New Category: ");
					String cat = input.next();
					news.setCat(cat);
					break;
				case 4:		// 주소 수정
					input.nextLine();	// nextInt 다음 nextLine 오류 수정
					System.out.print("New Link Address: ");
					String link = input.nextLine();
					news.setLink(link);
					break;
				case 5:		// 관심기사 여부 수정
					System.out.print("Set this article to Favorite? (y/n): ");
					char fav = input.next().charAt(0);
					news.setFav(fav);
					break;
				case 6:			// 수정 모드에서 나가기
					break;
				} // switch
				} while (menu != 6); // while
				System.out.println();
				break;
			} // if
		}	// for
	}
	
	public void viewNewslist() {		// 기사 보기 메소드
		System.out.println("\n## View Article List ##");
		for (int i=0; i<articles.size(); i++) {
			articles.get(i).printInfo();
		}
		System.out.println();
	}
	
	public void viewFavNews() {		// 관심 기사 보기 메소드
		
		System.out.println("\n## View Favorite Article ##");
		for (int i=0; i<articles.size(); i++) {
			if (articles.get(i).getFav() == 'y') {
				articles.get(i).printInfo();
			}
		}
		System.out.println();
	}
	
	public void viewCategories() {	// 기사 주제 목록 보기 메소드
		HashSet<String> category = new HashSet<String>();
		
		System.out.println("\n## View Article Categories ##");
		for (int i=0; i<articles.size(); i++)
			category.add(articles.get(i).getCat());
		System.out.println(category);
		System.out.println();
	}
}