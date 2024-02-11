//! Tc == O(n*m*4^k)

class Solution {
    public boolean exist(char[][] board, String word) {

        // here we will iterate the board one after one to find the starting element of the word
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j] == word.charAt(0)){
                    // Once we find the starting element of the word we will call search function which will call 
                    // succedding elements of the String word 
                    // the function search will return true if it will call it self word.length times 
                    // which means it has reached the last element of the word
                    if(search(i,j,board.length,board[0].length,board,word,0)){
                        return true;
                    }
                }
            }
        }
        // if the function reaches the end of the matrix without finding the required string it will give false as the ans
        return false;
    }

    // fuction search will search each elemment neighbour of the element and check if it has a element which we want
    // if it gets the element we want it will return true
    // if if dont get the desired element it will return false 

    public boolean search(int i,int j, int n,int m,char[][]board,String word,int k){
        if(k == word.length()){
            return true;
        }
        if(i<0 || j <0 || i>=n || j>=m || board[i][j]!=word.charAt(k)){
            return false;
        }

        // here if the string we want to find is ABA then 
        // it would have given output as true but actually it dont have the string 
        // so we have givenn # mark to the charcters that we have used in the string means the last visited element
        char ch = board[i][j];
        board[i][j] = '#';
        boolean option1 = search(i+1,j,n,m,board,word,k+1);
        boolean option2 = search(i-1,j,n,m,board,word,k+1);
        boolean option3 = search(i,j+1,n,m,board,word,k+1);
        boolean option4 = search(i,j-1,n,m,board,word,k+1);
        board[i][j] = ch;
        return option1 || option2 || option3 || option4;
    }
}
