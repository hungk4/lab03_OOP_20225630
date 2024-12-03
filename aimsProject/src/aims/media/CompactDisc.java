package aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks;
	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
    public CompactDisc(String title, float cost) {
        super(title, cost);
    }
    
    public CompactDisc(String title, float cost, String artist) {
        super(title, cost);
        this.artist = artist;
        this.tracks = new ArrayList<>();
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
	
	public int getLength() {
		int sum = 0;
		for(Track track : tracks) {
			sum += track.getLength();
		}
		return sum;
	}
	
	@Override
	public void play() {
		System.out.println("Playing CompactiDisc: " + this.getTitle());
		System.out.println("Number of tracks: " + tracks.size());
		for(Track track : tracks) {
			track.play();
		}
	}
	
    @Override
    public String toString() {
        return "CD: " + this.getTitle() + ", Artist: " + artist + ", Cost: $" + this.getCost();
    }

}
