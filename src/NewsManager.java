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
	NewsManager(Scanner input){	//NewsManager class�� ���� ������ ����
		this.input = input;
	}
	
	
	public void addNews() {		// ��� �߰� �޼ҵ�
		
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
	
	public void deleteNews() {		// ��� ���� �޼ҵ�
		System.out.println("\n## Delete Article ##");
		System.out.println("News Number: ");	// ������ ��� ��ȣ �Է�
		int newsnum = input.nextInt();
		int index = findIndex(newsnum);
		removefromNews(index, newsnum);
	}
	
	public int findIndex(int newsnum) {
		int index = -1;
		for (int i=0; i<articles.size(); i++) {
			if (articles.get(i).getNum() == newsnum) {	// ��簡 ������ ���
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
	
	public void editNews() {			// ��� ���� �޼ҵ�
		System.out.println("\n## Edit Article ##");
		System.out.print("Article Number: ");		// ������ ��� ��ȣ �Է�
		int newsnum = input.nextInt();
		for (int i=0; i<articles.size(); i++) {
			NewsInput news = articles.get(i);
			if (news.getNum() == newsnum) {		// ��簡 ������ ���
				int menu = -1;				
				showEditMenu();
			while (menu != 6) {		// ������ �κ� ���� �� ����
				System.out.print("Select number: ");				
				menu = input.nextInt();	
				switch (menu) {
				case 1:		// Ÿ��Ʋ ����
					input.nextLine();	// nextInt ���� nextLine ���� ����
					news.setNewsTitle(input);
					break;
				case 2:		// ��¥ ����
					news.setNewsDate(input);
					break;
				case 3:		// ī�װ� ����
					news.setNewsCat(input);
					break;
				case 4:		// �ּ� ����
					input.nextLine();	// nextInt ���� nextLine ���� ����
					news.setNewsLink(input);
					break;
				case 5:		// ���ɱ�� ���� ����
					news.setNewsFav(input);
					break;
				default:			// ���� ��忡�� ������
					continue;
				} // switch
				} // while
				System.out.println();
				break;
			} // if
		}	// for
	}
	
	public void viewNewslist() {		// ��� ���� �޼ҵ�
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
	
	public void viewFavNews() {		// ���� ��� ���� �޼ҵ�
		
		System.out.println("\n## View Favorite Article ##");
		for (int i=0; i<articles.size(); i++) {
			if (articles.get(i).getFav() == 'y') {
				articles.get(i).printInfo();
			}
		}
		System.out.println();
	}
	
	public void viewCategories() {	// ��� ���� ��� ���� �޼ҵ�
		HashSet<String> category = new HashSet<String>();
		
		System.out.println("\n## View Article Categories ##");
		for (int i=0; i<articles.size(); i++)
			category.add(articles.get(i).getCat());
		System.out.println(category);
		System.out.println();
	}
}