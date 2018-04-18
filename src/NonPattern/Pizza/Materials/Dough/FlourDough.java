package NonPattern.Pizza.Materials.Dough;

public class FlourDough extends Dough {
	
	public FlourDough() {
		//super();
		this.type = "Flour \t\t Bột mì";
	}

	@Override
	public String getType() {
		return type;
	}
}
