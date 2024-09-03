public class Sum2Num{
  public static void main(String[] args){
    int[] array = {10, 20, 30, 40, 50};
    int target = 90;
    int i = 0;
    int j = array.length - 1;
    while(i < j){
      int totalNum = array[i] + array[j];
      if(totalNum == target){
        System.out.println(array[i] +"+"+array[j] + " adds to the target:" + target);
         i++;
      } else if (totalNum < target){
       i++;
      } else{
       j--;
      }
    }    
  }
}
