public boolean searchMatrix(int[][] matrix, int target) {
        int s=0;
        int row=matrix.length;
        int col=matrix[0].length;
        int e=row*col-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int ele=matrix[mid/col][mid%col];
            if(ele==target){
                return true;
            }
            else if(ele<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;
        
    }
}