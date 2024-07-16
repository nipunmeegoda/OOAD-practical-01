package practical01;

public class Welcome{
  public static void main(String[] args){
	int[][] Marks;
	int num,menu,st_number,sub_number;
	java.util.Scanner myKey = new java.util.Scanner(System.in);
	System.out.print("Enter Number of Students");
    	num = myKey.nextLine();
    	Marks = new int[num][4];
	
	System.out.print("Main Menu\n01. Update Marks of All Students\n02. Change specific Mark of a Student\n03. Average for a Subject");
    	menu = myKey.nextLine();	

	switch(menu) {
  		case 1:
    			for(int i = 0; i<num;i++){
				for(int j=0; j<4;j++){
					if (j==0)
						Marks[i][j] = i+1; 
					else if (j==1){
						System.out.print("Enter Maths Mark of %d Student",i+1);
    						Marks[i][j] = myKey.nextLine();
					}
					else if (j==2){
						System.out.print("Enter Chemistry Mark of %d Student",i+1);
    						Marks[i][j] = myKey.nextLine();
					}
					else if (j==3){
						System.out.print("Enter Physics Mark of %d Student",i+1);
    						Marks[i][j] = myKey.nextLine();
					}	
				}
			}
    			break;
  		case 2:
    			System.out.print("Enter Student Number");
    			st_number = myKey.nextLine();
    			System.out.print("Enter Subject Number\n 01.Maths\n02.Chemistry\n03.Physics");
			sub_number = myKey.nextLine();
			System.out.print("Enter the Changed Mark");
			Marks[st_number)[sub_number] = myKey.nextLine();
			break;
		case 3:
			System.out.print("Enter Subject Number\n 01.Maths\n02.Chemistry\n03.Physics");
			sub_number = myKey.nextLine();
			int temp = 0;
			for (int i=0;i<num;i++){
				temp += 
			}
			break;
  		default:
    			// code block
}
	
	

		
  }
}