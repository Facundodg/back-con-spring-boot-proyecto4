$(document).ready(function() {

    cargarUsuario();

});

async function cargarUsuario(){

    const request = await fetch('usuarios', {
          method:'GET',
          headers: {

              'Accept':'application/json',
              'Content-Type':'application/json'

          }
    });

    const usuarios = await request.json();

    let HTML_list = '';

    let botones = '<button> <img src="img/eliminar.png" height ="32" width="32" /></button><button><img src="img/modificar.png" height ="32" width="32" /></button>';

    for(let usuario of usuarios){


        let usuario_html = '<tr><td>'+usuario.id+'</td><td>'+usuario.usuario+'</td><td>'+usuario.email+'</td><td>'+usuario.contraseña+'</td><td class="botones">'+botones+'</td></tr>'

        HTML_list += usuario_html;

    }

     document.querySelector('#usuarios tbody').outerHTML = HTML_list;

}
