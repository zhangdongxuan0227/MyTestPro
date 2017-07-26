import java.util.Arrays;

public class sortList {
	public static void main(String[] args) {
		sortList hello = new sortList();
		int[] scores= {79,52,98,81};

		//调用方法，传入成绩数组，并获取成绩的个数
		int count= hello.sort(scores);

		System.out.println("共有"+count+"个成绩信息！");
	}

	/*
	 * 功能：将考试成绩排序并输出，返回成绩的个数
	 * 定义一个包含整型数组参数的方法，传入成绩数组
	 * 使用Arrays类对成绩数组进行排序并输出
	 * 方法执行后返回数组中元素的个数
	 */
	public int sort( int[] i) {
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));

		//返回数组中元素的个数
		return i.length;
	}
}


/* 实现功能：将考试成绩排序并输出，返回成绩的个数

实现思路：

1、 定义一个包含整型数组参数的方法，用来传入成绩数组

2、 在方法体中使用 Arrays.sort( ) 方法对成绩数组进行排序，然后使用 Arrays.toString( ) 方法将数组转换为字符串并输出，最后使用 return 返回数组中元素的个数。

3、 调用方法时需要先创建对象，然后再调用.调用时为其传入成绩数组，并获取方法的返回值，保存在变量中，最后输出成绩的个数。

 

请将编辑器中的第 9、20、25 行代码填写完整 */