public class JadenCase {
    public static void main(String[] args) {
        solution("  A   B  cde  hello");
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        for (var i = 0; i < s.length(); i++) {
            String a = s.substring(i, i + 1);
            if (i == 0 || s.substring(i - 1, i).equals(" ")) {
                answer.append(a.toUpperCase());
            } else {
                answer.append(a.toLowerCase());
            }
        }
        return answer.toString();
    }
}
