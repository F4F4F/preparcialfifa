COPIAR EL proyect properties
-------------------------------
1. Busco una columna que diga FK.
2. Miro EN QUÉ TABLA está esa FK.
3. Miro A QUÉ TABLA apunta.
4. La clase que CONTIENE la FK:
      @ManyToOne
      @JoinColumn(name = "nombre_fk_sql")
5. La otra clase:
      @OneToMany(mappedBy = "atributoJavaDelOtroLado")
-------------------------------------------

¿Qué entidad quiero DEVOLVER?
        ↓
En ese Repository empiezo
        ↓
¿Cómo camino desde esa entidad
hasta el atributo por el que quiero filtrar?
