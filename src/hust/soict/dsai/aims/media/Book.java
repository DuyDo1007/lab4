package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
public Book(int id, String title, String category, float cost) {
	super();
}
public boolean checkAuthor(String authorName) {
	if (authors.contains(authorName)) return true;
	return false;
}
public void addAuthor(String authorName) {
	if (!checkAuthor(authorName)) {
		authors.add(authorName);
	} else return ;
}

public void removeAuthor(String authorName) {
	if(checkAuthor(authorName)) {
		authors.remove(authorName);
	} else return;
}
}
