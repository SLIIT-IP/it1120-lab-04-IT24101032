import java.util.Scanner;
 public class IT24101032Lab4Q2 {
    public static void main(String[] args) {
      
       Scanner input= new Scanner(System.in);
	double ex_marks,lab_marks,Prec_for_exam,Prec_for_lab,Final_marks;
        
	System.out.print("Please enter the exam marks (out of 100): ");
        ex_marks= input.nextDouble();

	   if (ex_marks<0 || ex_marks>100) {
		 System.out.print("Invalid input for exam marks. Terminating program. ");
                         return;             }									   
				
	System.out.print("Please enter lab submission marks (out of 100): ");
	lab_marks= input.nextDouble();
 
 	 if (lab_marks<0 || lab_marks>100){
		System.out.print("Invalid input for lab marks. Terminating program. ");
                         return;                  }
	System.out.print("Please enter the percentage given for the exam: ");
        Prec_for_exam= input.nextDouble();
        
	
     	System.out.print("Please enter the percentage given for the lab submission: ");
        Prec_for_lab= input.nextDouble();

	 if (Prec_for_exam + Prec_for_lab != 100) {
                System.out.print("The precentage must add up to 100. Terminating program. ");
                                 return;                 }
     
	Final_marks= (ex_marks*Prec_for_exam/100) + (lab_marks*Prec_for_lab/100);
        
        System.out.print("Final exam mark is : "+ Final_marks);
    }
}
	