package Placement_Example;

    public class DistinctVowelsCounter {
        public static int countDistinctVowels(String S) {
            boolean[] seenVowels = new boolean[5]; // a, e, i, o, u
            int count = 0;
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                if (c == 'a' && !seenVowels[0]) {
                    seenVowels[0] = true;
                    count++;
                } else if (c == 'e' && !seenVowels[1]) {
                    seenVowels[1] = true;
                    count++;
                } else if (c == 'i' && !seenVowels[2]) {
                    seenVowels[2] = true;
                    count++;
                } else if (c == 'o' && !seenVowels[3]) {
                    seenVowels[3] = true;
                    count++;
                } else if (c == 'u' && !seenVowels[4]) {
                    seenVowels[4] = true;
                    count++;
                }
            }

            return count;
        }

        public static void main(String[] args) {
            String S = "aaaa";
            System.out.println("Number of distinct vowels: " + countDistinctVowels(S));
        }
    }

