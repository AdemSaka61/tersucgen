import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Satır Sayısını Giriniz :");
        int n = input.nextInt();

        for (int t = 0; t < n; t++) {
            for (int k=0; k<t; k++){
                System.out.print(" ");
            }
            for (int m=(2*n)-1; m>=(2*t)+1; m--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    // for (int h = (2 * n) - 1; h <=(n-t); h--) {
    //                System.out.print("*");
    //                System.out.println();
    //            }

}
