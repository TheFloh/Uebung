import java.awt.Color;
public class EquilateralTriangle extends GeometricObject{
	
	public EquilateralTriangle (double w, double h, Vertex pos, Color color){
		super(w, h, pos,color);}

	public EquilateralTriangle (double w, double h, double x, double y){
		super(w,h, new Vertex(x,y),new Color(0,0,0));}
	
	@Override public double area(){return (width*height)/2;}
	
	@Override public String toString(){
			return "EquilateralTriangle("+super.toString()+")";}
	
	@Override public boolean equals(Object that){
		return(that instanceof EquilateralTriangle && super.equals(that));}
}
