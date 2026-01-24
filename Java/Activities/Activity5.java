package Examples;

abstract class BookNovel {
	String title;

	abstract void setTitle(String title);

	String getTitle() {
		return title;
	}
}

class MyNovel extends BookNovel {
	
	public void setTitle(String title) {
		this.title = title;
	}
}

public class Activity5 {
	public static void main(String[] args) {
	
		String title = "Hover Car Racer";
		BookNovel newNovel = new MyNovel();
		
		newNovel.setTitle(title);
		System.out.println("The title is: " + newNovel.getTitle());
	}
}


