package runanimal;
import java.util.Scanner;

public class RunAnimal {


    public static void main(String[] args) {
        System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
        Scanner sc = new Scanner(System.in);
        String pick = sc.nextLine();
        if(pick.equalsIgnoreCase("B")){
            Animal b = new Bird();
            b.eat();
            b.sleep();
            b.makeSound();
        }
        if(pick.equalsIgnoreCase("C")){
            Animal c = new Cat();
            c.eat();
            c.sleep();
            c.makeSound();
        }
        if(pick.equalsIgnoreCase("D")){
            Animal d = new Dog();
            d.eat();
            d.sleep();
            d.makeSound();
        }

    }
    
}
