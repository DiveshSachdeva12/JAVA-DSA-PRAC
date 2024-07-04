public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int n) {
        int ans=1;
        for(int no=2;no<=n;no++){
            ans=ans*no;
        }
        return ans;
    }
}
