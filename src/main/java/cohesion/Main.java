package cohesion;
/*
* Cohesion = cohesion refers all about how a single class is designed.
*  Cohesion is the Object Oriented principle most closely associated with making sure that a class is designed with a single, well-focused purpose.
*   The more focused a class is, the cohesiveness of that class is more.
*   The advantages of high cohesion is that such classes are much easier to maintain (and less frequently changed) than classes with low cohesion.
*   Another benefit of high cohesion is that classes with a well-focused purpose tend to be more reusable than other classes.
*  Example of low Cohesion: class A -> checkEMail()
*                                   -> validateEMail()
*                                   -> sendEmail()
*                                   -> printLetter() ... etc
*
* so in class A there are a lot of methods that do different type of work.
* !! Low cohesion is when a class does a lot of jobs that don’t have much in common.
*
* Example of high Cohesion: class A: checkEmail()    -> class B: validateEmail()   -> class C: sendEmail() etc.
* !! High cohesion is when you have a class that does a well defined job
*    High cohesion gives us better maintaining facility and Low cohesion results in monolithic classes
* that are difficult to maintain, understand and reduces re-usability
*
*
* */
public class Main {
    public static void main(String[] args) {
        Name name = new Name("G the Man");
        System.out.println(name.getName());
        Age age = new Age(23);
        System.out.println(age.getAge());
        Number phNumb = new Number(123244545);
        System.out.println(phNumb.getMobileNo());

    }
}
