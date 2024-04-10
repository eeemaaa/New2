public class Array {
    public static void main(String[] args) {
        int [] nums1 = new int[900];

    for (int i = 0; i<900;i++)
    {
        nums1[i] = (i+100);
    }
    int[] nums2 = new int[nums1.length];

    for (int j= 0,i =nums1.length-1;j<nums1.length;j++,i--)
    {
        nums2[i] = nums1[j];
    }

    for (int numArray: nums2)
    {
        System.out.println(numArray);
    }

    }
}
