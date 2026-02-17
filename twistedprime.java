import java.util.*;
//to find the given number is prime the reverse that number and chec again that reversed number is prime or not. this concept is called twisted prime number 
public class twistedprime {
  
  public static int rev(int a){
    int rev=0;
    while(a>0){
      
      int temp=a%10;
      rev=(rev*10)+temp;
      a=a/10;
      
    }
    return rev;
  }
  
  public static int prime(int a){
    int c=0;
    for(int i=2;i<Math.sqrt(a);i++){
      if(a%i==0 ){
        c++;
        break;
      }
    }
    return c;

  }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();

      if(prime(a)==0){
        
        a=rev(a);
        
        if(prime(a)==0){
          
           System.out.println("TW PRIME NUMBER");
        }
      
        else{
         System.out.println("not TW PRIME NUMBER");
        }
      }
      
      else{
        System.out.println("not TW PRIME NUMBER");
      }
      
      
      sc.close();
      
    }
}