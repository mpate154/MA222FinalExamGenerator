import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ExamMaker {

    // ArrayList that keeps each question from each exam
    ArrayList<String> exam1 = new ArrayList<>();
    ArrayList<String> exam2 = new ArrayList<>();
    ArrayList<String> exam3 = new ArrayList<>();

    /**
     * Reads the 3 Exam text files, seperates each questions and adds to a String, and adds to an ArrayList that holds
     * questions for each Exam 
     */
    ExamMaker() {
        try { //reads text file for Exam 1
            File newFile = new File("Exam1.txt");
            Scanner scan = new Scanner(newFile);
            //Puts 1., 2., 3. ..etc into a hashmap so when looking through text file, it's easier to identify
            //the beginning of a question. 
            Map<String, Integer> ints = new HashMap<>();
            for (int i = 1; i < 10; i++) {
                ints.put(i + ". ", 1);
            }
            //Use a while-loop to look through text file, seeing if 1., 2. ..etc (the beginning of a question henceforth the end of the previous) is present
            //We then add this full question to an ArrayList holding all questions
            //Because a question in the text file can take up multiple lines, a StringBuilder helps to concat all parts of the question into a single String
            StringBuilder question = new StringBuilder();
            question.append(scan.nextLine());
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.length() >= 3 && ints.containsKey(line.substring(0, 3))) {
                    exam1.add(question.toString());
                    question.setLength(0);
                    question.append(line);
                } else {
                    question.append(line);
                }
            }
            exam1.add(question.toString());
            
            //Same process for exam 2
            newFile = new File("Exam2.txt");
            scan = new Scanner(newFile);
            question = new StringBuilder();
            question.append(scan.nextLine());
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.length() >= 3 && ints.containsKey(line.substring(0, 3))) {
                    exam2.add(question.toString());
                    question.setLength(0);
                    question.append(line);
                } else {
                    question.append(line);
                }
            }
            exam2.add(question.toString());

            //Same process for Exam 3
            newFile = new File("Exam3.txt");
            scan = new Scanner(newFile);
            question = new StringBuilder();
            question.append(scan.nextLine());
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.length() >= 3 && ints.containsKey(line.substring(0, 3))) {
                    exam3.add(question.toString());
                    question.setLength(0);
                    question.append(line);
                } else {
                    question.append(line);
                }
            }
            exam3.add(question.toString());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

        /** 
         * Picks three random questions (may repeat) from each question-holding Array and prints it
         * to generate an exam
         */ 
        public void generateExam(){
        
            int max = exam1.size();
            int min = 0;
            int range = max - min + 1;
            for (int i = 1; i < 4; i++) {
                int randomNumber = (int) (Math.random() * range) + min;
                String question = exam1.get(randomNumber);
                String randomQues = Integer.toString(i) + "." + (question.substring(2, (question.length())));
                System.out.println(randomQues);
            }
            max = exam2.size();
            range = max - min + 1;
            for (int i = 4; i < 7; i++) {
                int randomNumber = (int) (Math.random() * range) + min;
                String question = exam2.get(randomNumber);
                String randomQues = Integer.toString(i) + "." + (question.substring(2, (question.length())));
                System.out.println(randomQues);
            }
            max = exam3.size();
            range = max - min + 1;
            for (int i = 7; i < 10; i++) {
                int randomNumber = (int) (Math.random() * range) + min;
                String question = exam3.get(randomNumber);
                String randomQues = Integer.toString(i) + "." + (question.substring(2, (question.length())));
                System.out.println(randomQues);

        }

    }
}
