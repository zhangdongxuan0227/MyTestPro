public class overLoadTest {
	public static void main(String[] args) {

		// ��������
		overLoadTest hello = new overLoadTest();

		// �����޲εķ���
		hello.print();

		// ���ô���һ���ַ��������ķ���
		hello.print("zxc");

		// ���ô���һ�����Ͳ����ķ���
		hello.print(12);
	}

	public void print() {
		System.out.println("�޲ε�print����");
	}

	public void print(String name) {
		System.out.println("����һ���ַ���������print����������ֵΪ��" + name);
	}

	public void print(int age) {
		System.out.println("����һ�����Ͳ�����print����������ֵΪ��" + age);
	}
}

/* �ڱ༭���ж� print �����������أ���ͨ�����벻ͬ�Ĳ�������ƥ������ط�����

���ڵ� 8��11��14 ���н�������д���� */