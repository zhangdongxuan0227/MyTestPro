public class Score_Count {
    public static void main(String[] args) {
        
        // 变量保存成绩
        int score = 53; 
        
        // 变量保存加分次数
        int count = 0;

		score += count;
        //打印输出加分前成绩 
        System.out.println("加分前分数："+ score);  
       
        
        // 只要成绩小于60，就循环执行加分操作，并统计加分次数
		 while(score < 60){

            score +=1;

            count++;
        }
		System.out.println("加分后分数："+ score);  
		System.out.println("加分次数："+ count);  	
			
	}
			
}
			
			
        
        
        
        
        
        



//功能描述：为指定成绩加分，直到分数大于等于 60 为止，输出加分前和加分后的成绩，并统计加分的次数