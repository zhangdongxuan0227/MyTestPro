public class StaticClass {

	// �ⲿ���еľ�̬����score
	private static int score = 84;
	private int num = 88;

	// ������̬�ڲ���
	public    static    class SInner {
		// �ڲ����еı���score
		int score = 91;

		public void show() {
			System.out.println("�����ⲿ���е�score:" +   StaticClass.score   );
			System.out.println("�����ڲ����е�score:" + score);
			System.out.println("�����ⲿ���е�num:" +  new StaticClass().num   );
		}
	}

	// ���Ծ�̬�ڲ���
	public static void main(String[] args) {
		// ֱ�Ӵ����ڲ���Ķ���
		SInner si = new SInner();

		// ����show����
		si.show();
	}
}