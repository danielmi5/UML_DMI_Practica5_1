fun main(){

    val estudiante1 = Estudiante("Daniel", "11111111D")
    val estudiante2 = Estudiante("Adios", "63467333W")
    val curso = Curso("Curso1", "12342")
    curso.agregarAlumno(estudiante2)
    curso.mostrarEstudiantes()
    estudiante1.inscribirse(curso)
    curso.mostrarEstudiantes()
}