public class JadenCase {
    public static void main(String[] args) {
        System.out.println(solution("A   B  Cde"));
    }

    public static String solution(String s) {
        // TODO:
        // a[][][]b[][]cde -> A[][][]B[][]Cde
        String[] terms = s.toLowerCase().split(" ");
        StringBuilder answer = new StringBuilder();
        for (var term : terms) {
            if (!term.equals(" ")) {
                answer.append(term.substring(0, 1).toUpperCase() + term.substring(1).toLowerCase() + " ");
            }
        }
        return answer.toString().trim();
    }
}
