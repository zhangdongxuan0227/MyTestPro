//�ⲿ��OuterClass
public class OuterClass {

	//�ⲿ���˽������name
	private String name = "imooc";

	//�ⲿ��ĳ�Ա����
	int age = 20;

	//��Ա�ڲ���Inner
	public class Inner {
		String name = "��Ľ��";
		//�ڲ����еķ���
		public void show() {
			System.out.println("�ⲿ���е�name:" +  OuterClass.this.name );
			System.out.println("�ڲ����е�name:" +   name      );
			System.out.println("�ⲿ���е�age:" + age);
		}
	}

	//���Գ�Ա�ڲ���
	public static void main(String[] args) {

		//�����ⲿ��Ķ���
		OuterClass o = new OuterClass ();

		//�����ڲ���Ķ���
		Inner inn =  o.new Inner() ;

		//�����ڲ�������show����
		inn.show();
	}
}