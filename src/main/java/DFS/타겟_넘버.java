package DFS;

/**
 * [프로그래머스] [LV.02] [https://school.programmers.co.kr/learn/courses/30/lessons/43165]
 */
public class 타겟_넘버 {

    public int solution(int[] numbers, int target) {
        int answer = dfs(numbers, target, 0, 0);
        return answer;
    }

    private int dfs(int[] numbers, int target, int index, int sum) {
        if (index == numbers.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }
        return dfs(numbers, target, index + 1, sum + numbers[index])
            + dfs(numbers, target, index + 1, sum - numbers[index]);
    }
}
