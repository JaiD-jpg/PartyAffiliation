import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String choice= "";
        String menu= "D - Democrate\tR - Republican\tI - Independant";

        System.out.println(menu);
        choice = in.nextLine();

        if(menu.equalsIgnoreCase(choice="D")){
            System.out.println("You get a Democrate Donkey");
        }
        else if(menu.equalsIgnoreCase(choice="R")){
            System.out.println("You get a Republican Elephant");
        }
        else if(menu.equalsIgnoreCase(choice="I")){
            System.out.println("You get a Independant Person");
        }
        else
            System.out.println("You chose Other(I don't know what you get, my professor didn't say)");
    }
}
