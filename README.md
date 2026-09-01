# Sistema de Gestión de Artefactos Mágicos de Instanciaveria

* Actividad: Laboratorio 1 - POO 2026 (11[02]76)
* Tipo de trabajo: Laboratorio en clase
* Fecha: 01-09-2026
* Duración: de 18 a 21.
* Entregable: Si.

# Grupo

- Juan E. (Legajo 174231) - jse...@gmail.com
- Simon T. (Legajo 188962) - sim...@gmail.com

# Contexto / Escenario

En el reino místico de Instanciaveria, la Academia de Hechicería Arcana necesita urgentemente un sistema para catalogar
y gestionar su vasta colección de artefactos mágicos. Cada artefacto posee un nombre, un nivel de poder (de 1 a 100) y 
un tipo (ej. "Poción", "Pergamino", "Amuleto", "Varita"). Con el Torneo de los Tres Reinos acercándose, los hechiceros 
necesitan encontrar y asignar artefactos a sus campeones de manera eficiente. Sin embargo, el sistema actual es un caos 
de pergaminos desordenados. Tu misión es diseñar e implementar un sistema robusto que ponga orden en este tesoro de
reliquias.

# Objetivo del Laboratorio

- Aplicar el uso de colecciones de Java del Framework `java.util` para gestionar un conjunto de datos.
- Seleccionar y justificar la estructura de datos más adecuada para resolver problemas específicos (búsqueda, almacenamiento sin duplicados, mapeo clave-valor).
- Implementar métodos que operen sobre colecciones para filtrar, agrupar y procesar datos.
- Practicar la creación de clases con `equals()` y `hashCode()` correctamente implementados.
- Validar una solución de software utilizando tests unitarios provistos en JUnit 5.

# Enunciado

Debes desarrollar la clase `CatalogoArtefactos` que gestionará una colección de objetos de tipo `Artefacto`.

1. Clase `Artefacto`:
   - Atributos: nombre (String), poder (int), tipo (¿String?).
   - Constructor para inicializar todos los atributos.
   - Métodos getters para todos sus atributos.
   - Implementación correcta de `equals()` y `hashCode()`: dos artefactos se consideran iguales si tienen el mismo nombre.
2. Clase `CatalogoArtefactos`:
   - Debe utilizar internamente una colección para almacenar los artefactos.
   - **void agregarArtefacto(Artefacto artefacto)**: Añade un nuevo artefacto al catálogo. Si un artefacto con el mismo nombre ya existe, no se debe añadir.
   - **Set<Artefacto> obtenerArtefactosUnicos()**: Devuelve un conjunto (`Set`) con todos los artefactos del catálogo, garantizando que no haya duplicados.
   - **List<Artefacto> buscarArtefactosPorTipo(String tipo)**: Devuelve una lista (`List`) de artefactos que coincidan con el tipo especificado. La lista debe estar ordenada de mayor a menor poder.
   - **Map<String, Integer> contarArtefactosPorTipo()**: Devuelve un mapa (`Map`) donde la clave es el tipo de artefacto y el valor es la cantidad de artefactos de ese tipo existentes en el catálogo.
   - **Artefacto obtenerArtefactoMasPoderoso()**: Devuelve el artefacto con el mayor nivel de poder. Si hay varios con el mismo poder máximo, puede devolver cualquiera de ellos. Si el catálogo está vacío, debe devolver `null`.

# Requerimientos Específicos

1. **Clase `Artefacto`**: Debe implementar `equals()` y `hashCode()` basándose únicamente en el atributo `nombre`.
2. **Clase `CatalogoArtefactos`**:
    - Para almacenar los artefactos, debes usar una colección que evite duplicados de forma natural. Se sugiere un `HashSet`.
    - El método `buscarArtefactosPorTipo` debe ser eficiente. No se permite simplemente iterar sobre toda la colección si existen formas más óptimas de estructurar los datos.
    - El método `contarArtefactosPorTipo` debe ser resuelto de manera clara y concisa.
3. No se permite el uso de librerías externas, a excepción de `java.util.*` y JUnit 5 para las pruebas.
4. Se deben seguir las convenciones de nomenclatura de Java (camelCase para métodos y variables, PascalCase para clases).

### Restricciones de Tiempo y Forma de Entrega

- **Duración**: 2.5 horas. (Hasta las 21 Hs)
- **Entrega**: Al finalizar la clase, debe realizar un *Pull Request* al repositorio oficial *forkeado* originalmente.