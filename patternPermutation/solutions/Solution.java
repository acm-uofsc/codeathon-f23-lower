import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();  // Consume the next line

        for (int i = 0; i < t; i++) {
            String[] parts = scanner.nextLine().split(" ");
            String a = parts[0];
            int n = Integer.parseInt(parts[1]);

            List<String> words = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                words.add(scanner.nextLine());
            }

            if (allPermutationsPresent(a, words)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        scanner.close();
    }

    private static boolean allPermutationsPresent(String a, List<String> words) {
        List<String> permutations = generatePermutations(a);
        for (String perm : permutations) {
            boolean found = false;
            for (String word : words) {
                if (word.contains(perm)) {
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }
        return true;
    }

    private static List<String> generatePermutations(String str) {
        List<String> resultList = new ArrayList<>();
        if (str.isEmpty()) {
            resultList.add("");
            return resultList;
        }

        char firstChar = str.charAt(0);
        List<String> recursivePerms = generatePermutations(str.substring(1));
        for (String perm : recursivePerms) {
            for (int i = 0; i <= perm.length(); i++) {
                String newPermutation = perm.substring(0, i) + firstChar + perm.substring(i);
                resultList.add(newPermutation);
            }
        }
        return resultList;
    }
}
