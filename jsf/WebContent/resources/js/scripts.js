$(function(){
    $('.boton_numero').click(function(){
        var text = $('#username-textfield').val();
        $('#username-textfield').val(text + $(this).text());
    });
});