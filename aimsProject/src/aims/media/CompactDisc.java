package aims.media;

import java.util.ArrayList;

import aims.exception.PlayerException;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks;
	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
    public CompactDisc(String title, float cost) {
        super(title, cost);
    }
    
    public CompactDisc(String title, String artist, float cost) {
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
//			System.out.println("Da them track: " + track.getTitle());
		}
	}
	
	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("Da xoa track: " + track);
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
	public void play() throws PlayerException {
		if (this.getLength() <= 0) {
            System.err.println("ERROR: CD length is non-positive");
            throw new PlayerException("ERROR: CD length is non-positive");
        }

        try {
            for (Track track : tracks) {
                track.play(); // Nếu độ dài track không hợp lệ, sẽ ném PlayerException
            }
        } catch (PlayerException e) {
            System.err.println("PlayerException occurred during track playback: " + e.getMessage());
            throw e; // Ném lại ngoại lệ PlayerException nếu xảy ra trong track
        }
	}
	
    @Override
    public String toString() {
        return "CD: " + this.getTitle() + ", Artist: " + artist + ", Cost: $" + this.getCost();
    }

}
