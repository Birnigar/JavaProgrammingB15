package day06;

public class CompoundOperator {
    public static void main(String[] args) {

        int studentOnline=263;

        //studentOnline=studentOnline +5;
        studentOnline+=5;

        System.out.println("5 people joined the class"+ studentOnline);

        //studentOnline=studentOnline-3;
        studentOnline-=3;
        System.out.println("3 people left the clas "+studentOnline);

       // studentOnline=studentOnline*2;
       // studentOnline=studentOnline+studentOnline;
        studentOnline*=2;
        System.out.println("the student count double "+studentOnline);

        //studentOnline=studentOnline/3;
        studentOnline/=3;

        System.out.println("the student dropped to 1/3:"+ studentOnline);





    }
}
