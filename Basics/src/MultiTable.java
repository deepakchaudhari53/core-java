import java.util.Scanner;

class Checkprimeoddeven
{
	public boolean checkPrimeNumber(int number){
        
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
  public static void main(String args[])
  {
    
    Checkprimeoddeven c=new Checkprimeoddeven();

    System.out.println("Enter an Integer number:");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();

    boolean check = c.checkPrimeNumber(num);
    System.out.println(check);
    
    if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
    }
}