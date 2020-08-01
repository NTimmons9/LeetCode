class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> numbers = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String s = "";
            if(i % 3 == 0){
                s += "Fizz";
            }
            if (i % 5 == 0){
                s += "Buzz";
            }
            numbers.add(s.length() > 0 ? s : Integer.toString(i));
        }
        return numbers;
    }
}