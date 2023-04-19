class Solution {
    public boolean isValid(String s) {
     if(s.length()%2!=0)
         return false;
        String open = "({[";
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(open.contains(s.charAt(i)+""))
               {
                   st.push(s.charAt(i));
               }
            else if(s.charAt(i)==')'&& !st.isEmpty() && st.peek()=='(')
                st.pop();
            else if(s.charAt(i)=='}'&& !st.isEmpty() && st.peek()=='{')
                st.pop();
             else if(s.charAt(i)==']'&& !st.isEmpty() && st.peek()=='[')
                st.pop();   
            else
                return false;
        }
        return st.isEmpty();
    }
}
