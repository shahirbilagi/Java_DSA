package String_Example;
public class Appends {
    public static void main(String[] args) {
        String mySubject = "Core Java Programming";
        String myNewSubject = "";
        int firstSpacePosition = mySubject.indexOf(" ");
        String firstWord = "";
        if (!mySubject.startsWith("Advanced")) {
            firstWord = mySubject.substring(0, firstSpacePosition);
            myNewSubject = mySubject.replace(firstWord, "Advanced");
        }
        System.out.println("New Subject is: " + myNewSubject);
        System.out.println("Old Subject is: " + mySubject);
    }
}