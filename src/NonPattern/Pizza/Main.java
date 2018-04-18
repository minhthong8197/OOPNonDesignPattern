package NonPattern.Pizza;

public class Main {

	public static void main(String[] args) {
		Pizza a = new TraditionalPizza();
		a.showInfo();
		Pizza b = new ModernPizza();
		b.showInfo();
	}
}