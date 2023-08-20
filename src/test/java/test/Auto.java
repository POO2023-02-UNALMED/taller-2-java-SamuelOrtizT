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
		int z = 0;
		int x = 0;
		for (Asiento asiento : this.asientos) {
			if (asiento.registro != 0) {
				int x = asiento.registro;
				break;
			}
		}
		for (Asiento asiento : this.asientos) {
			if (asiento.registro != 0) {
				z += 1;
			}
		}
		int y = 0;
		for (Asiento asiento : this.asientos) {
			if (x == asiento.registro) {
				y += 1;
			}
		}
		if ((y == z) && (this.registro == this.motor.registro) && (x == this.registro)) {
			return "Auto original";
			}
		else {
			return "Las piezas no son originales";
			}
		
	}
}