import java.util.Scanner;

public class Q60_VOWELS_AND_CONSONANTS {

    void Count_Vowels_And_Consonants(){
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = Sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for(char ch : input.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch) != -1){
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("The number of vowels are: " + vowels);
        System.out.println("The number of constants are: " + consonants);
    }

    public static void main(String[] args) {
        Q60_VOWELS_AND_CONSONANTS obj = new Q60_VOWELS_AND_CONSONANTS();
        obj.Count_Vowels_And_Consonants();
    }
}
