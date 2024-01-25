


//! Tc == O(N^2)
//! SC == O(1)

import java.util.HashMap;

class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        for(int i = 0;i<m;i++){
            boolean found = false;
            for(int j = 0;j<n;j++){
                if(a2[i] == a1[j]){
                    a1[j] = -1;
                    found = true;
                    break;
                }
            }
            if(found == false){
                return "No";
            }
        }
        return "Yes";   
    }
}

//! Tc == O(N)
//! SC == O(N)


class Compute1 {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long,Integer> map = new HashMap<>();
        HashMap<Long,Integer> map2 = new HashMap<>();
        
        for(int i = 0;i<a1.length;i++){
            if(map.containsKey(a1[i])){
                map.replace(a1[i],map.get(a1[i])+1);
            }
            else{
                map.put(a1[i],1);
            }
        }
        for(int i = 0;i<a2.length;i++){
            if(map2.containsKey(a2[i])){
                map2.replace(a2[i],map2.get(a2[i])+1);
            }
            else{
                map2.put(a2[i],1);
            }
        }
        for(int i = 0;i<a2.length;i++){
            if(map.containsKey(a2[i])){
                int x = map.get(a2[i]);
                int y = map2.get(a2[i]);
                if(x<y){
                    return "No";
                }
            }
            else{
                return "No";
            }
        }
        return "Yes";
    }
}