 <!-- Modal Header -->
                  <div class="modal-header">
                    <h4 class="modal-title">Upadte Price</h4>
                  </div>
                  
                  <!-- Modal body -->
                  <div class="modal-body">
                    <div class="container  my-3 bg-dark text-white" style="width: 50%;">

                      <form action="/Royal_Hotel/admin/editroomtype" method="post">
                        <div class="form">
                          <p>ID:</p>
                          <input type="text" class="form-control"
                            placeholder="ID" id="id" name="id" readonly value="${Roomtype.idRoomType}">
                        </div>
                        <div class="form">
                          <p>RoomType</p>
                          <input type="text" class="form-control"
                            placeholder="enter Reason" id="RoomType" name="RoomType" readonly value="${Roomtype.nameRoomType}">
                        </div>
                        <div class="form">
                          <p>Price:</p> 
                          <input type="number" class="form-control"
                            placeholder="enter persent" id="Price" name="Price" value="${Roomtype.price}" >
                        </div>
                        <div class="form">
                          <p>Description:</p>
                          <input type="text" class="form-control"
                            placeholder="enter Reason" id="Description" name="Description" readonly value="${Roomtype.description}">
                        </div>
                        <div class="form">
                          <p>idPrice:</p> <input type="text" class="form-control"
                            placeholder="enter persent" id="idPrice" name="idPrice"  value="${Roomtype.idPrice}">
                        </div>
                        
                        <div style="padding: 10px;">
                          <input type="submit" class="btn btn-success" value="Submit">
                           <a href="/Royal_Hotel/admin/roomtype" class="btn btn-danger"> Close</a>
                        </div>
                      </form>
            
                    </div>
                  </div>
                  
                
                  