public class waterflower{
   public static void main(String [] args){
   int a,b,c,i;
   i=100;
   while(i<1000){
        a=i/100;
	c=i%10;
	b=i/10%10;
	if(a*a*a+b*b*b+c*c*c==i){
   System.out.print(i+"\n"); }
   i++;
   }
}}