package punto1;

public class Punto1 {
    public float x;
    public float y;

    public Punto1(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] coord_cartesianas(){
        return new float[]{this.x,this.y};
    }   
    public float[] coord_polares(){
        float radio=(float)Math.sqrt(this.x*this.x+this.y*this.y);
        float angulo=(float)Math.toDegrees(Math.atan2(this.y,this.x));
        return new float[]{radio,angulo};
    }
    public String toString(){
        return String.format("(%.2f, %.2f)", this.x, this.y);
    }
    public static void main(String[] args) {
        Punto1 p1=new Punto1(0,3);
        System.out.println(p1);
        float a[]=p1.coord_cartesianas();
        System.out.println(a[0]+" "+a[1]);
        float b[]=p1.coord_polares();
        System.out.println(b[0]+" "+b[1]);
    }
    
}
