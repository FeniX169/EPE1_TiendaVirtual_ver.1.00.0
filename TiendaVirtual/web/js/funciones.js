$(document).ready(function (){
    $("tr #btnDelete").click(function (){
        var idp=$(this).parent().find("#idp").val();
        swal({
            title: "Esta Seguro eliminar?",
            text: "Usted puede agregar nuevamente!",
            icon: "warning",
            buttons: true,
            dangerMode: true,
        })
                .then((willDelete) => {
                if (willDelete) {
                    eliminar(idp);
                    swal("Producto eliminado correctamente!", {
                    icon: "success",
                    
                }).then((willDelete)=> {
                    if(willDelete){
                    parent.location.href="controlador?accion=Carrito";
                }
                });
                
                } else {
                swal("Registro no eliminado");
                }
    });
        
    });
    function eliminar(idp){
        var url="controlador?accion=Delete";
        $.ajax({
            type: 'POST',
            url: url,
            data: "idp="+idp,
            success: function (data, textStatus, jqXHR) {
               
               }
                    
        
        })
    }

});
