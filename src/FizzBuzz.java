public class FizzBuzz {
    public static String fizzBuzz(int number){
//        if(number % 3 == 0 && number % 5 == 0)
//            return "FizzBuzz";
//
//        if(number % 3 == 0)
//            return "Fizz";
//
//        if(number % 5 == 0)
//            return "Buzz";
//
//        return number + "";
//    }
    String result = "";

        if (number % 3 == 0) {
        result += "Fizz";
    }
        if (number % 5 == 0) {
        result += "Buzz";
    }

    // If result is still empty, return the number itself
        return result.isEmpty() ? String.valueOf(number) : result;
}
