package pl.edu.uwm.po.cw04;

public class Zad1 {
//*****************************  A
    public static int countChar(String str, char c){
        int count = (int) str.chars().filter(ch -> ch==c).count();
        return count;
    }
//*****************************  B
    public static int countSubStr(String str, String subStr){
        int strl=str.length();
        int subStrl=subStr.length();
        int index=0;
        int count=0;
        String temp;
        while(strl-index>=subStrl){
            temp=str.substring(index,index+(subStrl));
            if(temp.equals(subStr)) count++;
            index++;
        }
        return count;
    }
//****************************  C
    public static String middle(String str){
        int len = str.length();
        if(len % 2 != 0) return String.valueOf(str.charAt(len/2));
        else {
            len=(int)(len/2);
            return str.substring(len-1,len+1);
        }
    }
//****************************  D
    public static String repeat(String str, int n){
        StringBuilder stri =new StringBuilder();
        for(int i=0; i<n; i++){stri.append(str);}
        return stri.toString();

    }
//****************************  E
    public static int[] where(String str, String subStr){
        int[] whe = new int[Zad1.countSubStr(str,subStr)];
        if(whe.length>0){
            String tmp= str;
            whe[0]=tmp.indexOf(subStr);
            for(int i=1; i<whe.length; i++){
                tmp=str.substring(whe[i-1]+1);
                whe[i]=tmp.indexOf(subStr)+whe[i-1]+1;
            }
        }
        return whe;
    }
//****************************  F
    public static String change(String str){
        StringBuffer cha = new StringBuffer();
        int len=str.length();
        for(int i=0; i<len; i++){
            if(Character.isUpperCase(str.charAt(i))) cha.append(String.valueOf(str.charAt(i)).toLowerCase());
            else cha.append(String.valueOf(str.charAt(i)).toUpperCase());
        }
        return cha.toString();
    }
//****************************  G
    public static String nice(String str){
        StringBuffer ni= new StringBuffer();
        int tmp=0;
        int len=str.length();
        for(int i=(len-1); i>=0; i--){
            ni.append(str.charAt(i));
            if(tmp%3==0 && i!=0) ni.append("'");
            tmp++;
        }
        String temp = ni.toString();
        ni=new StringBuffer();
        int leng=temp.length();
        for(int i=(leng-1); i>=0; i--){
            ni.append(temp.charAt(i));
        }
        return ni.toString();
    }
//****************************  H
    public static String nice(String str, char zn, int n){
        StringBuffer ni= new StringBuffer();
        int tmp=0;
        int len=str.length();
        for(int i=(len-1); i>=0; i--){
            ni.append(str.charAt(i));
            if(tmp%n == 0) ni.append(zn);
            tmp++;
        }
        String temp = ni.toString();
        ni=new StringBuffer();
        int leng=temp.length();
        for(int i=(leng-1); i>=0; i--){
            ni.append(temp.charAt(i));
        }
        return ni.toString();
    }

}
