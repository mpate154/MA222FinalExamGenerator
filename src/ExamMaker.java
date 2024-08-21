import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ExamMaker {

    // ArrayList that keeps each question from each exam
    ArrayList<String> exam1 = new ArrayList<>();
    ArrayList<String> exam2 = new ArrayList<>();
    ArrayList<String> exam3 = new ArrayList<>();

    // function that reads the text file with every question, and stores each questions in an ArrayList per exam
    ExamMaker() {
        try {
            File newFile = new File("Exam1.txt");
            Scanner scan = new Scanner(newFile);
            Map<String, Integer> ints = new HashMap<>();
            for (int i = 1; i < 10; i++) {
                ints.put(i + ". ", 1);
            }
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
