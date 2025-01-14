public class EscapeSeq  {
    public static void main(String[] args)  {
        System.out.print("hola puto");  // a simple print statement in java
        System.out.print("hello world!"); // you'll notice that both are coming in the same line
        // this is because print function does not include new line by default 
        
        // to add a new line AFTer a print statement we can use println()
        System.out.println("new one");
        System.out.println("something...");

        // or u can just use the escape sequenc - \n
        System.out.println("\n hell nah!!");
        // to add a tab space - \t
        System.out.println("\tokay!");
        // if you want to literally display some double quotes....
        System.out.println(" \" hello \" ");
        // if you want to print some backslashes u have to type in - \\
        System.out.println("\\aamigo");
        
    }

}