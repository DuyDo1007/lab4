package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Disc implements Playable{
	private String director;
	private int length;
	public DigitalVideoDisc(int id,String title, String category, float cost,String director,int length) {
	super(id,title,category,cost);
    this.director = director;
    this.length = length;
}
public boolean isMatch(String title) {
	if (this.title == title) return true;
	return false;
}
public void play() {
	System.out.println("Playing DVD: " + this.getTitle());
	System.out.println("DVD length: " + this.getLength());
}
@Override
public String toString() {
    return "DVD - " + title +"-"+ category +"-"+ director +"-" +length +":" + cost + "$";
}

}



