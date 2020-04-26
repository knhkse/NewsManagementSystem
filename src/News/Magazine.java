package News;

import java.util.Scanner;

public class Magazine extends NewsArticle {
	
	public Magazine(NewsKind kind) {
		super(kind);
	}
	
	public void getNewsInput(Scanner input) {
		System.out.print("Article Number: ");
		int num = input.nextInt();			// 기사 번호 입력
		this.setNum(num);
		
		System.out.print("News Title: ");
		input.nextLine();		// nextInt 다음 nextLine에서 발생하는 오류를 해결하기 위한 스캐너 입력 삽입
		String title = input.nextLine();	// 기사 헤드라인(제목) 입력
		this.setTitle(title);
		
		System.out.print("News Date: ");
		String date = input.next();			// 기사 날짜 입력
		this.setDate(date);
		
		System.out.print("News Category: ");
		String cat = input.next();			// 기사 주제 입력
		this.setCat(cat);
		input.nextLine();		// next 다음 nextLine에서 발생하는 오류를 해결하기 위한 스캐너 입력 삽입
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer !='n' && answer != 'N')
		{
			System.out.println("Do you have an Link address? (Y/N)");
				answer = input.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				System.out.print("News Link Address: ");
				input.nextLine();
				String link = input.nextLine();		// 기사 링크 주소 입력
				this.setLink(link);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setLink("");
				break;
			}
			else {
			}
		}
		System.out.print("Set this article to Favorite? (y/n): ");
		char fav = input.next().charAt(0);	// 관심 기사 설정 여부 입력 (y 입력 시 관심기사 설정)
		this.setFav(fav);
		System.out.println();
	}

}
