
import java.util.Arrays;

public class demo5 {
    
    public static void main(String[] args) {
        
		// ����һ���������飬����ɼ���Ϣ
		int[] scores = { 89, 72, 64, 58, 93 };
        
		// ��Arrays��������������
		Arrays.sort(scores);
        
		// ʹ��foreach������������е�Ԫ��
		for (int i:scores    ) {
			System.out.println(i);
		}
	}
}




/* �ڱ༭���ж�����һ���������� scores ������ѧ���ɼ���Ϣ��ͨ�� Arrays ��� sort �����Գɼ������������Ȼ��ʹ�� foreach ������������е�Ԫ�ء�

���ڵ� 10��14 ���н�������д����

���н��Ϊ�� */