package Practice8_problems;

abstract class Question {
    int points;

    Question(int points) {
        this.points = points;
    }

    abstract double evaluate();
}

class MCQQuestion extends Question {

    String correctAnswer;
    String studentAnswer;

    MCQQuestion(String c, String s, int p) {
        super(p);
        correctAnswer = c;
        studentAnswer = s;
    }

    double evaluate() {
        return correctAnswer.equals(studentAnswer) ? points : 0;
    }
}

class TFQuestion extends Question {

    String correctAnswer;
    String studentAnswer;

    TFQuestion(String c, String s, int p) {
        super(p);
        correctAnswer = c;
        studentAnswer = s;
    }

    double evaluate() {
        return correctAnswer.equals(studentAnswer) ? points : 0;
    }
}

public class P4_ExaminationQuestionGrader {
}
