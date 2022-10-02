import java.util.Scanner;

public class powers {
    public static void main(String args[]) {
        int n,p;
        System.out.println("Enter a year: ");
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println((Math.pow(2, n)));
        }

    }
}
