public class StaticClass {

	// 外部类中的静态变量score
	private static int score = 84;
	private int num = 88;

	// 创建静态内部类
	public    static    class SInner {
		// 内部类中的变量score
		int score = 91;

		public void show() {
			System.out.println("访问外部类中的score:" +   StaticClass.score   );
			System.out.println("访问内部类中的score:" + score);
			System.out.println("访问外部类中的num:" +  new StaticClass().num   );
		}
	}

	// 测试静态内部类
	public static void main(String[] args) {
		// 直接创建内部类的对象
		SInner si = new SInner();

		// 调用show方法
		si.show();
	}
}