
import java.util.*;

class Student {
    private int id;
    private String name;
    private double percentage;
    private Set<String> skillSet;

    public Student(int id, String name, double percentage, Set<String> skillSet) 
    {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.skillSet = new HashSet<>(skillSet);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public Set<String> getSkillSet() {
        return skillSet;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage);
        System.out.println("Skill Set: " + skillSet);
    }
}

class UtilityList {
    private ArrayList<Student> students = new ArrayList<>();

    public void createList() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for Student " + (i+1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Percentage: ");
            double percentage = sc.nextDouble();
            sc.nextLine(); // Consume newline
            System.out.print("Enter number of skills: ");
            int numSkills = sc.nextInt();
            sc.nextLine(); // Consume newline

            Set<String> skills = new HashSet<>();
            for (int j = 0; j < numSkills; j++) {
                System.out.print("Skill " + (j+1) + ": ");
                String skill = sc.nextLine();
                skills.add(skill);
            }

            Student student = new Student(id, name, percentage, skills);
            students.add(student);
        }
    }

    public void printList() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }

        System.out.println("List of Students:");
        for (Student student : students) {
            student.displayInfo();
            System.out.println();
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}

class UtilityReport {
    private Map<String, Double> reportMap = new HashMap<>();

    public void showReport(ArrayList<Student> students) {
        for (Student student : students) {
            reportMap.put(student.getName(), student.getPercentage());
        }

        List<Map.Entry<String, Double>> sortedList = new ArrayList<>(reportMap.entrySet());
        sortedList.sort(new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                return Double.compare(o2.getValue(), o1.getValue());
            }
        });

        System.out.println("Student Name\tPercentage");
        for (Map.Entry<String, Double> entry : sortedList) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
    }
}



