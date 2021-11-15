// <Student Name>, AP CSA Unit 1 Challenge, Andrew Jackson High School, <Date>, <Time>, v0.0
import java.util.Scanner; 

public class DamageDealt {
    public static void main(String[] args) { 
        System.out.println("Please enter UserName:"); 
        String userName = new Scanner(System.in).nextLine();
        System.out.println("Hello fellow Hero!" + userName); 

        System.out.println("\nPlease enter your weapon name:"); 
        String weaponName = new Scanner(System.in).nextLine(); 
        System.out.println(weaponName + "Its a great choice");

        System.out.println("\nPlease enter the monster name:"); 
        String monsterName = new Scanner(System.in).nextLine(); 
        System.out.println(monsterName + "is a horrible monster!");

        System.out.println("\nHow many attacks would you like to make");
        var numberAttack = new Scanner(System.in).nextInt(); 
        System.out.println(numberAttack + "ammount of attacks"); 

        System.out.println("\n Your attack power?");
        int damageDealt = new Scanner(System.in).nextInt(); 
        System.out.println(damageDealt + "damage per attack");

        int totalDamage = numberAttack + damageDealt; 
        System.out.println("\nYour total damage was" + totalDamage); 
    
    }
}
    
    

