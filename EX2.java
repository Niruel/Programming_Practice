/*
 * Created By Nicholas Ruppel
 * Exercise 2
 * */
class Exercise2{
    String sentence = "Students gain their practical skills together through project based learning";
    String[] list;

    public  Exercise2(){
        list=sentence.split(" ");
        System.out.println("The number of words is "+ list.length);
        System.out.println("The number of characters including spaces is "+sentence.length());
    }

    public static void main(String[] args) {
            new Exercise2();
    }
}