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
		return length(this.asientos);
	}
	String verificarIntegridad () {
		int x = this.asientos[0].registro;
		int y = 0;
		for (asiento in this.asientos) {
			if (x == asiento.registro) {
				y += 1;
			}
		}
		if ((y == length(this.asientos)) and (this.registro == this.motor.registro == x)) {
			return "Auto original";
			}
		else {
			return "Las piezas no son originales";
			}
		
	}
}