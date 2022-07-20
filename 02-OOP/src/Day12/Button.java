package Day12;

public class Button implements OnClickListener{
	private String name;
	
	public Button(String name) {
		this.name = name;
	}
	
	void display() {
		System.out.println("Font Size = " + FONT_SIZE);
		System.out.println("Font Family = " + FONT_FAMILY);
	}

	@Override
	public void onClick() {
		System.out.println(name + " click event");		
	}

	@Override
	public void onDoubleClick() {
		System.out.println(name + " click event");		
	}
}
