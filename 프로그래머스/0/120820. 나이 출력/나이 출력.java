class Solution {
    public int solution(int age) {
        int answer = 0;
        if(age > 120 || age < 0)
        {
            System.out.println("잘못된 입력입니다");
        }
        answer = 2022 - age + 1;
        return answer;
    }
}