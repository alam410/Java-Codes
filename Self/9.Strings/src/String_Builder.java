public class String_Builder
{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a' ;ch<='z';ch++){
            sb.append(ch);
        }//Time Complexity = O(26)
        //IF we took String then the time complexity would be O(n^2)
        System.out.println(sb);
    }
}
