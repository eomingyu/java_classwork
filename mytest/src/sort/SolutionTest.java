package sort;

public class SolutionTest {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		int[] numbers = {1,2,3,4,6,7,8,0};
		int result = sol.solution(numbers);
		System.out.println("result = "+result);
	}

}


class Solution {
    public int solution(int[] numbers) {
        int sum=0;
        for(int i=0;i<numbers.length;i++)
            sum+=numbers[i];       
        int answer = 45-sum;
        return answer;
    }
}