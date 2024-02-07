public class Welcome {
    public static void main(String[] args) {
        String greetings= "Welcome to Session-1 training";
        System.out.println(greetings);
        for(int i =0; i <greetings.length(); i++){
            System.out.print("=");
            System.out.println(i + " = " + greetings.charAt(i));

        }


    }
}
