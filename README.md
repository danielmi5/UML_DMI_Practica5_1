# UML_DMI_Practica5_1

### 1.Interpreta el significado del diagrama de clases.

a) Relación entre las clases. Significado, tipo, multiplicidad. 

Un estudiante pertenece a un curso. 
Asociación de agregación
Un curso contiene muchos estudiantes. Un estudiante pertenece a un curso.

b) Elementos de las clases. Tipos y propósito. 
Atributo:
Método:
#### Curso
Tiene como atributos:
- nombre: Es una cadena y contiene el nombre del curso.
- codigo: Es una cadena y contiene el código del curso.
- estudiantes: Es una lista mutable y contiene los estudiantes que pertenecen a ese curso.

Tiene como métodos:
- agregarAlumno(estudiante): Se encarga de añadir un estudiante al curso, "estudiante" es un objeto de la clase Estudiante que representa al estudiante.
- mostrarEstudiantes(): Muestra la lista con los estudiantes

#### Estudiante
Tiene como atributos:
- nombre: Es una cadena y contiene el nombre del estudiante.
- dni: Es una cadena y contiene el DNI del estudiante.

Tiene como métodos:
- inscribirse(curso): Inscribe al estudiante a dicho curso.

c) Significado del método agregarAlumno(). Funcionamiento. 
Este metodo se encarga de añadir a los estudiantes al curso. Mediante un parametro de tipo objeto (de la clase Estudiante), este lo agrega a la lista mutable (estudiantes).

d) Significado del método inscribirse()
Este metodo es para inscribir estudiantes a un curso.

### 2. Generación de código a partir del diagrama. 

a) Crear clases

b) Crear relaciones

c) Crear main (para probar el sistema).
