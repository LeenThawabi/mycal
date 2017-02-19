


public class Main1 {
	
	 public static void main(String[] args){
		 
		 view v=new view();
		 v.setVisible(true);
		 v.setSize(300,400);
		 model m= new model();
	
      vcontroller c = new vcontroller(v,m);
   
   
	 }
}
