class Curso(
    private val nombre: String,
    private val codigo: String
) {
    private val estudiantes: MutableList<Estudiante> = mutableListOf<Estudiante>()
    fun agregarAlumno(estudiante: Estudiante){
        estudiantes.add(estudiante)
    }

    fun mostrarEstudiantes(){
        println("Estudiantes del ${this.nombre}:")
        var cont = 0
        for (estudiante in estudiantes){
            println("Estudiante ${++cont}: ${estudiante.nombre}, con DNI: ${estudiante.dni}")
        }
        println()
    }
}