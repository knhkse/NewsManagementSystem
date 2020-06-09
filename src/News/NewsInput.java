package News;

import java.util.Scanner;

import exception.LinkFormatException;

public interface NewsInput {
	
	public int getNum();
	public String getTitle();
	public void setNum(int num);
	public void setTitle(String title);
	public void setDate(String date);
	public void setCat(String cat);
	public void setLink(String link) throws LinkFormatException;
	public void setFav(char fav);
	public char getFav();
	public String getCat();
	public String getDate();
	public String getLink();
	
	public void getNewsInput(Scanner input);
	
	public void printInfo();
	
	public void setNewsNum(Scanner input);
	public void setNewsTitle(Scanner input);
	public void setNewsDate(Scanner input);
	public void setNewsCat(Scanner input);
	public void setNewsLink(Scanner input);
	public void setNewsFav(Scanner input);
	
	

}
