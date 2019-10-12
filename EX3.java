/*
 * Created By Nicholas Ruppel
 * Exercise 3
 *
 */
class Exercise3{
    String sentence = "Students gain their practical skills together through project based learning";
    String[] list;
    double wordLength;
    int total=0;
    public Exercise3(){

        list=sentence.split(" ");
        System.out.println("The number of words is "+ list.length);
        System.out.println("The number of characters including spaces is "+sentence.length());
        for (String s:list){
            total+=s.length();

        }
        System.out.println("the total word length is "+ total);
        System.out.println("the average word length is "+ (double)total/list.length);

    }

    public static void main(String[] args) {
        new Exercise3();
    }
}