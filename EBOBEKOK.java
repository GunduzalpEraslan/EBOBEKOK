import java.util.Scanner;

public class EBOBEKOK {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1,n2;
        boolean a =false;
        do {
            System.out.println("n1 sayısını giriniz : ");
            n1 = input.nextInt();
            System.out.println("n2 sayısını giriniz : ");
            n2 = input.nextInt();

            if (n1<= 0 || n2<=0) {
                System.out.println("Pozitif sayıları giriniz : ");
            } else {
                a=true;
            }
        } while (!a);
        if (n2<n1) {
            int tempN2=n2;
            n2=n1;
            n1=tempN2;
        }
        int i =n1;
        while (i>=1) {
            if ((n1%i==0)&&(n2%i==0)) {
                System.out.println("EBOB : "+i);break;
            }else {
                i--;
            }
        }
        int j= n2;
        while (j<=(n1*n2)){
            if ((j % n1==0) && (j % n2 == 0)) {
                System.out.println("EKOK : "+j);break;
            }else {
                j++;
            }
        }
    }
}
