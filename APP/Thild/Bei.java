public class Bei{
	public static void main(String args []){
		int i,k;
		for(i=1,k=0;i<=100;i++){
			if(i%3==0){
				System.out.println(i);	
				k++;
			}
		}System.out.println("100以内3的倍数有"+k+"个");
		
		for(i=1,k=1;i<=100;i++){
			if(i%3==0 && k<=5){
				System.out.println(i);
				k++;
			}
		}	
	}
}