public class CountChar {
    public static void main(String[] args) {
        String st = "Virat Kohli is a best player in this current era.He is a Greatest of All Time.";
        int count = 0;
        for (int i=0; i<st.length(); i++)
        {
            if (st.charAt(i)!=' ') {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
