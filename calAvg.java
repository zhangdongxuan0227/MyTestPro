public class calAvg {

	public static void main(String[] args) {

		// ������Ϊhello�Ķ���
		calAvg hello = new calAvg();

		// ����hello�����calcAvg()��������������ֵ�����ڱ���avg��
		double avg =hello.calcAvg();

		    System.out.println("ƽ���ɼ�Ϊ��" + avg);
	}

	// ����һ������ֵΪdouble���͵ķ���
	public  double  calcAvg() {

		double java = 92.5;
		double php = 83.0;
		double avg = (java + php) / 2; // ����ƽ��ֵ

		// ʹ��return����ֵ
		return avg;

	}
}