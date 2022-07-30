/*
WORD SUBSETS

Example 1:

Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["e","o"]
Output: ["facebook","google","leetcode"]
Example 2:

Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["l","e"]
Output: ["apple","google","leetcode"]

*/
class Solution 
{
    public boolean subs(int[] sk,int[] res)
    {
        for(int i=0;i<26;i++)
            if(sk[i]<res[i])
                return false;
        return true;
    }
    public List<String> wordSubsets(String[] words1, String[] words2) 
    {
        List<String> ans = new ArrayList<>();
        int res [] = new int [26];
        
        //finding word2 
        for(String w : words2)
        {
            int temp[] = new int [26];
            for(char ch : w.toCharArray())
            {
                temp[ch - 'a']++;
                res[ch - 'a'] = Math.max(temp[ch - 'a'],res[ch - 'a']); 
            }
        }
        for(String w2 : words1)
        {
            int sk[] = new int[26];
            for(char c : w2.toCharArray())
            {
                sk[c - 'a']++;
            }
            if(subs(sk,res))
            {
                ans.add(w2);
            }
        }
        return ans;
    }
}
