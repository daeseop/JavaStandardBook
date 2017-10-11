package Chaper2;

class Varex2{	
	public static void main(String[] args){
		int x = 10, y = 20, temp = 0;
		System.out.println("x:" + x + "," + "y:" + y + "," + "temp:" + temp);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x:" + x + "," + "y:" + y + "," + "temp:" + temp);
		
	}
}