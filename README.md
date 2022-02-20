## Introducción al proyecto

Este proyecto esta hecho con JPA, Hibernate y Maven. 

## Modelo de BBDD

![imagen](https://user-images.githubusercontent.com/78205607/154867179-07c00096-42a6-4197-be59-3bc54a972f42.png)

## Anotaciones JPA para crear la BBDD


1. <b>@Entity</b>, esta anotacion se pone encima de una clase, y le estamos dicienco al EM que dicha clase sera un tabla en bbdd. Por defecto se llamara en la bbdd como se llame la clase pero todo en minusculas. Por defecto cogera todos sus atributos y los convertira en columnas en la bbdd.
2. <b>@Table</b>, esta anotacion va encima de la clase y sirve para alterar la tabla que nos creara JPA, normalmente para cambiar el nombre de la tabla.
3. <b>@Id</b>, esta anotacion se pone en un atributo y representa el atributo que sera la primary key de la tabla.
4. <b>@GeneratedValue</b>, esta anotacion va acompañada de la anotacion @id, y representa que la clave primaria sera auto incrementada por la bbdd. Tiene varios posibles valores en funcion de la BBDD
5. <b>@Column</b>, esta anotacion se pone encima de un atributo y sirve para modificar las propiedades de la columna de bbdd. Recordemos que por defecto JPA nos convertira todos los atributos de una clase a columnas, y el nombre por defecto de la columna sera el mismo que el del atributo. Con esta anotacion podemos por ejemplo cambiar el nombre que tendra la columna en bbdd o por ejemplo permitir que sea nulo el campo en bbdd.
6. <b>@Temporal</b>, esta anotacion se pone encima de un atributo y sirve principalmente para trabajar con fechas (clase java.util.Date).
7. <b>@Transient</b>, esta anotacion se pone encima de un atributo y sirve para decirle a JPA que dicho atributo no queremos que se persita en bbdd, por lo que tampoco creara el campo correspondiente.
8. <b>@Enumerated</b>, esta anotacion se pone encima de un atributo y sirve para trabajar con enumerados.
9. <b>@Temporal</b> 	Se aplica a un atributo Java y sirve principalmente para trabajar con fechas.

10. <b>@OneToOne</b> 	Puede establecer asociaciones de uno a uno entre beans de entidad.

11. <b>@OneToMany</b> 	Puede establecer asociaciones de uno a muchos entre beans de entidad.

12. <b>@ManyToOne</b> 	Puede establecer asociaciones de muchos a uno entre beans de entidad.

13. <b>@ManyToMany</b> 	Puede establecer asociaciones de muchos a muchos entre beans de entidad.

14. <b>@JoinColumn</b> 	Anota los campos que almacenan la relación entre las tablas y debe marcarse en los atributos de la entidad. Se puede usar no solo con @OneToOne, sino también con las etiquetas @ManyToOne o @ManyToMany.