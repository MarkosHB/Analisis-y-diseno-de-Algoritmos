////////////////////////////////////////////////////////////////////////////////////////////
// ALUMNO: Marcos Hidalgo Ba�os
// GRUPO: 2� D Ingenieria Infomatica
////////////////////////////////////////////////////////////////////////////////////////////

public class OrdenacionRapidaBarajada extends OrdenacionRapida {
	
	// Implementaci�n de QuickSort con reordenaci�n aleatoria inicial (para comparar tiempos experimentalmente)
	public static <T extends Comparable<? super T>> void ordenar(T v[]) {
		// A completar por el alumno
		barajar(v);
		ordRapidaRec(v, 0, v.length-1); // metodo de la clase padre
    }

	// reordena aleatoriamente los datos de un vector
    private static <T> void barajar(T v[]) {
    	// A completar or el alumno
    	for (int k = v.length-1; k > 0 ; k--) {
    		intercambiar(v, k, aleat.nextInt(k+1));
    	}
    }
}
