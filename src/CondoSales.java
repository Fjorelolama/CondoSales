import java.util.Scanner;

public class CondoSales {
    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        int Park = 150000;
        int Golf = 170000;
        int Lake = 210000;


        System.out.println("We have 3 condos here: 1) Park View 2) Golf course View 3) Lake View, Please enter the Condominium that your looking for: ");
        int Condo_chose = userinput.nextInt();

        if (Condo_chose == 1) {
            System.out.println("You choose the Park view condos and the price is " + Park + "$");
        } else if (Condo_chose == 2) {
            System.out.println("You choose the Golf course view condos and the price is " + Golf + "$");
        } else if (Condo_chose == 3) {
            System.out.println("You choose the Lake view condos and the price is " + Lake + "$");
        } else {
            System.out.println("There is no condos at this Number, Sorry!");
        }

    }
}
