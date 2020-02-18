import java.util.ArrayList;
public class Katas {

    public static void main(String[] args) {
        String name = "Themba";
        int number = 5;
        String[] words = new String[]{"the", "quick", "brown", "fox", "ate", "my", "chickens"};
        String[] testa = new String[]{"the", "quick", "brown", "fox", "ate", "my", "chick"};
        int[] numbers = new int[]{11, 87, 12, 66, 95, 110, 77,8};
        int[] integers = new int[]{10, 5, 87, 44, 15, 11, 74,45};


        Hello(name);
        System.out.println();
        Even_or_Odd(number);
        System.out.println();
        Triangle(5);
        System.out.println();

        Square(5);
        System.out.println();
        Isosceles(5);
        System.out.println();

        LongestString(words);
        System.out.println();
        CombinedArrays(numbers,integers);
        System.out.println();
        Box(testa);


    }

    public static void Hello(String name) {
        System.out.println(name);
    }

    public static void Even_or_Odd(int number) {
        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void Triangle(int number) {
        for (int num = 1; num <= number; num++) {

            for (int num1 = 0; num1 < num; num1++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }

    public static void Square(int number) {
        for (int num = 1; num <= number; ++num) {
            for (int num1 = 1; num1 < number; num1++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }

    public static void Isosceles(int number) {
        for (int num = 1; num < number; num++) {
            for (int num1 = num; num1 < number; num1++) {
                System.out.print(" ");
            }
            for (int num2 = 1; num2 < (num * 2); num2++) {
                System.out.print("#");
            }
            System.out.println("\n");
        }

    }

    public static void LongestString(String[] words) {
        String name = words[0], temp = "";

        for (int num = 1; num < words.length; num++) {
            if (words[num].length() > name.length()) {
                temp = words[num];
            }
        }
        System.out.println(temp);

    }

    public static void CombinedArrays(int[] words, int[] names) {
        int temp = words.length + names.length;
        ArrayList<Integer> mixture = new ArrayList<>(temp);

        mixture.add(words[0]);
       for(int x = 0, y = 0; x < temp; x++,y ++) {
           if(x < words.length)
           {
               if(!mixture.contains(words[x]))
               mixture.add(words[x]);
               mixture.add(names[y]);
           }
       }

        System.out.println(mixture);

    }

    public static void Box(String[] words) {
        System.out.println("**********");
        for (int num = 1; num < words.length; num++) {
            System.out.println("* " + words[num] + "\t *");
        }
        System.out.println("**********");
    }
}
