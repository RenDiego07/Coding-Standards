package src;

class Main {
    public static void main(String[] args) {
        Student s = new Student("abc", null);
        s.AddG(100);
        s.AddG("Ninety");
        s.average();
        s.checkHonorStatus();
        s.removeGrade(9);
        s.reportCard();
    }

}


