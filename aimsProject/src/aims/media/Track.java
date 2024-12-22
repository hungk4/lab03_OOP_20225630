package aims.media;

import aims.exception.PlayerException;

public class Track implements Playable{
	private String title;
	private int length;
	public Track() {
		// TODO Auto-generated constructor stub
	}
	
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	
	@Override
	public void play() throws PlayerException {
		if(this.getLength() > 0) {
			System.out.println("Playing Track: " + this.getTitle());
			System.out.println("Track length: " + this.getLength());		
		} else {
			throw new PlayerException("ERROR: Track length is non-positive");
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null || !(obj instanceof Media)) {
			return false;
		}
		Track track = (Track) obj;
		return super.equals(obj) && this.length == track.getLength();
	}

		
}
