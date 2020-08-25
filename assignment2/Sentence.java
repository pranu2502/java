public class Sentence {
    public static void main(String args[])
    {
        String str = "the language Java the language is named after the island Java";
        String[] arr = str.split(" ",-2);
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[arr.length-i-1]);
            System.out.print(" ");
        }
    }
}