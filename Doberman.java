/*
 * Doberman class with constructor and inheritence
 * by N. Ruppel on 12 Oct 2019
 */
public class Doberman extends Dog {

    public Doberman() {

	}
	
	public Doberman(String breed_, String size_, int age_, String color_) {
		super.breed = breed_;
		super.size = size_;
		super.age = age_;
		super.color = color_;
	}
       

    public static void main(String[] args) {
        Doberman doberman = new Doberman("Doberman", "Large", 5, "Black");
		doberman.showData();
      
       
    }
}