﻿public class getMaxAge {

	//完成 main 方法
	public static void main(String[] args) {

		// 创建对象，对象名为hello
		getMaxAge hello = new getMaxAge();

		// 调用方法并将返回值保存在变量�?		int maxscore = hello.getMaxAge();

		// 输出最大年�?		System.out.println("最大年龄为�? + maxscore);
	}

	/*
	 * 功能：输出学生年龄的最大�?	 * 定义一个无参的方法，返回值为年龄的最大�?	 * 参考步骤：
	 * 1、定义一个整形数�?ages ，保存学生年龄，数组元素依次�?18 ,23 ,21 ,19 ,25 ,29 ,17
	 * 2、定义一个整形变�?max ,保存学生最大年龄，初始时假定数组中的第一个元素为最大�?	 * 3、使�?for 循环遍历数组中的元素，并与假定的最大值比较，如果比假定的最大值要大，则替换当前的最大�?	 * 4、使�?return 返回最大�?	 */
	public int getMaxAge() {
		int[] ages = {18,23,21,19,25,29,17};
		int max = ages[0];
		for (int i = 0; i < ages.length; i++) {
			max = (max > ages[i])? max:ages[i];
            
        }
		return max;

	}
}


/* 一�?定义一个无参带返回值的方法，实现输出学生年龄的最大�?
提示�?1�?定义一个整形数�?ages ，保存学生年龄，数组元素依次�?18 ,23 ,21 ,19 ,25 ,29 ,17
2�?定义一个整形变�?max ,保存学生最大年龄，初始时假定数组中的第一个元素为最大�?3�?使用 for 循环遍历数组中的元素，并与假定的最大值比较，如果比假定的最大值要大，则替换当前的最大�?4�?使用 return 返回最大�?二�?完成 main 方法

 提示�? 1�?调用自定义方法，将方法返回值保存在变量 maxScore �? 2�?输出变量结果 */