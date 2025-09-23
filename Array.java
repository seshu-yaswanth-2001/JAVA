// Array - collection of similar type elements

class Array {
    public static void main(String[] args) {
        // 1D array
        int[] nums = {1, 2, 3, 4, 5};
        for(int i = 0; i < nums.length; i++) {
            // System.out.println(nums[i]);
        }

        // other way
        int [] prices;
        prices = new int[5];

        for(int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

        // 2D Array
        int [][] matrix = {
            {1, 2, 3},
            {4, 6},
            {7, 8, 9},
        };

        System.out.println("2d Array");

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
        }


        // 2D Array
        int [][][] matrix3d = {
            {{1, 2, 3}, {4, 5}}, {{6, 7, 8}, {9, 10}}
        };

        System.out.println("3d Matrix");

        for(int i = 0; i < matrix3d.length; i++) {
            for(int j = 0; j < matrix3d[i].length;j++) {
                for(int k = 0; k < matrix3d[i][j].length; k++) {
                    System.out.println(matrix3d[i][j][k] + " ");
                }
            }
        }
    }
}