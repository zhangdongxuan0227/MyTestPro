//package ����ͼ�����ϵͳ;

import java.util.Scanner;

public class BookMgr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//���ݳ�ʼ��6��ͼ��
		//ͼ�飺ͼ���������ͼ�����״̬��ͼ��������ڣ�ͼ����Ĵ���
		String[]names = new String[6];
		int []states = new int[6];//0�ɽ裬1�ѽ��
		int []dates = new int[6];
		int [] counts = new int[6];

		names[0] = "python���ı��";
		dates[0] = 5;
		states[0] = 1;
		counts[0] = 10;
		names[1] = "java���˼��";
		dates[1] = 0;
		states[1] = 0;
		counts[1] = 16;
		names[2] = "������mysql";
		dates[2] = 0;
		states[2] = 0;
		counts[2] = 78;
		names[3] = "�������java�����";
		dates[3] = 0;
		states[3] = 0;
		counts[3] = 0;
		names[4] = "���ܵ���";
		dates[4] = 0;
		states[4] = 0;
		counts[4] = 0;
		
		/* names[6] = "�������java�����";
		dates[6] = 0;
		states[6] = 0;
		counts[6] = 0; */
		
		//�û��Ƿ��˳�ϵͳ true�����˳���false�����˳�ϵͳ��
		boolean flag = true;
		int num = 0;
		do {
			System.out.println("********��ӭʹ������ͼ�����ϵͳ********");
			System.out.println("1.�鿴ͼ��");
			System.out.println("2.����ͼ��");
			System.out.println("3.����ͼ��");
			System.out.println("4.�黹ͼ��");
			System.out.println("5.ɾ��ͼ��");
			System.out.println("6.�˳�ϵͳ");
			System.out.print("��ѡ����Ĳ�����");

			int choose = input.nextInt();
			switch(choose) {
			case 1:
				//�鿴ͼ��
				System.out.println("\nͼ����Ϣ�б�-->");
				System.out.println("ͼ�����\tͼ������\tͼ��״̬\t��������\t���Ĵ���");
				//ѭ���������е�ͼ��
				for (int i = 0; i<names.length; i++) {
					if (names[i] != null) {
						String state = (states[i] == 0)?"�ɽ���":"�ѽ��";
						String date = (dates[i] == 0)?"":dates[i]+"��";
						String count = counts[i]+"��";
						System.out.println((i+1)+"\t"+names[i]+"\t"+state+"\t"+date+"\t"+count);
					} else {
						//������һ��Ϊnull��ͼ������ƣ���ζ�ź����ͼ��ҲΪnull����ѭ����
						break;
					}
				}
				break;
			case 2:
				//����ͼ��
				System.out.println("\nͼ����Ϣ�б�-->");
				System.out.print("����������ͼ�����ƣ�");
				String name = input.next();
				//�Ƿ�������ͼ�飬����������ˣ�6�����޷����false�����true

				boolean flagAdd = false;
				for (int i = 0; i<names.length; i++) {
					if (names[i] == null) {
						flagAdd = true;
						names[i] = name;
						System.out.println("ͼ�顶"+name+"����ӳɹ���");
						break;
					}
				}
				if (!flagAdd) {
					System.out.println("�Բ��𣬻����������޷����ͼ�飡");
				}
				break;
			case 3:
				//����ͼ��
				break;
			case 4:
				//�黹ͼ��
				break;
			case 5:
				//ɾ��ͼ��
				break;
			case 6:
				//�˳�ϵͳ
				flag = false;
				break;
			default:
				//������������
				flag = false;
				break;
			}
			//���flag== false�����ѭ��������ϵͳ
			if (flag == false) {
				//����ѭ��
				break;
			} else {
				//�û�������ʹ��ϵͳ�������û��뷵�����˵���������
				System.out.println("������0����");
				num= input.nextInt();
			}
		} while(num == 0);
		System.out.println("лл����ӭʹ�ã�");
























	}

}