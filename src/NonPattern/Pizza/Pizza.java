package NonPattern.Pizza;

import NonPattern.Pizza.Materials.Dough.Dough;
import NonPattern.Pizza.Materials.Meat.Meat;
import NonPattern.Pizza.Materials.Sauce.Sauce;
import NonPattern.Pizza.Materials.Veggies.Veggies;

//class có chức năng tạo ra một cái pizza
//version 2
public abstract class Pizza {
	String type;	//loại pizza cụ thể nào
	Dough dough; 	//bột làm bánh
	Meat meat;		//thịt
	Veggies veggies;//rau
	Sauce sauce;	//nước sốt

	abstract void prepare();

	void showInfo() {
		System.out.println("Maked a " + this.type + " with:");
		System.out.println("\t " + dough.getType());	//in ra loại bột
		System.out.println("\t " + meat.getType());		//in ra loại thịt
		System.out.println("\t " + veggies.getType());	//in ra loại rau
		System.out.println("\t " + sauce.getType());	//in ra loại nước sốt
		System.out.println("----------------------------------------------------\n");
	}
}

//version 1
/*public abstract class Pizza {
	Dough dough;
	Meat meat;
	Veggies veggies;
	Sauce sauce;

	abstract Dough createDough();

	abstract Meat createMeat();

	abstract Veggies createVeggies();

	abstract Sauce createSauce();

	void prepare() {
		this.dough = this.createDough();
		this.meat = this.createMeat();
		this.sauce = this.createSauce();
		this.veggies = this.createVeggies();
	}

	void showInfo() {
		System.out.println("\t " + dough.getType());
		System.out.println("\t " + meat.getType());
		System.out.println("\t " + veggies.getType());
		System.out.println("\t " + sauce.getType());
		System.out.println("-----------------------------------\n");
	}
}*/
