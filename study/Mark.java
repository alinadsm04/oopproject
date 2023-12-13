package study;

public class Mark implements GradeCalculator{
    private double firstAtt;
    private double secondAtt;
    private double finalScore;
    private double totalScore;
    private String grade;
	public int totalGrade;
    
    public Mark(Double firstAtt, Double secondAtt, Double finalGrade, double finalScore) {
        this.totalScore = firstAtt + secondAtt + finalScore;
        this.firstAtt = firstAtt;
        this.secondAtt = secondAtt;
        this.finalScore = finalScore;
        updateGrade(); 
    }
    
    
    public Double getFirstAtt() {
        return this.firstAtt;
        
    }

    public void setFirstAtt(Double firstAtt) {
        this.firstAtt = firstAtt;
        updateGrade(); 
    }

    public Double getSecondAtt() {
        return this.secondAtt;
    }

    public void setSecondAtt(Double secondAtt) {
        this.secondAtt = secondAtt;
        updateGrade(); 
    }
    
    public Double getFinalScore() {
        return this.finalScore;
    }

    public void setFinalScore(Double finalScore) {
        this.finalScore = finalScore;
        updateGrade(); 
    }
    
    
    public Double getTotalScore() {
        return this.totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
        updateGrade(); 
    }

    public String calculateGrade() {
        if (totalScore >= 95 && totalScore <= 100) 
            return "A"; 
            if (totalScore >= 90) 
                return "A-"; 
            if (totalScore >= 85) 
                return "B+"; 
            if (totalScore >= 80) 
                return "B"; 
            if (totalScore >= 75) 
                return "B-"; 
            if (totalScore >= 70) 
                return "C+"; 
            if (totalScore >= 65) 
                return "C"; 
            if (totalScore >= 60) 
                return "C-"; 
            if (totalScore >= 55) 
                return "D+"; 
            if (totalScore >= 50) 
                return "D"; 
            else  
                return "F";
    }
    
    public void updateGrade() {
        this.grade = calculateGrade();
    }
    
    public void printMarkDetails() {
        System.out.println("First Attendance: " + firstAtt);
        System.out.println("Second Attendance: " + secondAtt);
        System.out.println("Final Score: " + finalScore);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Grade: " + grade);
    }
    
    
}
