class Solution {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    ArrayList<Boolean> resultList = new ArrayList<>();
    int most = 0;
    int contender;

    //finding the highest value
    for (int contender : candies) {
      if (contender > most){
        most = contender;
      }
    }

    //check against highest value
    for (int contender2 : candies) {
      int contender3 = contender2 + extraCandies;
      if(contender3 >= most){
        resultList.add(true);
      }
      else{
        resultList.add(false);
      }
    }
    return resultList;
  }
}
