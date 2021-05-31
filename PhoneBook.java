import java.util.Arrays;

public class PhoneBook {
    public static void main(String[] args) {
        String[] phone_book = { "119", "97674223", "1195524421" };

        System.out.println(solution(phone_book));
    }

    public static boolean solution(String[] phoneBook) {
        // for (int i = 0; i < phoneBook.length - 1; i++) {
        // for (int j = i + 1; j < phoneBook.length; j++) {
        // if (phoneBook[i].startsWith(phoneBook[j]))
        // return false;

        // if (phoneBook[j].startsWith(phoneBook[i]))
        // return false;
        // }
        // }
        // return true;

        Arrays.sort(phoneBook);
        for (int i = 0; i < phoneBook.length - 1; i++) {
            if (phoneBook[i + 1].startsWith(phoneBook[i])) {
                return false;
            }
        }
        return true;
    }
}
