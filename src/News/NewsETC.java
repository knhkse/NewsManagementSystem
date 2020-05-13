package News;

import java.util.Scanner;

import exception.LinkFormatException;

public abstract class NewsETC extends NewsArticle {
	
	public NewsETC(NewsKind kind) {
		super(kind);
	}

	@Override
	public abstract void getNewsInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println(skind + num + ". " + title + " ("+date+") _"+cat);
	}
	
	public void setNewsLinkwithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer !='n' && answer != 'N')
		{
			System.out.println("Do you have an Source Link address? (Y/N)");
			answer = input.next().charAt(0);
			try {	
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
			catch(LinkFormatException e) {
				System.out.println("Incorrect Link Format");
			}
		}
	}
}
