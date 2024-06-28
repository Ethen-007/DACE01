import java.util.List;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(List<Integer> cost) {
       
        int[] costArray = cost.stream().mapToInt(i -> i).toArray();
        
        for (int step = 2; step < costArray.length; step++) {
            costArray[step] += Math.min(costArray[step - 1], costArray[step - 2]);
        }
        
        return Math.min(costArray[costArray.length - 1], costArray[costArray.length - 2]);
    }

    public static void main(String[] args) {
  
        MinCostClimbingStairs solution = new MinCostClimbingStairs();
        List<Integer> cost = List.of(10, 15, 20);
        int result = solution.minCostClimbingStairs(cost);
        System.out.println("Minimum cost to climb stairs: " + result);  
    }
}
