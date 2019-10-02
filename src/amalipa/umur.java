package amalipa;
import java.util.Scanner;
public class umur {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        int umur = input.nextInt();
        
        if(umur >=46)
        {System.out.println("Anda Perlukan rawatan Kosmetologi di SIRNA");}
        
        else if(umur <=45)
        {System.out.println("Anda Masih Muda dan Cantik");}    
    }
    
}
