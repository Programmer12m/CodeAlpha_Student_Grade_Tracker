package Student;

public class Calculations {

    public  char calculateGrade(int marksTo) {

        if (marksTo >= 90) return 'A';
        else if (marksTo >= 80) return 'B';
        else if (marksTo >= 70) return 'C';
        else if (marksTo >= 60) return 'D';
        else return 'F';
    }
   // public  void classReport(int ) { }
}


