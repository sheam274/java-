import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        int i , num, flag = 0;
        System.out.println("Enter the number: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        for(i = 2; i < num; i++)
        {
            if (num % i == 0) {
                flag =  0;
                break;
            }
            else{
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println(""+num+" is a prime number");

        }
        else{
            System.out.println(""+num+" is not a prime number");
        }
    }
}
