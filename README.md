*Documentacion de los cambios/errores que tuve que hacer para que funcionará.
Realicé los siguientes cambios mínimos para que el código pudiera compilar y ejecutarse correctamente luego de leer e interpretar errores básicos:

1. Cambié el tipo time por LocalTime, porque time no existe como tipo de dato en Java.
2. Cambié el tipo date por LocalDate.
3. Convertí Ordenes[5]: array en Orden[] ordenes = new Orden[5], que es la forma correcta de declarar un arreglo de cinco órdenes en Java porque lo tenía agregado en mi UML de forma incorrecta.
4. Creé los enum para los tipos de pago, masa, salsa y toppings y mejore sus relaciones,
5. Agregué constructores básicos para poder crear los objetos y asignar sus atributos porque no los agregue o los hice hacer notar en el UML.
6. Agregué la clase Main para crear una orden y demostrar el funcionamiento básico del programa.
7. Guardé los archivos compilados .class dentro de la carpeta bin, siguiendo las indicaciones de la pizarra.
8. Optimicé las relaciones de las clases, modifique Pago y DetalleDePago hacia la clase Orden.

