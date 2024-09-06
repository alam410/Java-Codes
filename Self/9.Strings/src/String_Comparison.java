public class String_Comparison {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        //this is not the correct way.it check in the object level
//        if(s1==s2){
//            System.out.println("Strings are equal");
//        }
//        else {
//            System.out.println("Strings are not equal");
//        }
//        if(s1==s3){
//            System.out.println("Strings are equal");
//        }
//        else {
//            System.out.println("Strings are not equal");
//        }

        //correct way
        //comparison function
        if(s1.equals(s3))  //returns a boolean type
        {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    }
}
