class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];

        for(int s: students){
            count[s]++;
        }

        for(int sa:sandwiches){
            if(count[sa] > 0){
                count[sa]--;
            }else{
                break;
            }
        }
        return count[0] + count[1];
    }
}