public class demo6 {
	public static void main(String[] args) {

		// �����������еĶ�ά���鲢��ֵ
		String[][] names= {{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
		
		System.out.println(names.length);
		// System.out.println(names[i].length);

		// ͨ������ѭ�������ά������Ԫ�ص�ֵ
		for (int i = 0; i <names.length; i++) {

			for (int j = 0; j < names[i].length; j++) {

				System.out.print( names[i][j] );
			}

			System.out.println("\n");
		}
	}
}


// ����Ҫ�󣺶���һ���������еĶ�ά���� names ����ֵ��ʹ�ö���ѭ�������ά�����е�Ԫ�ء�