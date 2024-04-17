package assignment.assignment20;

import arrray.Student;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsoleLogging {
    static final Logger logger = Logger.getLogger(ConsoleLogging.class.getName());
    public static void main(String[] args) {
        logger.setLevel(Level.OFF);
        Student student = new Student("ABC", 12);
        System.out.println(student);
        logger.severe("This is a critical message");
        logger.warning("This is a warning message");
        logger.info(String.valueOf(student));






    }
}
