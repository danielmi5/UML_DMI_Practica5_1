class Estudiante(val nombre: String, val dni: String) {

    fun inscribirse(curso: Curso){
        curso.agregarAlumno(this)
    }

    /*override fun toString(): String {
        return "Estudiante de nombre \"$nombre\" con dni \"$dni\""
    }*/
}