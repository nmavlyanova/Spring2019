package classwork;

public class CanvasPractice {

	public static void main(String[] args) {
		
		String [] courses = {
				"Welcome kit",
				"Online-Java programming",
				"Online-Software lifecycle",
				"Online-Software QA Testing",
				"Online-Team Activity",
				"Online Mentoring",
				"Online-Selenium",
				"Online SQL",
				"Online-API Testing"
				};
		int[] courseId = {143,166,168,170,163,203,169,171,164};
		
		
		for (int i = 0; i < courses.length; i++) {
			
			System.out.println("The course id for <" + courses[i]+ ">is<"+ courseId[i]+ ">" );
				
			}
		for (int i = 0; i < courses.length; i++) {
			String eachCourse= courses[i];
			//System.out.println(eachCourse);
			if(eachCourse.equals("Online-Java programming")) {
				//System.out.println("Index is "+courseId[i]);
				break;
			}
		}
		
		for (int i = 0; i < courseId.length; i++) {
			int courseIdIndex= courseId[i];
			//System.out.println(courseIdIndex);
			if(courseIdIndex==203) {
				System.out.println("Course name for ID 203 is"+ courses[i]);
			}
		}
		
		
		int count=0;
		for (int i = 0; i < courses.length; i++) {
			if(courses[i].contains("Software")) {
				count++;
			}
			
			
		}System.out.println("Course that contains Software : "+ count);
		
		
		}

	}


