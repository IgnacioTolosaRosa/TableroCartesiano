package TableroCartesiano;

public class Tablero {
 
	private int x;
	private int y;


public Tablero(int x, int y) {
	this.x=x;
	this.y=y;
}
public void  moverArriba(int incremento) {
	y+=incremento;
}
public void moverAbajo(int incremento) {
	y-=incremento;
}
public void moverDerecha(int incremento) {
	x+=incremento;
}
public void moverIzquierda(int incremento) {
	x-=incremento;
}

public int getx() {
	return x;
}
public int gety() {
	return y;
}
}