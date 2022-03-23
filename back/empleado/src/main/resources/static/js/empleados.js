$(document).ready(function() {

    cargarEmpleado();

    //$('#empleados').DataTable();
});

async function cargarEmpleado(){

        const request = await fetch('api/empleados', {
            method:'GET',
            headers: {

                'Accept':'application/json',
                'Content-Type':'application/json'

            }
        });

        const empleados = await request.json();

        let listadoHTML ='';

        let cantEmpleados = 0;

        for(let empleado of empleados){

            let botones = '<button onclick="eliminarUsuario('+empleado.id+')"> <img src="img/eliminar.png" height ="32" width="32" /></button><button><img src="img/modificar.png" height ="32" width="32" /></button>';

            let nomyapi = empleado.nombre + " " + empleado.apellido;

             let html_empleado = '<tr><td>'+empleado.id+'</td><td>'+nomyapi+'</td><td>'+empleado.sueldo+'</td><td>'+empleado.año+'</td><td class="botones">'+botones+'</td></tr>';
             listadoHTML += html_empleado;

             cantEmpleados = cantEmpleados + 1;
        }

        console.log(empleados);

        document.querySelector('#empleados tbody').outerHTML = listadoHTML;

        document.querySelector('.buscador-empleado .cant_empleados').outerHTML = '<label>Cantidad de Empleados: '+cantEmpleados+'</label>';

    }


async function eliminarUsuario(id){

       if(!confirm("Desea Eliminar este Empleado?"){

        return;

       }

       const request = await fetch('api/empleado/' + id , {

                 method:'DELETE',
                 headers: {

                 'Accept':'application/json',
                 'Content-Type':'application/json'

               }
        });

        cargarEmpleado();

    }