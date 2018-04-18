package NonPattern.Pizza.Materials.Meat;

public class PorkMeat extends Meat {
	public PorkMeat() {
		this.type = "Pork \t\t\t Thịt lợn";
	}

	@Override
	public String getType() {
		return type;
	}
}
