package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {		//Menu Management 클래스
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		NewsManager newsManager = getObject("newsmanager.ser");
		if (newsManager == null) {
			newsManager = new NewsManager(input);
		}
		else {
			newsManager.setScanner(input);
		}
		
		WindowFrame frame = new WindowFrame(newsManager);
		selectMenu(input, newsManager);
		putObject(newsManager, "newsmanager.ser");
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
					logger.log("add news");
					break;
				case 2:
					newsManager.deleteNews();
					logger.log("delete news");
					break;
				case 3:
					newsManager.editNews();
					logger.log("edit news");
					break;
				case 4:
					newsManager.viewNewslist();
					logger.log("view news list");
					break;
				case 5:
					newsManager.viewFavNews();
					logger.log("view favorite news list");
					break;
				case 6:
					newsManager.viewCategories();
					logger.log("view categories");
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
	
	public static NewsManager getObject(String filename) {
		NewsManager newsManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			newsManager = (NewsManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return newsManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return newsManager;
		
	}
	
	public static NewsManager putObject(NewsManager newsManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(newsManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return newsManager;
		
	}

}
