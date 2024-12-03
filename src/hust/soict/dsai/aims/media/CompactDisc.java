package hust.soict.dsai.aims.media;

import java.util.ArrayList;
public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();
	public CompactDisc(int id, String title, String category, float cost,String artist) {
		super(id,title,category,cost);
		this.artist = artist;
	}
	public ArrayList<Track> getTracks() {
		return tracks;
	}
	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}
	public boolean checkTrack(Track track) {
		if (!tracks.contains(track)) return false;
		return true;
	}
	public void addTrack(Track track) {
		if(!checkTrack(track)) tracks.add(track);
	}

	public void removeTrack(Track track) {
		if(checkTrack(track)) tracks.remove(track);
	}
	public int getLength() {
	    int totalLength = 0;
	    for (Track track : tracks) {
	        totalLength += track.getLength();
	    }
	    return totalLength;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void play() {
	    System.out.println("Playing CD: " + this.getTitle());
	    System.out.println("Artist: " + this.artist);
	    System.out.println("Total length: " + this.getLength() + " seconds");
	    for (Track track : tracks) {
	        track.play();
	    }
	    @Override
	    public String toString() {
	        return super.toString() + ", Artist: " + artist;
	    }
	}



}
