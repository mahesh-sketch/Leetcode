class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> h = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =0,j=0;
     while (i<nums1.length && j<nums2.length) {
        if (nums1[i] == nums2[j]) {
            h.add(nums1[i]);
            i++;
            j++;
        } else if (nums1[i] > nums2[j]) {
            j++;
        } else {
            i++;
        }
    }
     int count[] = new int[h.size()];
    for ( i =0; i< h.size(); i++) {
        count[i] = h.get(i);
    }
    return count;
    }
}