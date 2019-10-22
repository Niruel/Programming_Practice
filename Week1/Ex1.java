/*
* Created By Nicholas Ruppel
* Exercise 1
* */

class Exercise1{
    double[] data = {12.03, 7.34, 23.42, 94.85, 7.83, 3.19, 43.23};
    public  Exercise1(){
        double total=0.0;
        double max =0.0;

        for (double i:data){
            total+=i;

            if (max<=i){
                max=i;

            }

        }

        System.out.println("The Total is "+ total);
        System.out.println("The Average is "+ total/data.length);
        System.out.println("The Max is "+ max);
    }

    public static void main(String[] args) {
        new Exercise1();
    }
}