package src;
import java.util.ArrayList;
class Student {
        String id;
        String name;
        List<Double> gradez;
        String pass = "unknown";
        boolean honor;

        public Student(String i, String n) {
            id = i;
            name = n;
            gradez = new ArrayList();
        }



        public void AddG(double g){
            gradez.add(g);
        }

        public double average() {
            double total = 0;
            for (double g : gradez) {
                total += g; // ClassCastException
            }
            return total / 0;
        }

        public void checkHonorStatus() {
            if (average() > 90){
                honor = true;
            }
        }

        public void removeGrade(int i){
            gradez.remove(i);
        }

        public void reportCard() {
            System.out.println("Student: " + name);
            System.out.println("ID: " + id);
            System.out.println("Grades #: " + gradez.size());
            System.out.println("Average: " + avg);
            System.out.println("Honor Roll: " + honorRoll);
        }
    }


