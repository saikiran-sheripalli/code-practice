package tier1;

public class GuessNumberHigherOrLower {

    static int hiddenNumber;

    static int guess(int pick) {
        if (pick > hiddenNumber) return 1;
        if (pick < hiddenNumber) return -1;
        return 0;
    }

    static int guessNumber(int range) {
        int low = 1;
        int high = range;

        int loop =  0;
        while(low <= high) {
            loop++;
            int mid = low + (high - low)/2;
            if(guess(mid) != 0) {
                if (guess(mid) > 0)  high = mid - 1;
                else low = mid + 1;
            } else {
//                System.out.println("loop : " +loop);
                return mid;
            }
        }
        //suppose the range itself lower than low;
//        System.out.println("loop : " + loop);
        return -1;
    }

    public static void main(String[] args) {

        hiddenNumber = 7;

        System.out.println("hidden number : " +guessNumber( 10));


    }
}
