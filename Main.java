import java.util.ArrayList;
import java.util.Random;

public class HelloWorld
{
  public static void main(String[] args)
  {
    // Creer un joueur
    Player player = new Player("Daniel", "German");
    
    // Initialiser les donnees
   	player.setInfo(player);
    
    // Imprimer le nom et empire du joueur
    System.out.println(player);
    
    // Imprimer ces information
    System.out.println(player.getInfo(player));
    
    // Faire une attaque
    String troop = "Milice";
    player.Attack(troop);
  }
}
