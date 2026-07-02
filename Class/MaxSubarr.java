// 2 July, 2026
public MaxSubarr{
    public static void main(String[] args){

        // without kadane's algo
//        int arr[] = {1, 2, 3, 4, 5};
//        int n = arr.length;
//        int maxSubarr = Integer.MIN_VALUE;
//        for(int i=0; i<n; i++){
//            for(int j=i; j<n; j++){
//                int sum =0;
//                for(int k=i; k<=j; k++){
//                    sum+= arr[k];
//                }
//                maxSum = Math.max(maxSum, sum);
//            }
//        }
//        return maxSum;

        // with kadane's algo
        int maxSum = arr[0];
        int arrSum = arr[0];
        for(int i=1; i<arr.length; i++){
            currSum = Math.max(arr[i], currSum+arr[i]);
            mathSum = Math.max(currSum, mathSum);
        }
        return maxSum;

    }
}