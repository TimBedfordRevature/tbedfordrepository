package fixtures;

public abstract class Fixture {

	public String name;
	public String shortDescription;
	public String longDescription;


	public Fixture(String name, String shortDescription, String longDescription) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	public Fixture(String name, String shortDescription) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;

	}

	public Fixture() {}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getShortDescription() {
		return shortDescription;
	}


	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}


	public String getLongDescription() {
		return longDescription;
	}


	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(shortDescription);
		return builder.toString();
	}




}
