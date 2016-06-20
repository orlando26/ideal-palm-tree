$(function(){
    $('.boton_numero').click(function(){
        var text = $('#login-form\\:username').val();
        $('#login-form\\:username').val(text + $(this).text());
    });
    
    $('#boton_borrar').click(function(){
        $('#login-form\\:username').val('');
    });
});
