public class Maltese extends Dog{

    public Maltese(String breed_,String size_,int age_,String color_){
       super(breed_,size_,age_,color_);

    }
    public void ShowData(){
            //System.out.println("Breed is " + breed +"Size is "+ size + "Age is "+ age + "Color is " + color);
            print20("Breed is ",breed);
            print20("Size is ",size);
            print20("Age is ", age+" years old");
            print20("Breed is ",color);

    }
    public void print20(String ss1, String ss2) {

        int num = 20-ss1.length()-ss2.length();

        System.out.print(ss1);
        for(int i =0;i<num;i++){
            System.out.print( " ");

        }
        System.out.println(ss2);


    }
    public static void main(String[] args) {
        Maltese maltese = new Maltese("Maltese","Small",2,"White");
        maltese.ShowData();


    }
}