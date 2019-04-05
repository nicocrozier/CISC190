public class Main {
    public static void main(String args[]){
        EStack<String> s = new EStack<String>();

        s.push("Hello");
        s.push("Bonjour");
        s.push("Oui mon Ami");

        s.pop();
        s.pop();
        s.pop();
        s.pop();

        System.out.println(s);
    }
}
