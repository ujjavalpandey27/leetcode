class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<Integer> temp=new ArrayList<>();
        List<String> ans=new ArrayList<>();
        

        for(var i :target){
            temp.add(i);

    }
        for (int i = 1; i <=n ; i++) {
            ans.add("Push");
            if(temp.get(temp.size()-1)==i){
                break;
            }
            else if(temp.contains(i)){
                continue;
            }
            else{
                ans.add("Pop");
            }

        }
        return ans;
}}
