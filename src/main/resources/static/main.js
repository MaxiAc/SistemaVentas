/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

let articulos = [];


function ajax(url, metodo = "get") {
    const httpMetodo = metodo
    let xhr = new XMLHttpRequest
    xhr.open(httpMetodo, url) // navbar.html - perfil.html
    xhr.send()

    return xhr
}

function cargarMain() {

    const btn = document.querySelectorAll('button')
    const main = document.querySelector('main')

    console.log(btn)
    btn.forEach(bt => {
        bt.addEventListener('click', e => {
            e.preventDefault
            let id = bt.id
            console.log(id)
            let url = id

            let xhr = ajax(url)
            xhr.addEventListener('load', () => {

                if (xhr.status === 200) {
                    main.innerHTML = xhr.response
                    if (url === 'realizarPedido') {
                        cargarEventListener()
                    }
                }
            })

        })
    });

}

function cargarEventListener() {
    const agregarServicio = document.querySelector('#btnServicio')
    agregarServicio.addEventListener('click', agregarArticulo)

}

function agregarArticulo(e) {
    e.preventDefault();
    const producto = e.target.parentElement
    const articulo= document.querySelectorAll('span')
    console.log(articulo[0].textContent)


}




cargarMain()

//agregarProducto.addEventListener('click', e => {
//    console.log("click en aproducto")
//})