

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz q=new Quiz();
        q.logic();

    }
}

class Quiz{
    Scanner sc=new Scanner(System.in);
    int correctAnsCount=0;
    int wrongAnsCount=0;
    public void logic(){
        Questions q1 = new Questions(" Which statement is true about Java?", "A. Java is a sequence-dependent programming language ", "B. Java is a code dependent programming language ", "C. Java is a platform-dependent programming language ", "D. Java is a platform-independent programming language ");
        Questions q2 = new Questions("What is the extension of java code files?", " A. .txt", "B. .pdf", "C. .sql", "D. .java");
        Questions q3 = new Questions("Who invented Java Programming? ", "A. Guido van Rossum", "B. James Gosling", "C. Dennis Ritchie", "D. Bjarne Stroustrup");
        Questions q4 = new Questions("Which one of the following is not a Java feature?", "A. Object-oriented", "B. Use of pointers", "C. Portable", "D. Dynamic and Extensible");
        Questions q5 = new Questions("Which of these cannot be used for a variable name in Java?", "A. identifier & keyword", "B. identifier", "C. Keyword", "D. none of the mentioned");
        
         Questions q6 = new Questions(" Which one of the following is not a Java feature?", "A.Object-oriented ", "B. Use of pointers ", "C.Portable ", "D. Dynamic and Extensible ");
        Questions q7 = new Questions("Which environment variable is used to set the java path?", " A. MAVEN_Path", "B.  JavaPATH", "C. JAVA", "D. JAVA_HOME");
        Questions q8 = new Questions("Which of the following is not an OOPS concept in Java? ", "A. Polymorphism", "B. Inheritance", "C. Compilation", "D. Encapsulation");
        Questions q9 = new Questions("What is not the use of “this” keyword in Java?", "A. Referring to the instance variable when a local variable has the same name", "B. Passing itself to the method of the same class", "C. Passing itself to another method", "D. Calling another constructor in constructor chaining");
        Questions q10 = new Questions("Which of the following is a type of polymorphism in Java Programming?", "A. Multiple polymorphism", "B. Compile time polymorphism", "C. Multilevel polymorphism", "D.  Execution time polymorphism");
         
           Questions q11 = new Questions(" What is Truncation in Java?", "A. Floating-point value assigned to a Floating type ", "B. Floating-point value assigned to an integer type ", "C. Integer value assigned to floating type ", "D. Integer value assigned to floating type ");
        Questions q12 = new Questions("What is the extension of compiled java classes?", " A. .txt", "B. .js", "C. .class", "D. .java");
        Questions q13 = new Questions("Which exception is thrown when java is out of memory? ", "A. MemoryError", "B. OutOfMemoryError", "C. MemoryOutOfBoundsException", "D. MemoryFullException");
        Questions q14 = new Questions("Which of these are selection statements in Java?", "A. break", "B. continue", "C. for()", "D. if()");
        Questions q15 = new Questions("Which of these keywords is used to define interfaces in Java?", "A. intf", "B. Intf", "C. interface", "D. Interface");
        
         Questions q16 = new Questions(" Which of the following is a superclass of every class in Java?", "A.ArrayList ", "B. Abstract class ", "C.Object class ", "D.  String ");
        Questions q17 = new Questions("Which of the below is not a Java Profiler?", " A. JProfiler", "B.  Eclipse Profiler", "C.JVM", "D. JConsole");
        Questions q18 = new Questions("Which of these packages contains the exception Stack Overflow in Java? ", "A. java.io", "B.  java.system", "C. java.lang", "D. java.util");
        Questions q19 = new Questions(" Which of these statements is incorrect about Thread?", "A. start() method is used to begin execution of the thread", "B. run() method is used to begin execution of a thread before start() method in special cases", "C. A thread can be formed by implementing Runnable interface only", "D. A thread can be formed by a class that extends Thread class");
        Questions q20 = new Questions("Which of these keywords are used for the block to be examined for exceptions?", "A. check", "B. throw", "C. catch", "D.  try");
         
            Questions q21 = new Questions("  Which one of the following is not an access modifier?", "A. Protected", "B. Void ", "C. Public ", "D. Private ");
        Questions q22 = new Questions("What is the numerical range of a char data type in Java?", " A. 0 to 256", "B. -128 to 127", "C.  0 to 65535", "D. 0 to 32767");
        Questions q23 = new Questions("Which class provides system independent server side implementation? ", "A. Server", "B. ServerReader", "C. Socket", "D. ServerSocket");
        Questions q24 = new Questions("Which of the following is true about servlets?", "A. Servlets can use the full functionality of the Java class libraries", "B. Servlets execute within the address space of web server, platform independent and uses the functionality of java class libraries", "C. Servlets execute within the address space of web server", "D. Servlets are platform-independent because they are written in java");
        Questions q25 = new Questions("Which of these is not a bitwise operator?", "A. &' Operator", "B. &=' Operator", "C. |=' Operator", "D. <=' Operator");
        
        
          
          
        Map<Questions,Character> hmap=new HashMap<>();
        hmap.put(q1,'b');
        hmap.put(q2,'D');
        hmap.put(q3,'B');
        hmap.put(q4,'B');
        hmap.put(q5,'C');
        
        hmap.put(q6,'B');
        hmap.put(q7,'D');
        hmap.put(q8,'C');
        hmap.put(q9,'B');
        hmap.put(q10,'B');
        
         hmap.put(q11,'B');
        hmap.put(q12,'C');
        hmap.put(q13,'B');
        hmap.put(q14,'D');
        hmap.put(q15,'C');
        
        hmap.put(q16,'C');
        hmap.put(q17,'C');
        hmap.put(q18,'C');
        hmap.put(q19,'B');
        hmap.put(q20,'D');
        
          hmap.put(q21,'B');
        hmap.put(q22,'C');
        hmap.put(q23,'D');
        hmap.put(q24,'B');
        hmap.put(q25,'D');
        
       
         
         
         
         

        for(Map.Entry<Questions,Character> map:hmap.entrySet()){
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());

            System.out.println("Enter Your Answer: ");
            Character ans=sc.next().charAt(0);

            int cans=Character.compare(ans,map.getValue());
            if(cans==0){
                System.out.println("Correct");
                correctAnsCount++;
            }
            else{
                System.out.println("Wrong");
                wrongAnsCount++;
            }

        }

        System.out.println();
        System.out.println("--------Result---------");
        System.out.println("Total Questions: "+hmap.size());
        System.out.println("Correct Answered Questions : "+correctAnsCount);
        System.out.println("Wrong Answered Questions : "+wrongAnsCount);
        int percentage=(100*correctAnsCount)/hmap.size();
        System.out.println("Percentage : "+percentage);
        if(percentage>95){
            System.out.println("Performance : Very Good");
        }
        else if(percentage<35){
            System.out.println("Performance : Very Low");
        }
        else{
            System.out.println("Performance : Medium");
        }


    }
}
