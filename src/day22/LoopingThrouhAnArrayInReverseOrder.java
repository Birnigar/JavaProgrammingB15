package day22;

public class LoopingThrouhAnArrayInReverseOrder {
    public static void main(String[] args) {

        // creating an array object with empty slot
        int[] scores = new int[4];
        // assigning value to each index
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

      int elementCount=scores.length;
      int lastItemIndex=elementCount-1;
      //we are printing in reverse order so
        //we satrt with highest index till lowest index 3---->0

        for (int x=lastItemIndex;x>=0;x--){
            System.out.println("index location "+x);
            System.out.println(scores[x]);

        }






    }
}
