package bridgePattern;

public class ArtistResource implements Resource{
	private Artist artist;
	public ArtistResource(Artist artist) {
		this.artist = artist;
	}
	public String snippet(){
		return this.artist.bio();
	}
	@Override
	public String title() {
		return this.artist.getfName() + " " + this.artist.getlName();
	}
	@Override
	public String image() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String url() {
		// TODO Auto-generated method stub
		return null;
	}
}
