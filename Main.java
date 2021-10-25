class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    String str="madam";
String reverse="";
System.out.println("Original string "+str);
for(int i=str.length()-1;i>=0;i--){
reverse=reverse+str.charAt(i);
}
System.out.println("Reversed string "+reverse);

if(str.equals(reverse)){
  System.out.println( "Palindrome");
}
  else{
    System.out.println("Not palindrome");
  }
}

  
}