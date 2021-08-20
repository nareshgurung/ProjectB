package fixture;

public abstract class Fixture {
	private String name;
	private String sDescription;
	private String lDescription;
	
	public Fixture(String name, String sDescription, String lDescription) {
		this.name =name;
		this.sDescription = sDescription;
		this.lDescription = lDescription;
		
	}
	public Fixture() {
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getsDescription() {
		return sDescription;
	}

	public void setsDescription(String sDescription) {
		this.sDescription = sDescription;
	}

	public String getlDescription() {
		return lDescription;
	}

	public void setlDescription(String lDescription) {
		this.lDescription = lDescription;
	}

	public void init() {
	}
	
//	@Override
//	public String toString() {
//		return "Fixture [name=" + name + ", sDescription=" + sDescription + ", lDescription=" + lDescription + "]";
//	}
	
}
