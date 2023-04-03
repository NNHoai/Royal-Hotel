let slideIndex = 0;
var swiper = new Swiper(".mySwiper", {
  pagination: {
    el: ".swiper-pagination",
    dynamicBullets: true,
  },
  autoplay: {
    delay: 2000,
  },
});

var number_room = 0;
var total_price = 0;
var listroom = [];


function enable_search() {
  var btn_booking = document.getElementById("btnbooking");
  btn_booking.disabled = false;
  btn_booking.style.background = "#f2a900";
}

function addroom(idroom) {
  ++number_room;
  var nameRoomtype, description, Stringprice;
  var Stringprice1 = "";
  var content = document.querySelectorAll('.roomtype');
  listroom.push(idroom);
  Array.prototype.forEach.call(content, function (el) {
    var id = "#" + idroom;
    var roomtype = el.querySelectorAll(id);
    Array.prototype.forEach.call(roomtype, function (el) {

      var elname = el.querySelectorAll('.nameRoomtype');
      Array.prototype.forEach.call(elname, function (el) {
        nameRoomtype = el.textContent;
      });
      var eldescription = el.querySelectorAll('.description');
      Array.prototype.forEach.call(eldescription, function (el) {
        description = el.textContent;
      });
      var elprice = el.querySelectorAll('.price');
      Array.prototype.forEach.call(elprice, function (el) {
        Stringprice = el.textContent;
      });
      var pricesplit = Stringprice.split('.');

      for (var i = 0; i < pricesplit.length; i++) {
        Stringprice1 += pricesplit[i];
      }
      total_price += Number(Stringprice1);
    });
    // var divInfo = el.querySelectorAll('.list_info_room');
    // Array.prototype.forEach.call(divInfo, function (el) {
    //   var tag_info = "<div class='detail_info_room'><hr><h6><span>Phòng "+number_room+":</span> "+ nameRoomtype + "</h6><h6>"+ price + " VND</h6></div>";
    //   el.innerHTML += tag_info;
    // });

    // var divInfo = el.querySelectorAll('.total_price');
    // Array.prototype.forEach.call(divInfo, function (el) {
    //   el.textContent = total_price + " VND";
    // });
    var price = (Number(Stringprice1)).toLocaleString(
      undefined, { minimumFractionDigits: 0 }
    );

    var tag_info = "<div class='detail_info_room'><hr><h6><span>Phòng " + number_room + ":</span> " + nameRoomtype + "</h6><h6> " + price + " VND</h6></div>";
    document.getElementById("list_info_room").innerHTML += tag_info;

    document.getElementById("total_price").textContent = (total_price).toLocaleString(undefined, { minimumFractionDigits: 0 }) + " VND";

    document.getElementById("listroom").value = listroom;
    enable_search();
  });
}
var radio = document.getElementById("radio_accept");

function check_radio() {
  var citizenId = document.getElementById("citizenId").value;
  var fullname = document.getElementById("fullnameCustommer").value;
  var email = document.getElementById("email").value;
  var reemail = document.getElementById("reemail").value;
  var phone = document.getElementById("phone").value;
  if (citizenId != "" && fullname != "" && email != "" && reemail != "" && phone != "") {
    if (email == reemail) {
      enable_booking();
    }
    else {
      alert("Xác nhận email không trùng khớp!!!!");
      radio.checked = false;
    }
  }
  else {
    alert("Hãy điền đủ thông tin!!!!");
    radio.checked = false;
  }
}
// document.addEventListener('change', check_radio, false);
radio.addEventListener('change', check_radio);

function enable_booking() {
  var btn_booking = document.getElementById("btn_booking");
  btn_booking.disabled = false;
  btn_booking.style.background = "#f2a900";
}
