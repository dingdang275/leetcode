import java.lang.Math;

public class Solution {
    public int maximalSquare(char[][] matrix) {
    	if(matrix.length == 0) return 0;
    	if(matrix[0].length == 0) return 0;
    	int[][] result = new int[matrix.length][matrix[0].length];
    	int max = 0;

    	for(int i = 0; i < result.length; i++){
    		for(int j = 0; j < result[0].length; j++){
    			if(matrix[i][j] == '1'){
    				if(i == 0 || j == 0) result[i][j] = 1;
    				else{
    					result[i][j] = 1 + Math.min(result[i - 1][j - 1], Math.min(result[i - 1][j], result[i][j - 1]));
    				}
    			}else{
    				result[i][j] = 0;
    			}
    			max = Math.max(max, result[i][j]);
    		}
    	}

    	return max * max;
    }
}