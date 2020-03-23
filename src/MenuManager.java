import java.util.Scanner;


public class MenuManager {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int menu;
		
		do {
			System.out.println(">>> News Article Management System Menu <<<\n");
			System.out.println("1. Add Article");
			System.out.println("2. Delete Article");
			System.out.println("3. Edit Article");
			System.out.println("4. View All Article List");
			System.out.println("5. View Favorite Article");
			System.out.println("6. View Article Categories");
			System.out.println("7. Exit");
			System.out.print("Select number: ");
			menu = input.nextInt();
			
			switch (menu) {
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
		} while (menu != 7);
	}
	
	
	public static void addNews() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n## Add Article ##");
		System.out.print("Article Number: ");
		int num = input.nextInt();
		System.out.print("News Title: ");
		input.nextLine();		// nextInt 다음 nextLine에서 발생하는 오류를 해결하기 위한 스캐너 입력 삽입
		String title = input.nextLine();
		System.out.print("News Date: ");
		String date = input.next();
		System.out.print("News Category: ");
		String cat = input.next();
		input.nextLine();		// next 다음 nextLine에서 발생하는 오류를 해결하기 위한 스캐너 입력 삽입
		System.out.print("News Link Adress: ");
		String link = input.nextLine();
		
		System.out.println("\n**********Check News Information**********");
		System.out.println("Number: "+num);
		System.out.println("Title: "+title);
		System.out.println("Date: "+date);
		System.out.println("Category: "+cat);
		System.out.println("Link Adress: "+link);
		System.out.println("==========Add Complete!==========\n\n");		
	}
	
	public static void deleteNews() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n## Delete Article ##");
		System.out.println("News Number: ");
		int num = input.nextInt();
	}
	
	public static void editNews() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n## Edit Article ##");
		System.out.println("Article Number: ");
		int num = input.nextInt();
	}
	
	public static void viewAllNews() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n## View All Article ##");
		
		System.out.println("\n\n");
		
	}
	
	public static void viewFavNews() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n## View Favorite Article ##");
		
		System.out.println("\n\n");
		
	}
	
	public static void viewCategories() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n## View Article Categories ##");
		
		System.out.println("\n\n");
		
	}
}
