package NonPattern.Pizza.Materials.Dough;

public class RiceDough extends Dough {

	public RiceDough() {
		// super();
		this.type = "Rice flour \t\t Bột gạo";
	}

	@Override
	public String getType() {
		return type;
	}
}
