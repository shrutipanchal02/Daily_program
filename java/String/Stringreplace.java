class Stringreplace {  
    public static void main(String[] args) {  
        String str = "my name is is shruti";  
        System.out.println(str.replace("shruti","pragati"));  
         System.out.println(str.replaceFirst("is","was"));
           System.out.println(str.replaceAll("is","was"));
              System.out.println(str.replaceAll("is(.)","was"));
    }  
}

