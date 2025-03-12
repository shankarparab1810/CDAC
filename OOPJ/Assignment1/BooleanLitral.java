class BooleanLitral{
	public static void main(String []args){
		boolean b = true;
		for(int i=0; i<=1; i++){
			if(i==1){
				b = false;
			}
			if(b)
				System.out.println("True block exicuted");
			else
				System.out.println("False block exicuted");
		}
		
	}
}