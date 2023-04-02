/**
 * 
 */
$(document).ready(function () {
    $(".btn-delete-user1").click(function () {
        let key = $(this).data('key');
        let username = $(this).data('title');
        let tag = "<input type='hidden' name='id' value='"+key+"'>\n\
                    <h5>Are you sure to delete "+username+"</h5>'";
        $("#modal-delete1 .modal-body").empty();
        $("#modal-delete1 .modal-body").append(tag);
    });
});