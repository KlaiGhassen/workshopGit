import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ZooMangment {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        Scanner scName  = new Scanner(System.in);
        System.out.println("donner le nombre de cage :");
        int nbrCage= sc.nextInt();
        System.out.println("donner le nom de zoo :");
        String zooName=scName.next();
        System.out.println(zooName +" comporte "+nbrCage+" cages");
    }


}