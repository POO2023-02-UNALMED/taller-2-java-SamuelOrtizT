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
		int x = 0; 
		int z = 0;
		for (Asiento asiento : this.asientos) {
			if (asiento != null && asiento.registro != 0) {
				x = asiento.registro; 
				z += 1;
			}
		}
		int y = 0;
		for (Asiento asiento : this.asientos) {
			if (asiento != null && x == asiento.registro) {
				y += 1;
			}
		}
		
		if ((y == z) && (this.registro == this.motor.registro) && (x == this.registro)) {
			return "Auto original";
		} else {
			return "Las piezas no son originales";
		}
	}	
}