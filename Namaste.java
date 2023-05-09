import java.util.*;
public class Namaste{
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int buttom =sc.nextInt();
       
        if(buttom==1){
            System.out.print("Hello\n namaste \nbonjour");
        } else if (buttom==2){
            System.out.print("Namaste");
        }else if(buttom==3){
            System.out.print("Bonjour");
        }else{
            System.out.print("Invalid buttom");
        }
    }
    
}