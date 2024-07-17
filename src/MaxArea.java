import java.util.*;
public class MaxArea{
  public int maxArea(List<Integer> height){
    int beg =0 ;
    int end = height.size()-1;
    int maxArea = 0;
    while(beg < end){
      maxArea = Math.max(maxArea , Math.min(height.get(beg),height.get(end))*(end-beg));
      if(height.get(beg) > height.get(end){
        end = end-1;
      }else{
        beg++;
      }
    }
    return maxArea;
  }
public static void main(String[] args){
  MaxArea solution = new MaxArea();
  List<Integer> height = Arrays.asList(1,8,6,2,5,4,8,3,7);
  int result = solution.maxArea(height);
  System.out.println("The Maximum Area is " + result);
}
}
