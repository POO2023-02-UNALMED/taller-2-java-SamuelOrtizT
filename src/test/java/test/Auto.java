package test;
class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	int cantidadAsientos() {
		int contador = 0;
		for (Asiento asiento : this.asientos) {
			if (asiento != null) {
				contador += 1;
			}
		}
		return contador;
	}
	String verificarIntegridad () {
		int x = this.asientos[0].registro;
		int y = 0;
		for (Asiento asiento : this.asientos) {
			if ((asiento != null) && (x == asiento.registro)) {
				y += 1;
			}
		}
		if ((y == this.asientos.length) && (this.registro == this.motor.registro) && (this.registro == x)) {
			return "Auto original";
			}
		else {
			return "Las piezas no son originales";
			}
		
	}
}