

public class Doctor {

	private String computer ;
	private String medicalAppliance ;  //�ν��Ͻ������� ������ ���� ���� ������ �ȵȴ�. �����ڸ� �����ϴ°� ȿ���� 
	
	public Doctor(){
		this.computer = "����ý���";
		this.medicalAppliance = "û����"; 
	}
	public Doctor(String name, String computer, String medicalappliance){ //���� �ʱ�ȭ�Ҷ� ������ 
		System.out.println("Docter �����ڰ� ȣ��Ǿ����ϴ�.");
		this.computer = computer;
		this.medicalAppliance  = medicalappliance;
		System.out.println(name+"��ü�� �����Ǿ����ϴ�.");
	}

	// ������
	public void setComputer(String computer) {
		this.computer = computer;
	}

	public String getComputer() {
		return computer;
	}

	public void setMedicalAppliance(String medicalAppliance) {
		this.medicalAppliance = medicalAppliance;
	}

	public String getMedicalAppliance() {
		return medicalAppliance;
	}

	// ȯ�� ���� ��ȸ
	public void inquery() {
		System.out.println(computer + "���� ȯ���� �̸��� ��ȸ�մϴ�.");
	}

	// ȯ�� ����
	public void treatment() {
		System.out.println("�ǻ簡" + medicalAppliance + "�� �ǻ簡 ȯ�ڸ� �����մϴ�.");
	}

	// ó���� �ۼ�
	public void prescription() {
		System.out.println("�ǻ簡" + computer + "�� ȯ���� ó������ �ۼ��մϴ�.");
	}

}
