
public class Hostpital {

	public static void main(String[] args) {
		//�����ִ°� �޼ҵ� ������ ���ξȿ��� ���� ���氡��
		Doctor ���� = new Doctor("����","�����е�","ü�°�"); //�����ڿ� �ִ� Ÿ�Կ� �°� ���� �ִ´�. 
	   //����.setComputer("MRI");
		����.inquery();
		����.treatment();
		
		String computer = ����.getComputer();
		String meString = ����.getMedicalAppliance();
		System.out.println("������ ��ǻ�ʹ�" + computer + "�Դϴ�.");
		System.out.println("������ ���ᵵ���� " + meString + "�Դϴ�.");

		Doctor ������ = new Doctor();
		������.treatment();
		������.prescription();

	}

}
