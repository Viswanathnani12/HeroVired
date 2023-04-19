class Solution {
public:
    void PrintParan(string s,int open,int close,int n,vector<string>&v)
    {
        if(close==n)
        {
            v.push_back(s);
            return;
        }
        if(open==n)
        {
            PrintParan(s+")",open,close+1,n,v);
            return;
        }
        if(open>=close)
        {
            PrintParan(s+"(",open+1,close,n,v);
            if(open>close)
                PrintParan(s+")",open,close+1,n,v);
        }
    }
    vector<string> generateParenthesis(int n) {
        vector<string>v;
        string s="";
        PrintParan(s,0,0,n,v);
        return v;
    }
};
