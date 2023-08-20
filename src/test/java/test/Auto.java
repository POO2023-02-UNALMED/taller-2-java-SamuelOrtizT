package test;
class Auto {
	String modelo;
	int precio;
	Array[Asiento] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	int cantidadAsientos () {
		return length(this.asientos)
	}
	String verificarIntegridad () {
		if () {
			return "Auto original"
		}
		else {
			return "Las piezas no son originales"
		}
	}
}
