import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    public boolean canFinish(int numCourses,int[][] prerequisites){
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i < numCourses; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] pair:prerequisites){
            graph.get(pair[1]).add(pair[0]);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] recStack = new boolean[numCourses];
        //checking for cycles
        for(int i =0 ;i<numCourses;i++){
            if(isCyclic(i,graph,visited,recStack)){
                return false;
            }
        }
        return true;
    }
    private boolean isCyclic(int node, List<List<Integer>> graph,boolean[] visited,boolean[] recStack){
        if(recStack[node]){
            return true;//cycle detected
        }
        if(visited[node]){
            return false;
        }
        visited[node] = true;
        recStack[node] = true;
        for(int neighbor:graph.get(node)){
            if(isCyclic(neighbor,graph,visited,recStack)){
                return true;
            }
        }
        recStack[node] = false;
        return false;
    }
}
