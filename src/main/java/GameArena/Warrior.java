package src.main.java.GameArena;

public class Warrior extends Character {
	private int armor; // Новое, уникальное поле

	// Конструктор Warrior
	public Warrior(String name, int health, int armor) {
		// 1. Вызов конструктора родителя (Character)
		super(name, health); // Передаем name и health в Character
				
		// 2. Инициализация своего собственного поля
		this.armor = armor;
	}
}
