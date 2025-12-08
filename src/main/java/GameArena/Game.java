package src.main.java.GameArena;

public class Game {
	public static void main(String[] args) {

		Character player = new Character("Aleksei", 100);

		Character hero = new Warrior("Leonid",150,20);

		hero.damage(30);

		System.out.println("Character " + hero.getName() + " hath "+ hero.getHealth() +"health");


	// 	System.out.println("Character " + player.getName() + " hath "+ player.getHealth() +"health");
	// 	player.damage(50);

	// 	System.out.println("Character " + player.getName() + " hath "+ player.getHealth() +"health");
	// 	player.damage(60);

	// 	if (player.getIsAlive() == false) {
	// 	System.out.println("Character " + player.getName() + " hath "+ player.getHealth() +"health. He is dead!");
	// } else{
	// 	System.out.println("Character " + player.getName() + " hath "+ player.getHealth() +"health. He is live!");}
	
	}
}

//