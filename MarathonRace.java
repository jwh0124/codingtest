import java.util.HashMap;
import java.util.Map;

public class MarathonRace {
    public static void main(String[] args) {
        String[] participant = { "leo", "kiki", "eden" };
        String[] completion = { "eden", "kiki" };

        String result = solution(participant, completion);

        System.out.println(result.equals("leo"));

    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        // Arrays.sort(participant);
        // Arrays.sort(completion);

        // for (var i = 0; i < completion.length; i++) {
        // if (!(participant[i].equals(completion[i]))) {
        // return participant[i];
        // }
        // }
        // answer = participant[participant.length - 1];
        // return answer;

        var hm = new HashMap<String, Integer>();
        for (String player : participant)
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion)
            hm.put(player, hm.get(player) - 1);

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (hm.get(entry.getKey()) != 0) {
                answer = entry.getKey();
            }
        }
        return answer;
    }
}
