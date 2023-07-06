class Solution {
    public int[] moveZeroes(int[] a) {
        int j = -1, i;
        
        // Find the first zero element
        for (i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        
        // If no zero elements found, return the array
        if (j == -1) {
            return a;
        } else {
            // Move non-zero elements to the left
            for (i = j + 1; i < a.length; i++) {
                if (a[i] != 0) {
                    // Swap a[i] and a[j]
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    j++;
                }
            }
        }
        
        return a;
    }
}
