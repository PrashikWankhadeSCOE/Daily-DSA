import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> mainlist = new LinkedList<>();
        
        List<Integer> slist = new LinkedList<>();
        
        for(int i = 1;i<=numRows;i++){
            List<Integer> list = new LinkedList<>();
            int x = 0;
            for(int j = 1;j<=i;j++){
                if(j == 1){
                    list.add(1);
                }
                else if(j==i){
                    list.add(1);
                }
                else{
                    if(!slist.isEmpty() && x<slist.size()-1){
                        list.add(slist.get(x)+slist.get(x+1));
                        x++;
                    }
                }
            }
            slist = list;
            mainlist.add(list);
        }
        return mainlist;
    }
}