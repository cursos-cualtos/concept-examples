package cualtos.examples;

public class Tag {
	private String name = "";
	
	public Tag(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	private Boolean ValidateName(String inputName) {
		if (inputName.length() < 9)
			return true;
		return false;
	}
}
