class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        for i in range(0,len(matrix),1):
            for j in range(0,len(matrix[0]),1):
                if (matrix[i][j] == target):
                    return True
        return False