package rutina

class Sesion {

	Long id
	String descripcion
	Date fecha
	Date generado = new Date()


	static hasMany = [acciones:Accion]

	static mapping = {
        id generator: 'hilo',
           params: [table: 'hi_value', column: 'next_value', max_lo: 100]
    }

    static constraints = {
    	fecha nullable: true
    }

	@Override
	public String toString() {
		return "${fecha?:""} ${this.descripcion}";
	}

}
