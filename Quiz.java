
    import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0; // Initialize score

        // Questions and answers
        String[][] questions = {
            {"Apple is in which colour?", "A) red", "B) yellow", "C) black", "D) violet", "A"},
            {"Which planet is known as the Red Planet?", "A) Earth", "B) Mars", "C) Jupiter", "D) Venus", "B"},
            {"How many letters are there in English Alphabets?", "A) 90", "B) 26", "C) 89", "D) 123", "B"},
            {"What is 5 + 7?", "A) 10", "B) 12", "C) 15", "D) 17", "B"},
            {"Which is the largest ocean?", "A) Atlantic Ocean", "B) Indian Ocean", "C) Pacific Ocean", "D) Arctic Ocean", "C"}
        };
        System.out.println("Enter " + "YES" + " to continue in quiz");
        String option = sc.next(); 
        
        if(option == "YES"){
            System.out.println("uh can continue with ur quizz");
        }else{
            System.out.println("Here r your Qizz questions");
        }

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i][0]);
            for (int j = 1; j <= 4; j++) {
                System.out.println(questions[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            String answer = sc.next().toUpperCase();
            if (answer.equals(questions[i][5])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + questions[i][5]);
            }
        }
        System.out.println("\nQuiz completed! Your score: " + score + " out of " + questions.length);
        System.out.println("Thanks for Attending Quiz");

        sc.close();
    }
}
    

