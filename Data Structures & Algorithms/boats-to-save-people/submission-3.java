class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int l = 0;
        int r = n-1;
        int boat = 0;
        while(l <= r){
            boat++;
            if(people[l] + people[r] <= limit){
                l++;
            }
            r--;
        }
        return boat;
    }
}