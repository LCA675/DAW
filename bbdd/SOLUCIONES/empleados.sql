COMPOSICION INTERNA


select e.*, d.*
from empleado e 
left join departamento d on e.id_departamento=d.id
order by d.nombre , e.apellido1, e.apellido2, e.nombre; 

        ID NIF       NOMBRE               APELLIDO1            APELLIDO2            ID_DEPARTAMENTO         ID NOMBRE               PRESUPUESTO     GASTOS
---------- --------- -------------------- -------------------- -------------------- --------------- ---------- -------------------- ----------- ----------
         4 77705545E Adrian               Suarez                                                  4          4 Contabilidad              110000       3000
        11 67389283A Marta                Herrera              Gil                                1          1 Desarrollo                120000       6000
         1 32481596F Aaron                Rivero               Gomez                              1          1 Desarrollo                120000       6000
         6 38382980M Maria                Santana              Moreno                             1          1 Desarrollo                120000       6000
        10 46384486H Diego                Flores               Salas                              5          5 I+D                       375000     380000
         5 17087203C Marcos               Loyola               Mendez                             5          5 I+D                       375000     380000
         3 R6970642B Adolfo               Rubio                Flores                             3          3 Recursos Humanos          280000      25000
         8 71651431Z Pepe                 Ruiz                 Santana                            3          3 Recursos Humanos          280000      25000
         9 56399183D Juan                 Gomez                Lopez                              2          2 Sistemas                  150000      21000
         7 80576669X Pilar                Ruiz                                                    2          2 Sistemas                  150000      21000
         2 Y5575632D Adela                Salas                Diaz                               2          2 Sistemas                  150000      21000
        13 82635162B Juan Antonio         Saez                 Guerrero
        12 41234836R Irene                Salas                Flores


3


select distinct d.id, d.nombre 
from departamento d 
right join empleado e on e.id_departamento=d.id;

        ID NOMBRE
---------- --------------------
         1 Desarrollo
         2 Sistemas
         4 Contabilidad
         3 Recursos Humanos
         5 I+D

4

select distinct d.id, d.nombre, (d.presupuesto-d.gastos) as "Presupuesto actual"
from departamento d
right join empleado e on e.id_departamento=d.id;

        ID NOMBRE               Presupuesto actual
---------- -------------------- ------------------

         5 I+D                               -5000
         4 Contabilidad                     107000
         3 Recursos Humanos                 255000
         2 Sistemas                         129000
         1 Desarrollo                       114000



5

select d.nombre
from departamento d 
join empleado e on e.id_departamento=d.id
where e.nif='38382980M';

NOMBRE
--------------------
Desarrollo

6

select d.nombre
from departamento d 
join empleado e on e.id_departamento=d.id
where e.nombre='Pepe' and e.apellido1='Ruiz' and e.apellido2='Santana';


NOMBRE
--------------------
Recursos Humanos


7

select e.*, d.nombre
from empleado e 
inner join departamento d on d.id=e.id_departamento
where d.nombre='I+D'
order by  e.apellido1, e.apellido2, e.nombre; 


 
        ID NIF       NOMBRE               APELLIDO1            APELLIDO2            ID_DEPARTAMENTO NOMBRE
---------- --------- -------------------- -------------------- -------------------- --------------- --------------------
        10 46384486H Diego                Flores               Salas                              5 I+D
         5 17087203C Marcos               Loyola               Mendez                             5 I+D


8 

select e.*, d.nombre
from empleado e 
inner join departamento d on d.id=e.id_departamento
where d.nombre='I+D' or d.nombre='Sistemas' or d.nombre='Contabilidad'
order by  e.apellido1, e.apellido2, e.nombre; 


        ID NIF       NOMBRE               APELLIDO1            APELLIDO2            ID_DEPARTAMENTO NOMBRE
---------- --------- -------------------- -------------------- -------------------- --------------- --------------------
        10 46384486H Diego                Flores               Salas                              5 I+D
         9 56399183D Juan                 Gomez                Lopez                              2 Sistemas
         5 17087203C Marcos               Loyola               Mendez                             5 I+D
         7 80576669X Pilar                Ruiz                                                    2 Sistemas
         2 Y5575632D Adela                Salas                Diaz                               2 Sistemas
         4 77705545E Adrian               Suarez   

9

select e.nombre
from empleado e
join departamento d on e.id_departamento=d.id
where d.presupuesto not between 100000 and 200000;

NOMBRE
--------------------
Adolfo
Marcos
Pepe
Diego


10

select distinct d.nombre
from departamento d 
join empleado e on d.id=e.id_departamento
where e.apellido2 is null;

NOMBRE
--------------------
Sistemas
Contabilidad


COMPOSICION EXTERNA

1

select e.*, d.*
from empleado e 
left join departamento d on e.id_departamento=d.id;

        ID NIF       NOMBRE               APELLIDO1            APELLIDO2            ID_DEPARTAMENTO         ID NOMBRE               PRESUPUESTO     GASTOS
---------- --------- -------------------- -------------------- -------------------- --------------- ---------- -------------------- ----------- ----------
         1 32481596F Aaron                Rivero               Gomez                              1          1 Desarrollo                120000       6000
         6 38382980M Maria                Santana              Moreno                             1          1 Desarrollo                120000       6000
        11 67389283A Marta                Herrera              Gil                                1          1 Desarrollo                120000       6000
         2 Y5575632D Adela                Salas                Diaz                               2          2 Sistemas                  150000      21000
         7 80576669X Pilar                Ruiz                                                    2          2 Sistemas                  150000      21000
         9 56399183D Juan                 Gomez                Lopez                              2          2 Sistemas                  150000      21000
         3 R6970642B Adolfo               Rubio                Flores                             3          3 Recursos Humanos          280000      25000
         8 71651431Z Pepe                 Ruiz                 Santana                            3          3 Recursos Humanos          280000      25000
         4 77705545E Adrian               Suarez                                                  4          4 Contabilidad              110000       3000
         5 17087203C Marcos               Loyola               Mendez                             5          5 I+D                       375000     380000
        10 46384486H Diego                Flores               Salas                              5          5 I+D                       375000     380000
        12 41234836R Irene                Salas                Flores
        13 82635162B Juan Antonio         Saez                 Guerrero


2

s                                               4 Contabilidad

