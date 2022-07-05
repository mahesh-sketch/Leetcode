class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        Stack<int[]> s = new Stack();
        s.add(intervals[0]); // stack hold [1,3] now
        for(int i=1;i<intervals.length;i++){
            int s2= intervals[i][0]; //2 store here
            int e2= intervals[i][1]; //6 store here
            
            int[] poparray = s.pop(); // pop [1,3] from stack store into poparray
            int s1= poparray[0]; //1 store here
            int e1= poparray[1];//3 store here
            
            int maxx = Math.max(e1,e2); // we dont know which one is maximum
            if(e1>=s2){
                int[] merge = new int[]{s1,maxx};
                s.add(merge);
            }
            else{
            s.add(poparray);// if we dont compare then add to stack
            s.add(intervals[i]);// after that interval value to stack for next comparison
            }
        }
        int[][] op = new int[s.size()][2];
        for(int i=op.length-1;i>=0;i--){
            int[] poparray = s.pop();
            op[i][0] = poparray[0];
            op[i][1] = poparray[1];
        }
        return op;
    }
}