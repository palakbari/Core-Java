public class Studentt {
	
	int rollno;
    String name;
    double percentage;
    static int count = 0; 

    public Studentt(int rollno, String name, double percentage) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
        count++; 
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public static int getCount() {
        return count;
    }
    
    @Override
	public String toString() {
		return "Studentt [Roll_no=" + rollno + ", Name=" + name + ", Percentage=" + percentage + "]";
	}

    public static void main(String[] args) {

    	Studentt s1 = new Studentt(1, "ABC", 45.5);
        Studentt s2 = new Studentt(3, "PQR", 93.0);
        Studentt s3 = new Studentt(2, "UVW", 54.8);

        System.out.println("Number of students created: " + Studentt.getCount());

        System.out.println("Student 1: " + s1);
        System.out.println("Student 2: " + s2);
        System.out.println("Student 3: " + s3);
    }
}
