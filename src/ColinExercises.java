public class ColinExercises {

    public static void main(String[] args) {
        System.out.println("oddOneOut(new String[]{\"the\", \"them\", \"theme\"}) = " + oddOneOut(new String[]{"the", "them", "theme"}));
    }



    public static boolean oddOneOut(String[] arr) {
        int difference = 0;
        int numDifferences = 0;
        String shortest = null;
        String longest = null;
        int numOfLongest = 0;
        int numOfShortest = 0;
        int differenceCounter = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if(shortest == null && longest == null){
                shortest = arr[i];
                longest = arr[i];
            }
            if(arr[i].length() != arr[i+1].length()){
                numDifferences ++;
            }
            if(longest.length() < arr[i].length()){
                longest = arr[i];
                differenceCounter ++;
            }
            if(longest.length() < arr[i+1].length()){
                longest = arr[i+1];
                differenceCounter ++;
            }
            if (longest.length() == arr[i+1].length()){
                numOfLongest ++;
            }
            if (shortest.length() == arr[i+1].length()){
                numOfShortest ++;
            }
            if (shortest.length() > arr[i].length()){
                shortest = arr[i];
                differenceCounter ++;
            }
            if (shortest.length() > arr[i+1].length()){
                shortest = arr[i+1];
                differenceCounter ++;
            }
            if (longest.length() == arr[i].length()) {
                numOfLongest++;
            }
            if (shortest.length() == arr[i].length()) {
                numOfShortest++;
            }
            if(difference < Math.abs(arr[i].length() - arr[i+1].length()))
            {
                difference = Math.abs(arr[i].length() - arr[i+1].length());
            }
        }
        int abs = Math.abs((shortest.length() - longest.length()));
        if (numDifferences == 1) {
            return true;
        } else if (numDifferences > 1 && abs == 1) {
            return true;
        } else if (differenceCounter == 1) {
            return (Math.abs(numOfLongest - numOfShortest) == arr.length - 1);
        }
        return false;
    }

}
