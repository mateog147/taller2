## Taller 2.

En este proyecto de java se emplean las clases abstracatas, herencia, sobre carga de metodos y polimorfismo para solucionar un pequeño problema relacionado con Naves espaciales.

## Desafío.

- `1`. Realizar una extracción de atributos genéricos abstractos e interfaces, que puedas identificar en el artículo. Crear las interfaces y clases abstractas que creas convenientes según la lectura.
- `2`. Crear al menos dos comportamientos abstractos de una nave.
- `3`. Crear al menos cuatro tipos de naves diferentes con diferentes comportamiento, si es posible hacer una sobrecarga y una sobreescritura de métodos.
- `4`. Crear una clase principal que permita crear las naves de forma tal este bajo una condición booleana o por medio de una regla estipulada dentro de un switch-case o       if-else.
- `5`. El programa debe tener una ejecución infinita, hasta que el usuario no diga que quiere terminar el programa, este no deberá culminar.



## Solución

- `1`. La clase abstracta SpaceCraft es la super clase de la que parten las demas clases.
- `2`. Hay tres metodos abstractos en la clase SpaceCraft: acelerate, decelerate y showMenu.
- `3`. Segun la lectura tenemos 3 clases de Naves Shuttle, Manned y Unmanned, Adcional por medio de objetos anonimos se puede instanciar la clase abstracta SpaceCraft, 
En la clase Manned tenemos sobre carga de los metodos acelerate y senMessage.
- `4`. En la clase Main esta el metodo main para la ejecución.
- `5`. El programa corre en un ciclo do while que solo sale de ejecución cuando el usuario presiona 0.

