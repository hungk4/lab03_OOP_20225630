package aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc{
	private String artist;
	private ArrayList<Track> tracks;
	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}
	
	public void addTrack(Track track) {
		if(tracks.contains(track)) {
			System.out.println("Da ton tai track trong danh sach");
		} else {
			tracks.add(track);
			System.out.println("Da them: " + track);
		}
	}
	
	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("Da xoa " + track);
		} else {
			System.out.println("Ko ton tai " +  track);
		}
	}
	

}
