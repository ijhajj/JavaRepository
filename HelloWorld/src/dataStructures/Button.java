package dataStructures;

public class Button {
	private String title;
	private OnClickListener onClickListener;
	
	public Button(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	
	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	
	public void OnClick() {
		this.onClickListener.onClick(this.title);
	}
	
	//declared the interface inside the class
	public interface OnClickListener{
		public void onClick(String title);
	}

}
