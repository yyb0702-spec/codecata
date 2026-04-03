class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num1 > 50000 || num1 < -50000 || num2 > 50000 || num2 < -50000) {
            System.out.println(" 잘못된 입력값입니다");
        }
        answer = num1 - num2;
        return answer;
    }
}