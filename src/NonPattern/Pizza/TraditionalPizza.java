package NonPattern.Pizza;

import NonPattern.Pizza.Materials.Dough.Dough;
import NonPattern.Pizza.Materials.Dough.FlourDough;
import NonPattern.Pizza.Materials.Meat.BeefMeat;
import NonPattern.Pizza.Materials.Meat.Meat;
import NonPattern.Pizza.Materials.Sauce.Sauce;
import NonPattern.Pizza.Materials.Sauce.TomatoSauce;
import NonPattern.Pizza.Materials.Veggies.SaladVeggies;
import NonPattern.Pizza.Materials.Veggies.Veggies;

//version 2
public class TraditionalPizza extends Pizza {

	@Override
	void prepare() {
		this.dough = new FlourDough(); 		// chuẩn bị bột cho pizza là bột mì
		this.meat = new BeefMeat(); 		// chuẩn bị thịt cho pizza là thịt bò
		this.sauce = new TomatoSauce(); 	// chuẩn bị nước sốt là sốt cà chua
		this.veggies = new SaladVeggies();	// chuẩn bị rau là xà lách
	}

	public TraditionalPizza() {
		this.type = "Traditional Pizza";
		prepare();
	}
}

// version 1
/*
 * public class TraditionalPizza extends Pizza {
 * 
 * String type = "Traditional Pizza";
 * 
 * @Override void showInfo() { System.out.println("Maked a " + this.type +
 * " with:"); super.showInfo(); }
 * 
 * public TraditionalPizza() { prepare(); }
 * 
 * @Override Dough createDough() { return new FlourDough(); }
 * 
 * @Override Meat createMeat() { return new BeefMeat(); }
 * 
 * @Override Veggies createVeggies() { return new SaladVeggies(); }
 * 
 * @Override Sauce createSauce() { return new TomatoSauce(); } }
 */
