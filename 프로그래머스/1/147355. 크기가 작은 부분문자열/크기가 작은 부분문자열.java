class Solution {
    public int solution(String t, String p) {
            int answer = 0;
            int p_length = p.length();
            long p_parase = Long.parseLong(p);

            for (int i = 0; i <= t.length() - p_length; i++) {
                String t_length = t.substring(i, i + p_length);
                long t_num = Long.parseLong(t_length);

                if (t_num <= p_parase) {
                    answer++;
                }
            }

            return answer;
        }
}