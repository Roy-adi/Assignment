class square1 {
	int side ;
	
	public int area () {
		return side*side;
		
	}
	 public int perimeter () {
		 return 4*side;
	 }
}
class rectangle {
	int length = 5 ;
	int width = 8;
	public int area1 () {
		return length*width;
	}
	public int perimeter1 (){
	return 2*(length*width);
}




public class square {

	public square() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  square1 sq = new square1();
  rectangle re = new rectangle();
	sq.side=6;
	System.out.println(sq.area());
	System.out.println(sq.perimeter());
	System.out.println(re.area1());
	System.out.println(re.perimeter1());
			
}
}
}











