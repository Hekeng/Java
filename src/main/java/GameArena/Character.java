package src.main.java.GameArena;

public class Character {

	// 1. Поля: Делаем их приватными!
	private String name;
	private int health;
	private boolean isAlive = true;
	
	// Конструктор (оставляем как есть)
	public Character(String name, int health) {
		this.name = name;
		this.health = health;
	}

	// 2. Геттер для имени (ЧТЕНИЕ)
	// Возвращает тип поля (String)
	public String getName() {
		return this.name;
	}

	public int getHealth(){
		return this.health;
	}

	public boolean getIsAlive(){
		return this.isAlive;
	}

	// 3. Сеттер для здоровья (ЗАПИСЬ)
	// Возвращаемый тип: void, так как метод ничего не возвращает, только меняет поле
	public void setHealth(int health) {
		// Мы используем 'this', чтобы различать поле класса (this.health)
		// и аргумент метода (health).
		this.health = health;
	}

	public void setIsAlive(boolean isAlive){
		this.isAlive = isAlive;
	}

	public void damage(int amount) {

		this.health = this.health - amount; // или this.health -= amount;

		// 2. Проверяем, умер ли персонаж
		if (this.health <= 0) {
			this.health = 0;         // Гарантируем, что здоровье не станет отрицательным
			this.isAlive = false;    // Меняем состояние напрямую
		}
		// Логика работы с полями объекта (например, this.health)
	}
}



