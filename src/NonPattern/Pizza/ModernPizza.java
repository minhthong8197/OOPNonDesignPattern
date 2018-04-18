package NonPattern.Pizza;

import NonPattern.Pizza.Materials.Dough.RiceDough;
import NonPattern.Pizza.Materials.Meat.PorkMeat;
import NonPattern.Pizza.Materials.Sauce.MayonnaiseSauce;
import NonPattern.Pizza.Materials.Veggies.SeaJellyVeggies;

public class ModernPizza extends Pizza {

	@Override
	void prepare() {
		this.dough = new RiceDough(); 			// chuẩn bị bột cho pizza là bột gạo
		this.meat = new PorkMeat(); 			// chuẩn bị thịt cho pizza là thịt lợn
		this.sauce = new MayonnaiseSauce(); 	// chuẩn bị nước sốt là sốt mai-o-ne
		this.veggies = new SeaJellyVeggies();	// chuẩn bị rau là rong biển
	}

	public ModernPizza() {
		this.type = "Modern Pizza";
		prepare();
	}
}
