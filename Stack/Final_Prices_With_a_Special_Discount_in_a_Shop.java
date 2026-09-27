//Final Prices With a Special Discount in a Shop

class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] answer = prices.clone();

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            // Remove prices that cannot be a discount
            while (!stack.isEmpty() && stack.peek() > prices[i]) {
                stack.pop();
            }

            // Top is the first valid discount
            if (!stack.isEmpty()) {
                answer[i] = prices[i] - stack.peek();
            }

            // Current price can be a discount for elements to its left
            stack.push(prices[i]);
        }

        return answer;
    }
}