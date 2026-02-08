public class Demo{
    public static void main(String[]args){
       EvenOddNumber obj = new EvenOddNumber();
          int number = 7;  // you can change this value
	
        if (obj.findEvenOrOdd(number)) {
            System.out.println(number + " is an Even number");
        } else {
            System.out.println(number + " is an Odd number");
        }
    }
}

public class EvenOddNumber{
 boolean findEvenOrOdd(int i){
        if (i % 2 == 0) {
            return true;   // even number
        } else {
            return false;  // odd number
        }
    }
}
