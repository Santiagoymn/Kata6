# Kata6

En esta kata 6 se ha realizado la organización de una empresa juguetera que se dedica a fabricar coches y helicopteros.

Por ello, en la primera versión se ha empezado teniendo en la fábrica un solo tipo de juguete, en este caso el coche, y con un número de serie. Cada vez que el usuario ponga por consola un caracter distinto de la frase "exit" el programa fabricará coches.

En la segunda versión, se ha incorporado la fabricación de helicopteros. Además, si el usuario escribe por consola "car" se fabricará un coche, si escribe "helicopter" se fabricará un helicóptero, si se inserta la frase "exit" se terminará la ejecución, y cualquier otro tipo de caracter pues mostrará el mensaje de comando desconocido.

En la tercera versión se crea el negocio en sí, en donde será allí en donde se llama a los distintos métodos que crean los coches y helicópteros.

En la cuarta versión, hemos visto que añadir un nuevo juguete implica modificar mucho código que ya está escrito y comprobado de que funcione, es por ello, que se decide adoptar el método factoría y para ello se realizan los cambios pertinentes.

En la quinta versión se decide en crear otra filial en la empresa, por lo que ahora tenemos una en América y otra en Asia, en ambos lugares los juguetes se fabrican con modelos distintos, por tanto en cada filial tendrá sus modelos. Para ello, se crea la clase abstracta del negocio en sí (la empresa) y de esta se implementa dos clases, por un lado la filial Americana y por otro la Asiática, en la que cada una fabricará sus juguetes dependiendo del modelo.

En la sexta versión, se hace modificaciones para que una filial no pueda modificar los procesos que la empresa ha propuesto, para ello lo que se hace es que ahora las filiales en América y en Asia son factorías que implementan la factoría juguetera en la cual nos dice que hay que producir y crear un juguete y que es esta misma clase abstracta la que implementa el negocio y la producción.

En la séptima versión observamos que no se cumple el principio de abierto/cerrado, ya que si queremos crear un nuevo modelo de juguete debemos de modificar clases ya creadas y que no debería de modificarse, es por ello que en esta versión lo que se hace es crear factorías por separado para cada juguete, para sí en caso de crear uno nuevo, tan solo debemos de crear el jueguete en sí y su factoría y de esta menra no modificamos la factoría general.

En la octava versión se tiene en cuenta que cada juguete necesita de unas partes fundamentales como las 4 ruedas y el motor para el coche, y el rotor de las hélices y el motor para el helicóptero. Además se sabe que estas partes de los juguetes son diferentes para los juguetes de Asia y los de América. Por lo que en el código se realizan las modificaciones oportunas además de crear el nuevo proceso de prepare() que hace que se fabriquen las distintas piezas para el juguete seleccionado.
