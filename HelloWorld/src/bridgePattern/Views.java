package bridgePattern;

public abstract class Views {
	private Resource R;
	public Views(Resource R) {
		this.R = R;
	}
	public abstract String show();
}
