package oop.encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setStName("Rana");
		st1.setStId(101);
		st1.setGrade("B+");
		st1.setDOB("08-11-1985");
		
		System.out.println(st1.getStName()+" "+st1.getStId()+" "+st1.getGrade()+" "+st1.getDOB());
		
		Student st2 = new Student("Shamim", 102, "B-", "09-11-1980");
		
		System.out.println(st2.getStName()+" "+st2.getStId()+" "+st2.getGrade()+" "+st2.getDOB());
		

	}

}
