public class calc {
	public static void main(String[] args) {

		// �������󣬶�����Ϊhello
		calc hello = new calc();

		// ���÷������������ſγ̵ĳɼ�
		double avg=hello.calcAvg(94, 81);
		System.out.println(avg);
	}

	/*
	 * ���ܣ��������ſγ̿��Գɼ���ƽ���ֲ����ƽ����
	 * ����һ���������������ķ����������������ſγ̵ĳɼ�
	 */
	public double calcAvg( double a,double b){
		double c = (a+b)/2;
		return c;
	}














}