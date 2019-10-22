/*
 * Doberman class with constructor and inheritence
 * by N. Ruppel on 12 Oct 2019
 */
public class Doberman extends Dog {

        public  Doberman(String breed_, String size_, int age_, String color_){
            super(breed_,size_,age_,color_);
            super.showData();
        }
        public void ShowData(){
            System.out.println("Breed is " + breed +"Size is "+ size + "Age is "+ age + "Color is " + color);
        }

    public static void main(String[] args) {
        new Doberman("Doberman","Large",5,"Black");
    }
}