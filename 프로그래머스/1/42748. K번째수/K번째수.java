import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int c = 0; c < commands.length; c++) {
            int i = commands[c][0];
            int j = commands[c][1];
            int k = commands[c][2];


            int[] temp = new int[j - i + 1];
            int idx = 0;

            for (int x = i - 1; x < j; x++) {
                temp[idx++] = array[x];
            }


            Arrays.sort(temp);


            answer[c] = temp[k - 1];
        }

        return answer;
    }
}