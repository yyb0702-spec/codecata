class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num1 > 100 || num1 < 0 || num2 > 100 || num2 < 0) {
            System.out.println(" 잘못된 입력값입니다");
        }
        answer = num1 / num2;
        return answer;
    }
}