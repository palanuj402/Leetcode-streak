class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
//         char[] a = s.toCharArray();
//         char[] b = t.toCharArray();
        
//         int n = a.length;
//         int m = b.length;
        
//         if(n!=m)
//             return false;
        
//         Arrays.sort(a);
//         Arrays.sort(b);
        
//         for(int i=0;i<n;i++)
//         {
//             if(a[i]!=b[i])
//                 return false;
//         }
//         return true;
        
        if(s.length()!=t.length())
            return false;
        
        HashMap <Character,Integer> mp = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(mp.containsKey(s.charAt(i)))
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            else
                mp.put(s.charAt(i),1);
        }
        
        for(int i=0;i<t.length();i++)
        {
            if(mp.containsKey(t.charAt(i)))
                mp.put(t.charAt(i),mp.get(t.charAt(i))-1);
        }
        
        Set<Character> k = mp.keySet();
        for(Character ch : k)
            if(mp.get(ch)!=0)
                return false;
        
        return true;
    }
}
