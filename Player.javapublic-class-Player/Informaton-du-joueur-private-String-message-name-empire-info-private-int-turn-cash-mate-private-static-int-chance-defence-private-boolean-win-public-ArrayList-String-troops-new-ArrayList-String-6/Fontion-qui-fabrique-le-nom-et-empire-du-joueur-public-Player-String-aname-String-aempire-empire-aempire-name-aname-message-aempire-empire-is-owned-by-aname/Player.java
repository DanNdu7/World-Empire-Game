public class Player
{
  // Informaton du joueur
  private String message, name, empire, info;
  private int turn, cash, mate;
  private static int chance, defence;
  private boolean win;
  public ArrayList<String> troops = new ArrayList<String>(6);
  
  // Fontion qui fabrique le nom et empire du joueur
  public Player(String aname, String aempire)
  {
    empire = aempire;
    name = aname;
    message = aempire + " empire is owned by " + aname;
  }
  
  // Fontion qui imprime le nom et empire du joueur
  public String toString()
  {
    return message;
  }
  
  public String getInfo(Player player){
    info = player.name + "'s turn is the " + turn + "th. He has " + cash + "$ and " + mate + " materials.";
    return info;
  }
  
  public void setInfo(Player player){
    switch(player.empire){
      case "English":	player.cash = 150;
      					player.mate = 150;
      					player.turn = 2;
      					break;
      case "Spanish":	player.cash = 66;
      					player.mate = 66;
      					player.turn = 5;
      					break;
      case "Scandinavia":	player.cash = 55;
      					player.mate = 55;
      					player.turn = 6;
      					break;
      case "French":	player.cash = 125;
      					player.mate = 125;
      					player.turn = 3;
      					break;
      case "German":	player.cash = 130;
      					player.mate = 130;
      					player.turn = 1;
      					break;
      case "Italian":	player.cash = 115;
      					player.mate = 115;
      					player.turn = 4;
      					break;
    }
  }
  
  public void Attack(String troopType){
    int die1, die2, total, chance;
   	Random diceRoller = new Random();
    
    die1 = diceRoller.nextInt(6) + 1;
    die2 = diceRoller.nextInt(6) + 1;
    
    System.out.println("On a roule " + die1 + " et " + die2);
    
    total = die1 + die2;
    chance = (Integer) null;
    
    switch(troopType){
      case "Milice": chance = 2;
  					 break;
      
      case "Infantrie": chance = 3;
  					 break;
      
      case "Artilerie": chance = 4;
  					 break;
      
      case "Mortier": chance = 6;
  					 break;
      
      case "Tank": chance = 6;
  					 break;
      
      case "Avion": chance = 5;
  					 break;
    }  
    
    if(total <= chance){
      System.out.println("Victoire general!");
      win = true;
    }  
    
    else{
      System.out.println("Defaite general!");
      win = false;
    }
  }  
}
