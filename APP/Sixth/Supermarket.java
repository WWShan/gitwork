import java.util.*;
public class Supermarket{
	public static void main(String [] args){
		menu();
	}
	static int i=0; 
	//����
	static String goodname;
	static int goodamount;
	static double goodprice;
	static String goodkind;
	
	static Scanner sc = new Scanner(System.in);
	
	static Supermarket [] goods = new Supermarket[1000];

	//����
	public static void menu(){
		System.out.println("-------------��ѡ��------------");
		System.out.println("-----=========�˵�========-----");
		System.out.println("----=======1.������Ʒ======----");
		System.out.println("----=======2.������Ʒ======----");
		System.out.println("----=======3.�޸���Ʒ======----");
		System.out.println("----=======4.��ѯ��Ʒ======----");
		System.out.println("----=======5.�˳��˵�======----");
		int a = sc.nextInt();
		switch(a){
			case 1:
				addgoods();
			    break;
			case 2:
				salegoods();
				break;
			case 3:
				updategoods();
				break;
			case 4:
				selectgoods();
				break;
			case 5:
				exitmenu();
				break;
			default:
				System.out.println("������������������");
				menu();
		}
	}

	//������Ʒ
	public static void addgoods(){
		boolean flag=true;
		while(true){
			System.out.println("��������Ʒ����");
			String name = sc.next();
			System.out.println("��������Ʒ����");
			int amount = sc.nextInt();
			System.out.println("��������Ʒ�۸�");
			double price = sc.nextDouble();
			System.out.println("��������Ʒ����");
			String kind = sc.next();
			
			Supermarket good = new Supermarket(goodname,goodamount,goodprice,goodkind);
			goods[i++]=good;
			
			System.out.println("1.¼����ɣ�����¼��");
			System.out.println("2.���ز˵�");
			int b = sc.nextInt();
			if(b==1){
				flag=true;
				addgoods();
			}else if(b==2){
				flag=false;
				menu();
			}else{
				System.out.println("������������������");
				addgoods();
			}
		}
	}
	//������Ʒ
	public static void salegoods(){
		System.out.println("�����������۵���Ʒ");
				String n = sc.next();
				for(int k=0;k<goods.length;k++){
					if(goods[k]!=null){
						goods[k]=null;
					}	
				}
					System.out.println("ɾ����ɣ���ѡ�����������������˵�");
					System.out.println("==========1,����==========");
					System.out.println("==========2,�˳�==========");
					int s = sc.nextInt();
					if(s==1){
						salegoods();
					}else if(s==2){
						menu();
					}
		
	}
	//�޸���Ʒ
	public static void updategoods(){
		System.out.println("===������Ҫ�޸ĵ���Ʒ==");
		String newname = sc.next();
		for(int p=0;p<goods.length;p++){
			if(goods[p]!=null && newname.equals(goods[p].goodname)){
				System.out.println("��������Ʒ����");
				String name = sc.next();
				System.out.println("��������Ʒ����");
				int amount = sc.nextInt();
				System.out.println("��������Ʒ�۸�");
				double price = sc.nextDouble();
				System.out.println("��������Ʒ����");
				String kind = sc.next();
				Supermarket good = new Supermarket(goodname,goodamount,goodprice,goodkind);
				goods[p] = good;
				System.out.println("�޸ĳɹ�");
			}else{
				System.out.println("û�����������Ʒ���ϣ�����������");
			}
				System.out.println("===1.�����޸�===");
				System.out.println("===2.���ز˵�===");
				int l = sc.nextInt();
				if(l==1){
					updategoods();
				}else if(l==2){
					menu();
				 }
			}
	}

	//��ѯ��Ʒ
	public static void selectgoods(){
		System.out.println("----1.ָ����ѯ----");
		System.out.println("----2.ȫ����ѯ----");
		int j = sc.nextInt();
		if(j == 1){
			System.out.println("������Ҫ��ѯ����Ʒ");
			String mingcheng = sc.next();
			for(Supermarket s:goods){
				if(s!=null && mingcheng.equals(s.goodname) ){
					s.speak();
				}
			}
		}else if(j==2){
			for(int i=0;i<goods.length;i++){
				if(goods[i]!=null ){
					goods[i].speak();
				}
			}
		}	
		System.out.println("--------1.������ѯ----------");
		System.out.println("--------2.���ز˵�----------");
		int h = sc.nextInt();
		if(h==1){
			selectgoods();
		}else if(h==2){
			menu();
		}else{
			System.out.println("��������");
		}
			
	}

	//�˳��˵�
	public static void exitmenu(){
		System.out.println("ByeBye!");
	}
	//�������
	public static void speak(){
		System.out.println("���ƽ�"+goodname+",������"+goodamount+",�۸���"+goodprice+"����Ϊ"+goodkind);
	}

	//������
	public Supermarket (String goodname,int goodamount,double goodprice,String goodkind){
		this.goodname=goodname;
		this.goodamount=goodamount;
		this.goodprice=goodprice;
		this.goodkind=goodkind;
	}
}