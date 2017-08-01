public class demo6 {
	public static void main(String[] args) {

		// 定义两行三列的二维数组并赋值
		String[][] names= {{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
		
		System.out.println(names.length);
		// System.out.println(names[i].length);

		// 通过二重循环输出二维数组中元素的值
		for (int i = 0; i <names.length; i++) {

			for (int j = 0; j < names[i].length; j++) {

				System.out.print( names[i][j] );
			}

			System.out.println("\n");
		}
	}
}


// 功能要求：定义一个两行三列的二维数组 names 并赋值，使用二重循环输出二维数组中的元素。