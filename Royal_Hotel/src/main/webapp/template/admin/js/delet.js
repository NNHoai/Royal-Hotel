/**
 * 
 */
$(document).ready(function () {
    $(".btn-delete-user").click(function () {
        let key = $(this).data('key');
        let username = $(this).data('title');
        let tag = "<input type='hidden' name='id' value='"+key+"'>\n\
                    <h5>Are you sure to delete "+username+"</h5>'";
        $("#modal-delete .modal-body").empty();
        $("#modal-delete .modal-body").append(tag);
    });
});