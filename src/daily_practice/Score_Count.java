public class Score_Count {
    public static void main(String[] args) {
        
        // ��������ɼ�
        int score = 53; 
        
        // ��������ӷִ���
        int count = 0;

		score += count;
        //��ӡ����ӷ�ǰ�ɼ� 
        System.out.println("�ӷ�ǰ������"+ score);  
       
        
        // ֻҪ�ɼ�С��60����ѭ��ִ�мӷֲ�������ͳ�Ƽӷִ���
		 while(score < 60){

            score +=1;

            count++;
        }
		System.out.println("�ӷֺ������"+ score);  
		System.out.println("�ӷִ�����"+ count);  	
			
	}
			
}
			
			
        
        
        
        
        
        



//����������Ϊָ���ɼ��ӷ֣�ֱ���������ڵ��� 60 Ϊֹ������ӷ�ǰ�ͼӷֺ�ĳɼ�����ͳ�ƼӷֵĴ���