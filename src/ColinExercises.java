import java.util.Arrays;

public class ColinExercises {

    public static void main(String[] args) {
        System.out.println("oddOneOut(new String[]{\"the\", \"them\", \"theme\"}) = " + oddOneOut(new String[]{"the", "them", "theme"}));
        System.out.println("kaprekar(1112) = " + kaprekar(9780));
        System.out.println(convertToRoman(4000));
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

    public static int kaprekar(int num) {
        int kaprekarCount = 0;
        while(num != 6174){
            num = kaprekarForm(num);
            kaprekarCount++;
        }
        return kaprekarCount;
    }

    public static int kaprekarForm(int num){
        String numBroken = Integer.toString(num);
        String[] stringArr = numBroken.split("");
        int [] numArr = new int[4];
        for (int i = 0; i < stringArr.length; i++){
            numArr[i] = Integer.parseInt(stringArr[i]);
        }
        Arrays.sort(numArr);
        String smaller = "" + numArr[0] + numArr[1] + numArr[2] + numArr[3];
        String bigger = "" + numArr[3] + numArr[2] + numArr[1] + numArr[0];
        int biggerInt = Integer.parseInt(bigger);
        int smallerInt = Integer.parseInt(smaller);
        System.out.println(biggerInt - smallerInt);
        return biggerInt - smallerInt;
    }

    public static String convertToRoman(int num) {
        String[] numerals = new String[]{"MC","M","CM","DC","D","CD","C","LX","L","XL","XXX","XX","X","IX","VIII","VII","VI","V","IV","III","II","I"};
        String[] numBroken = Integer.toString(num).split("");
        int[] numArr = new int[4];
        if(numBroken.length == 1){
            numArr[3] = Integer.parseInt(numBroken[0]);
        }else if(numBroken.length == 2){
            numArr[3] = Integer.parseInt(numBroken[1]);
            numArr[2] = Integer.parseInt(numBroken[0]);
        }else if(numBroken.length == 3){
            numArr[3] = Integer.parseInt(numBroken[2]);
            numArr[2] = Integer.parseInt(numBroken[1]);
            numArr[1] = Integer.parseInt(numBroken[0]);
        }else if(numBroken.length == 4){
            numArr[3] = Integer.parseInt(numBroken[3]);
            numArr[2] = Integer.parseInt(numBroken[2]);
            numArr[1] = Integer.parseInt(numBroken[1]);
            numArr[0] = Integer.parseInt(numBroken[0]);
        }
        String[] numFixed = new String[]{Integer.toString(numArr[0]),Integer.toString(numArr[1]),Integer.toString(numArr[2]),Integer.toString(numArr[3])};
        String[] romanConversion = new String[4];
        String numConverted = "";
        switch (numFixed[3]){
            case "0":
                romanConversion[3] = "";
                break;
            case "1":
                romanConversion[3] = numerals[21];
                break;
            case "2":
                romanConversion[3] = numerals[20];
                break;
            case "3":
                romanConversion[3] = numerals[19];
                break;
            case "4":
                romanConversion[3] = numerals[18];
                break;
            case "5":
                romanConversion[3] = numerals[17];
                break;
            case "6":
                romanConversion[3] = numerals[16];
                break;
            case "7":
                romanConversion[3] = numerals[15];
                break;
            case "8":
                romanConversion[3] = numerals[14];
                break;
            case "9":
                romanConversion[3] = numerals[13];
                break;
        }
        switch (numFixed[2]){
            case "0":
                romanConversion[2] = "";
                break;
            case "1":
                romanConversion[2] = numerals[12];
                break;
            case "2":
                romanConversion[2] = numerals[11];
                break;
            case "3":
                romanConversion[2] = numerals[10];
                break;
            case "4" :
                romanConversion[2] = numerals[9];
                break;
            case "5":
                romanConversion[2] = numerals[8];
                break;
            case "6":
                romanConversion[2] = numerals[7];
                break;
            case "7":
                romanConversion[2] = numerals[7] + numerals[12];
                break;
            case "8":
                romanConversion[2] = numerals[7] + numerals[12] + numerals[12];
                break;
            case "9":
                romanConversion[2] = numerals[12] + numerals[6];
                break;
        }
        switch (numFixed[1]){
            case "0":
                romanConversion[1] = "";
                break;
            case "1":
                romanConversion[1] = numerals[6];
                break;
            case "2":
                romanConversion[1] = numerals[6] + numerals[6];
                break;
            case "3":
                romanConversion[1] = numerals[6] + numerals[6] + numerals[6];
                break;
            case "4":
                romanConversion[1] = numerals[5];
                break;
            case "5":
                romanConversion[1] = numerals[4];
                break;
            case "6":
                romanConversion[1] = numerals[3];
                break;
            case "7":
                romanConversion[1] = numerals[3] + numerals[6];
                break;
            case "8":
                romanConversion[1] = numerals[3] + numerals[6] + numerals[6];
                break;
            case "9":
                romanConversion[1] = numerals[2];
                break;
        }
        switch (numFixed[0]){
            case "0" :
                romanConversion[0] = "";
                break;
            case "1" :
                romanConversion[0] = numerals[1];
                break;
            case "2":
                romanConversion[0] = numerals[1] + numerals[1];
                break;
            case "3":
                romanConversion[0] = numerals[1] + numerals[1] + numerals[1];
                break;
        }
        numConverted = romanConversion[0] + romanConversion[1] + romanConversion[2] + romanConversion[3];
        return numConverted;
    }

//    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();
//​
//    static {
//​
//        map.put(1000, "M");
//        map.put(900, "CM");
//        map.put(500, "D");
//        map.put(400, "CD");
//        map.put(100, "C");
//        map.put(90, "XC");
//        map.put(50, "L");
//        map.put(40, "XL");
//        map.put(10, "X");
//        map.put(9, "IX");
//        map.put(5, "V");
//        map.put(4, "IV");
//        map.put(1, "I");
//​
//    }
//​
//        ​
//    public static String toRoman(int number) {
//        //below takes the highest value without going over the number passed in the toRoman//
//        int l = map.floorKey(number);
//        //if the number is equal to the map provided number then grab that number//
//        if (number == l) {
//            return map.get(number);
//        }
//        //else it's going to take the number passed and subtract the map number to get the remainder and add it to the end
//        //to get the the proper roman numeral value
//        return map.get(l) + toRoman(number - l);
//    }
}
