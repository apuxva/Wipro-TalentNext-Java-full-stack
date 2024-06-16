public class stringBuffer{
    public static void main(String[] args) throws Exception {
        String str1 = "Hello";
        try {
            str1 += ", This program is a example of StringBuffer class and it's functions.";
            
            //create a obj of stringbuffer class
            StringBuffer strbuff1 = new StringBuffer();
            System.out.println(strbuff1.length() + "\n");
            strbuff1.append(str1);
            System.out.println(strbuff1);
            strbuff1.delete(0,str1.length());
            System.out.println(strbuff1);

            //append()
            strbuff1.append("Hello");
            strbuff1.append("World");
            System.out.println(strbuff1);

            //insert()
            strbuff1.insert(5, "_Java ");
            System.out.println(strbuff1);

            //reverse()
            strbuff1.reverse();
            System.out.print ("Reversed string : ");
            System.out.println (strbuff1);
            strbuff1.reverse ();
            System.out.println (strbuff1);

            //setCharAt()
            strbuff1.setCharAt(5, ' ');
            System.out.println(strbuff1);

            //charAt()
            System.out.println(strbuff1.charAt(6));

            //substring()
            System.out.println(strbuff1.substring(3,7));

            System.out.println(strbuff1.deleteCharAt(3));

            System.out.println(strbuff1.capacity());

            strbuff1.delete(6,strbuff1.length());
            System.out.println(strbuff1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}