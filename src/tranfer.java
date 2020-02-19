import java.util.Scanner;

public class tranfer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, digit1, digit2, digit3, tmp;
        String[] str1 = {"","", "twenty", "thirty", "Forty", "Fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] str2 = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        System.out.println("Enter any number between 1 to 999:");
        num = input.nextInt();

        if ((num < 1) || (num >= 1000)){
            System.out.println("Wrong input");
        }else if ((num >= 1) && (num <= 19)){
            System.out.println(str2[num]);
        }else if (num >= 1 && num <= 99){
            digit1 = num/10;
            digit2 = num%10;
            System.out.println(str1[digit1] + " " + str2[digit2]);
        }else if ((num >= 1) && (num <= 999)){
            digit1 = num / 100;
            tmp = num % 100;
            digit2 = tmp / 10;
            digit3 = tmp % 10;
            System.out.println(str2[digit1] + " hundred " + str1[digit2] + " " + str2[digit3]);
        }
    }
}
