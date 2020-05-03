import java.util.Scanner;

import News.Magazine;
import News.NewsArticle;
import News.NewsInput;
import News.NewsKind;
import News.Newspaper;
import News.Research;

import java.util.ArrayList;
import java.util.*;

public class NewsManager {
	ArrayList<NewsInput> articles = new ArrayList<NewsInput>();
	Scanner input;
	NewsManager(Scanner input){	//NewsManager class에 대한 생성자 설정
		this.input = input;
	}
	
	
	public void addNews() {		// 기사 추가 메소드
		
		System.out.println("\n## Add Article ##");
		int kind = 0;
		NewsInput newsInput;
		while(kind != 1 && kind !=2 && kind != 3) {
			System.out.println("1. Newspaper");
			System.out.println("2. Magazine");
			System.out.println("3. Research");
			System.out.print("Select number for News Kind between 1 and 3: ");
			kind = input.nextInt();
			if (kind == 1) {
				newsInput = new Newspaper(NewsKind.Newspaper);
				newsInput.getNewsInput(input);
				articles.add(newsInput);
				break;
			}
			else if (kind == 2) {
				newsInput = new Magazine(NewsKind.Magazine);
				newsInput.getNewsInput(input);
				articles.add(newsInput);
				break;
			}
			else if (kind == 3) {
				newsInput = new Research(NewsKind.Research);
				newsInput.getNewsInput(input);
				articles.add(newsInput);
			}
			else {
				System.out.println("Select number for News Kind between 1 and 3: ");
			}
		}
	}
	
	public void deleteNews() {		// 기사 삭제 메소드
		System.out.println("\n## Delete Article ##");
		System.out.println("News Number: ");	// 삭제할 기사 번호 입력
		int newsnum = input.nextInt();
		int index = findIndex(newsnum);
		removefromNews(index, newsnum);
	}
	
	public int findIndex(int newsnum) {
		int index = -1;
		for (int i=0; i<articles.size(); i++) {
			if (articles.get(i).getNum() == newsnum) {	// 기사가 존재할 경우
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromNews(int index, int newsnum) {
		if (index >=0) {
			articles.remove(index);
			System.out.println("=== News " + newsnum + " is deleted ===");
			return 1;
		}
		else {
			System.out.println("can't find the news number");
			return -1;
		}
		
	}
	
	public void editNews() {			// 기사 수정 메소드
		System.out.println("\n## Edit Article ##");
		System.out.print("Article Number: ");		// 수정할 기사 번호 입력
		int newsnum = input.nextInt();
		for (int i=0; i<articles.size(); i++) {
			NewsInput news = articles.get(i);
			if (news.getNum() == newsnum) {		// 기사가 존재할 경우
				int menu = -1;				
				showEditMenu();
			while (menu != 6) {		// 수정할 부분 선택 및 수정
				System.out.print("Select number: ");				
				menu = input.nextInt();	
				switch (menu) {
				case 1:		// 타이틀 수정
					input.nextLine();	// nextInt 다음 nextLine 오류 수정
					news.setNewsTitle(input);
					break;
				case 2:		// 날짜 수정
					news.setNewsDate(input);
					break;
				case 3:		// 카테고리 수정
					news.setNewsCat(input);
					break;
				case 4:		// 주소 수정
					input.nextLine();	// nextInt 다음 nextLine 오류 수정
					news.setNewsLink(input);
					break;
				case 5:		// 관심기사 여부 수정
					news.setNewsFav(input);
					break;
				default:			// 수정 모드에서 나가기
					continue;
				} // switch
				} // while
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
	

	
	public void showEditMenu() {
		System.out.println("\n** News Info Edit Menu **");
		System.out.println("1. Edit Title");				
		System.out.println("2. Edit Date");					
		System.out.println("3. Edit Category");				
		System.out.println("4. Edit Link Address");				
		System.out.println("5. Change Favorite or not");		
		System.out.println("6. Exit");
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