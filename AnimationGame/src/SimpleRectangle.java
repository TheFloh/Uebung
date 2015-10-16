
public class SimpleRectangle extends GeometricObject{
	
	public SimpleRectangle (double w, double h, Vertex pos){
		super(w, h, pos);
	}

	public SimpleRectangle (double w, double h){
		super(w,h, new Vertex(0,0));
	}
	
	@Override public double area(){return width*height;}
	
	@Override public String toString(){
		return "SimpleRectangle("+super.toString()+")";}

	@Override public boolean equals(Object that){
		return(that instanceof SimpleOval && super.equals(that));}
	
}
