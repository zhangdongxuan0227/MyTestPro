public class overLoadTest {
	public static void main(String[] args) {

		// 创建对象
		overLoadTest hello = new overLoadTest();

		// 调用无参的方法
		hello.print();

		// 调用带有一个字符串参数的方法
		hello.print("zxc");

		// 调用带有一个整型参数的方法
		hello.print(12);
	}

	public void print() {
		System.out.println("无参的print方法");
	}

	public void print(String name) {
		System.out.println("带有一个字符串参数的print方法，参数值为：" + name);
	}

	public void print(int age) {
		System.out.println("带有一个整型参数的print方法，参数值为：" + age);
	}
}

/* 在编辑器中对 print 方法进行重载，并通过传入不同的参数调用匹配的重载方法。

请在第 8、11、14 行中将代码填写完整 */