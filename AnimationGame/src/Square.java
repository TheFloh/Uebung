
public class Square extends GeometricObject {
	
	public Square (double w, double h, Vertex pos){
		super(w, h, pos);
	}

	public Square (double w, double h, double y){
		super(w,h, new Vertex(0,0));
	}
	
	@Override public double area(){return width*width;}
	
	@Override public String toString(){
		return "Square("+super.toString()+")";}

	@Override public boolean equals(Object that){
		return(that instanceof Square && super.equals(that));}
	
	
}
