import javax.swing.JOptionPane;

public class TestNumber {
	public static void main(String args[]) {
		loopNumber();
	}

	static void loopNumber() {
		int number = 0, d5, d4, d3, d2, d1;
		String str = JOptionPane.showInputDialog("����һ��1��99999֮�����");
		number = Integer.parseInt(str);
		if (number >= 1 && number <= 99999) { // �ж�number��1��99999֮�������
			d5 = number / 10000; // ����number�����λ����λ��d5
			d4 = number % 10000 / 1000; // ����number��ǧλd4
			d3 = number % 1000 / 100; // ����number�İ�λd3
			d2 = number % 100 / 10;
			d1 = number % 10;
			if (d5 != 0) { // �ж�number��5λ��������
				System.out.println(number + "��5λ��");
				if (d5 == d1 && d4 == d2) { // �ж�number�ǻ����������� 
					System.out.println(number + "�ǻ�����");
				} else {
					System.out.println(number + "���ǻ�����");
				}
			} else if (d4 != 0) { // �ж�number��4λ��������
				System.out.println(number + "��4λ��");
				if (d4 == d1 && d3 == d2) { // �ж�number�ǻ�������������
					System.out.println(number + "�ǻ�����");
				} else {
					System.out.println(number + "���ǻ�����");
				}
			} else if (d3 != 0) { // �ж�number��3λ��������
				System.out.println(number + "��3λ��");
				if (d3 == d1) { // �ж�number�ǻ�����������
					System.out.println(number + "�ǻ�����");
				} else {
					System.out.println(number + "���ǻ�����");
				}
			} else if (d2 != 0) {
				System.out.println(number + "��2λ��");
				if (d1 == d2) {
					System.out.println(number + "�ǻ�����");
				} else {
					System.out.println(number + "���ǻ�����");
				}
			} else if (d1 != 0) {
				System.out.println(number + "��1λ��");
				System.out.println(number + "�ǻ�����");
			}
		} else {
			System.out.printf("\n%d����1��99999֮��", number);
		}
	}
}
