import java.util.Arrays;

public class sortList {
	public static void main(String[] args) {
		sortList hello = new sortList();
		int[] scores= {79,52,98,81};

		//���÷���������ɼ����飬����ȡ�ɼ��ĸ���
		int count= hello.sort(scores);

		System.out.println("����"+count+"���ɼ���Ϣ��");
	}

	/*
	 * ���ܣ������Գɼ�������������سɼ��ĸ���
	 * ����һ������������������ķ���������ɼ�����
	 * ʹ��Arrays��Գɼ���������������
	 * ����ִ�к󷵻�������Ԫ�صĸ���
	 */
	public int sort( int[] i) {
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));

		//����������Ԫ�صĸ���
		return i.length;
	}
}


/* ʵ�ֹ��ܣ������Գɼ�������������سɼ��ĸ���

ʵ��˼·��

1�� ����һ������������������ķ�������������ɼ�����

2�� �ڷ�������ʹ�� Arrays.sort( ) �����Գɼ������������Ȼ��ʹ�� Arrays.toString( ) ����������ת��Ϊ�ַ�������������ʹ�� return ����������Ԫ�صĸ�����

3�� ���÷���ʱ��Ҫ�ȴ�������Ȼ���ٵ���.����ʱΪ�䴫��ɼ����飬����ȡ�����ķ���ֵ�������ڱ����У��������ɼ��ĸ�����

 

�뽫�༭���еĵ� 9��20��25 �д�����д���� */