public class Bei{
	public static void main(String args []){
		int i,k;
		for(i=1,k=0;i<=100;i++){
			if(i%3==0){
				System.out.println(i);	
				k++;
			}
		}System.out.println("100����3�ı�����"+k+"��");
		
		for(i=1,k=1;i<=100;i++){
			if(i%3==0 && k<=5){
				System.out.println(i);
				k++;
			}
		}	
	}
}