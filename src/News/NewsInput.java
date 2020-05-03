package News;

import java.util.Scanner;

public interface NewsInput {
	
	public int getNum();
	public void setNum(int num);
	public void setTitle(String title);
	public void setDate(String date);
	public void setCat(String cat);
	public void setLink(String link);
	public void setFav(char fav);
	public char getFav();
	public String getCat();
	
	public void getNewsInput(Scanner input);
	
	public void printInfo();
	
	public void setNewsNum(Scanner input);
	public void setNewsTitle(Scanner input);
	public void setNewsDate(Scanner input);
	public void setNewsCat(Scanner input);
	public void setNewsLink(Scanner input);
	public void setNewsFav(Scanner input);
	
	

}