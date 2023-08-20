package test;
class Asiento {
	String color;
	int precio;
	int registro;
	void cambiarColor (String color) {
		if (color in ["rojo", "verde", "amarillo", "negro", "blanco,"]) {
			this.color = color;
		}
	}
}