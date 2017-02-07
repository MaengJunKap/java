
public class PatientModel {

	private String name;
	private int age;
	private String troubleType;

	public PatientModel() {

	}

	public PatientModel(String name, int age, String troubleType) {
		this.name = name;
		this.age = age;
		this.troubleType = troubleType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTroubleType() {
		return troubleType;
	}

	public void setTroubleType(String troubleType) {
		this.troubleType = troubleType;
	}

}
