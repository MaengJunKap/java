
public class Doctor {

	private String computer = "����ý���";
	private String medicalAppliance = "û����";

	// ������
	public void setComputer(String computer) {
		this.computer = computer;
	}

	public void setMedicalAppliance(String medicalAppliance) {
		this.medicalAppliance = medicalAppliance;
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
		System.out.println("�ǻ簡" + medicalAppliance + "�� ȯ���� ó������ �ۼ��մϴ�.");
	}

}
