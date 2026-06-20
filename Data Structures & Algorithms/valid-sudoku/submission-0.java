class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> seen = new HashSet<>();

        for(int i = 0; i<9; i++)
        {
            for(int j = 0; j<9; j++)
            {
                
                char curval = board[i][j];
                if(curval != '.')
                {
                        if(!seen.add("row "+ i + " value" + curval)
                || !seen.add("col" + j + "value" + curval) 
                || !seen.add("block" + i/3 + "_" + j/3 + curval))
                {
                    return false;
                }


                }
            


            }          
        }

        return true;


    }
}
