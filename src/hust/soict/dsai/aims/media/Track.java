package hust.soict.dsai.aims.media;

public class Track implements Playable {
	private String title;
	private int length;
	public Track(String title, int length) {
	    this.title = title;
	    this.length = length;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Track track = (Track) obj;
	    return length == track.length && title.equalsIgnoreCase(track.title);
	}
	@Override
	public String toString() {
        return "Track [title=" + title + ", length=" + length + "]";
    }


}
