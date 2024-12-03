package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Disc implements Playable{
public DigitalVideoDisc(String director, String category, String title, float cost) {
	super();
}
private static int nbDigitalVideoDiscs = 0;
public DigitalVideoDisc(String title) {
    this.title = title;
    nbDigitalVideoDiscs++;
    this.id = nbDigitalVideoDiscs;
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



