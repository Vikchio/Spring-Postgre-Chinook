Para realizar el proyecto primero debemos de crearlo, para esto he utilizado Spring Initializr.
Aqui seleccionamos el tipo de proyecto que vamos a realizar, en nuestro caso Maven.
En Name cambiamos el nombre del proyecto.

Una vez hecho esto añadiremos las dependencias necesarias que vamso a utilizar.
He utilizado:
    -Spring Boot DevTools
    -Lombok
    -Spring Web
    -PostgreSQL Driver

Una vez seleccionamos todas las dependencias hacemos click en generar proyecto.
Este lo descomprimimos y lo abrimos con el IDE que se vaya a utilizar, en mi caso Visual Studio Code.

Empezamos a programar el model el cual tiene el mapeado de nuestras clases, contiene las columnas que
tiene la tabla y sus relaciones.

Una vez hecho el model hacemos el repository, el cual contiene los metodos que interactuan con la base
de datos.

Después hacermos el service que gestiona las operaciones del repository .

Por último realizamos el controller que responde las peticiones del usuario.

Para conectarnos con la base de datos tendremos que decirle como en el archivo application.properties que
se encuentra en la carpeta de resources.

Una vez ejecutemos la API podremos acceder a los datos con las rutas definidas en el controller.

Las rutas de esta API son:
    localhost:8080/api/customers
    localhost:8080/api/employee
    localhost:8080/api/invoice

Devuelven la base de datos al completo, en el caso de querer realizar alguna consulta tendremos que programarla
en las clases para realizar consultas por alguno de los campos en concreto.