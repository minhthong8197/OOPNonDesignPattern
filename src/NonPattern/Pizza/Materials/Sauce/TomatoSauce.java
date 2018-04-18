package NonPattern.Pizza.Materials.Sauce;

public class TomatoSauce extends Sauce {

	public TomatoSauce() {
		//super();
		this.type = "Tomato sauce \t Sốt cà chua";
	}

	@Override
	public String getType() {
		return type;
	}

}
