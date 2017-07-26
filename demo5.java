
import java.util.Arrays;

public class demo5 {
    
    public static void main(String[] args) {
        
		// 定义一个整型数组，保存成绩信息
		int[] scores = { 89, 72, 64, 58, 93 };
        
		// 对Arrays类对数组进行排序
		Arrays.sort(scores);
        
		// 使用foreach遍历输出数组中的元素
		for (int i:scores    ) {
			System.out.println(i);
		}
	}
}




/* 在编辑器中定义了一个整型数组 scores ，保存学生成绩信息，通过 Arrays 类的 sort 方法对成绩数组进行排序，然后使用 foreach 遍历输出数组中的元素。

请在第 10、14 行中将代码填写完整

运行结果为： */