class Solution {
    public String[] findRelativeRanks(int[] score) {
        Integer[] sortedScore = Arrays.stream(score).boxed().sorted(Collections.reverseOrder()).toArray(Integer[]::new);
        String[] medals = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        Map<Integer, String> rankMapping = new HashMap<>();
        for (int i = 0; i < sortedScore.length; i++) {
            if (i < 3) {
                rankMapping.put(sortedScore[i], medals[i]);
            } else {
                rankMapping.put(sortedScore[i], String.valueOf(i + 1));
            }
        }
        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            result[i] = rankMapping.get(score[i]);
        }
        return result;
    }
}