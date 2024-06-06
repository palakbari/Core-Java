

public class StudentMain 
{
	    public static void main(String[] args) 
	    {
	        UtilityList utilityList = new UtilityList();
	        utilityList.createList();
	        utilityList.printList();

	        UtilityReport utilityReport = new UtilityReport();
	        utilityReport.showReport(utilityList.getStudents());
	    }
}
