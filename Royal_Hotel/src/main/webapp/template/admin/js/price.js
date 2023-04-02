/**
 * 
 */
 $(document).ready(function () {
    $(".btn-delete-user2").click(function () {
        let key = $(this).data('key');
        let username = $(this).data('title');
        let tag = "<input type='hidden' name='id' value='"+key+"'>\n\
                    <h5>Do you want to update "+username+"</h5>'";
        $("#modal-delete2 .modal-body").empty();
        $("#modal-delete2 .modal-body").append(tag);
    });
});