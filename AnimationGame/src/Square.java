import java.awt.Color;
public class Square extends GeometricObject {
	
	public Square (double w, Vertex pos,Color color){
		super(w, w, pos,color);
	}

	public Square (double w, double x, double y){
		super(w,w, new Vertex(0,0), new Color(0,0,0));
	}
	
	@Override public double area(){return width*width;}
	
	@Override public String toString(){
		return "Square("+super.toString()+")";}

	@Override public boolean equals(Object that){
		return(that instanceof Square && super.equals(that));}
	
	
}
