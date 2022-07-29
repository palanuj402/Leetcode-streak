/*
Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
Output: ["mee","aqq"]
Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}. 
"ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation, since a and b map to the same letter.
*/

class Solution 
{
    public List<String> findAndReplacePattern(String[] words, String pattern) 
    {
        //method - 1
//         int n = pattern.length();
//         List<String> ans = new ArrayList<>();
//         int[] dumb = new int[n];
//         int flag =0;
        
//         //store pattern string in dumb array with index
//         for(int i=0;i<n;i++)
//         {
//             dumb[i]=pattern.indexOf(pattern.charAt(i));
//         }
//         for(String word : words)
//         {
//             for(int i=0;i<n;i++)
//             {
//                 //check dumb array with each string in string array
//                 //if not equal put flag as 1
//                 if(dumb[i]!=word.indexOf(word.charAt(i)))
//                 {
//                     flag = 1;
//                     break;
//                 }
//             }
//             //at last if flag is 0 it means same 
//             //add it to answer    
//             if(flag == 0)
//                 ans.add(word);
//             else
//                 flag =0;
//         }
//         return ans;
        
        //method - 2 
        List<String> ans = new ArrayList<>();
        for(String w : words)
        {
            if(check(w,pattern))
                ans.add(w);
        }
        return ans;
    }
    public boolean check(String w,String p)
    {
        for(int i=0;i<p.length();i++)
        {
            if(w.indexOf(w.charAt(i))!=p.indexOf(p.charAt(i)) )
                return false;
        }
        return true;
    }
}
