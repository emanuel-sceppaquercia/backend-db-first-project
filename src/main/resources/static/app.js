cargarUsuarios();

// Hace un fetch a la API y el resultado json lo almacena en la constante "usuarios".
async function cargarUsuarios(){

    const request = await fetch('usuarios',{
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-type': 'application/json'
        }
    });
    const usuarios = await request.json();

    mostrarListado(usuarios);

}

// Recibe una lista de objetos y los concatena en una variable para insertarlo en HTML
function mostrarListado(usuarios){

    let listadoUsuarios = '';
    for (let usuario of usuarios){
        let usuarioHtml = '<tr><th>'+usuario.id+'</th>'
        +'<th>'+ usuario.name +'</th>'
        +'<th>'+ usuario.userName +'</th>'
        +'<th>'+ usuario.email +'</th>'
        +'<th>'+ usuario.password +'</th></tr>';
    
        listadoUsuarios += usuarioHtml;
    }
    
    document.querySelector('table tbody').outerHTML = listadoUsuarios;
}