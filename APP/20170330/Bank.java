import java.util.*;
public class Bank{
	//����
	static String name;
	static int card;
	static int mima;
	static double money; 
	 
	static Scanner sc = new Scanner(System.in);
	//������
	public Bank(String name,int card,int mima,double money){
			this.name=name;
			this.card=card;
			this.mima=mima;
			this.money=money;
	}
	//���
	public static void speak(){
		System.out.println("�˻�����"+name+"������"+card+"���Ϊ"+money);
	}

	//����
	public static void menu(){
		System.out.println("-------------��ѡ��------------");
		System.out.println("-----=========�˵�========-----");
		System.out.println("-----------1.��½--------------");
		System.out.println("----=======2.ȡǮ======----");
		System.out.println("----=======3.���======----");
		System.out.println("----=======4.��ѯ���======----");
		System.out.println("----=======5.�˳��˵�======----");
		int a = sc.nextInt();
		switch(a){
			case 1:
				enter();
			    break;
			case 2:
				drawmoney();
				break;
			case 3:
				paymoney();
				break;
			case 4:
				selectmoney();
				break;
			case 5 :
				exitmenu();
				break;
			default:
				System.out.println("������������������");
				menu();
		}
	}
	
	//��½
	public static void enter(){
		System.out.println("----===�������˻���===----");
		String name = sc.next();
		System.out.println("----===�������˺�===----");
		int card = sc.nextInt();
		System.out.println("----===����������===----");
		int mima = sc.nextInt();
		
		
	}

	//���
	public static void drawmoney(){
		System.out.println("����Ҫ����Ľ��");
		int p = sc.nextInt();
		
	}
	
	//ȡ��
	public static void paymoney(){
	
	}
	
	//��ѯ
	public static void selectmoney(){
		System.out.println("----1.ָ����ѯ----");
		System.out.println("----2.ȫ����ѯ----");
		int j = sc.nextInt();
		if(j==1){
			System.out.println("������Ҫ��ѯ���˻�");
			String ming = sc.next();
			for(Bank s:body){
				if(s!=null && ming.equals(s.name) ){
					s.speak();
				}
			}
		}else if(j==2){
			for(Bank s:body){
				if(s!=null ){
					s.speak();
				}
			}
		}	
		System.out.println("--------1.������ѯ----------");
		System.out.println("--------2.���ز˵�----------");
		int h = sc.nextInt();
		if(h==1){
			selectmoney();
		}else if(h==2){
			menu();
		}else{
			System.out.println("��������");
		}		
	}

	//�˳�
	public static void exitmenu(){
		System.out.println("BEYBEY");
	}
}