<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../common/taglib.jsp" %>
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Home Page</title>

</head>

<body>
<!--maincontent-->
    <div class="maincontent">
      <div class="swiper mySwiper">
        <div class="swiper-pagination"></div>
        <div class="swiper-wrapper">
          <div class="swiper-slide"><img src="<c:url value='/template/web/assets/img/baner.jpg'/>" /></div>
          <div class="swiper-slide"><img src="<c:url value='/template/web/assets/img/baner1.jpg'/>" /></div>
          <div class="swiper-slide"><img src="<c:url value='/template/web/assets/img/baner2.jpg'/>" /></div>
          <div class="swiper-slide"><img src="<c:url value='/template/web/assets/img/baner3.jpg'/>" /></div>
          <div class="swiper-slide"><img src="<c:url value='/template/web/assets/img/baner4.jpg'/>" /></div>
        </div>

        <!--searchbooking-->
        <%-- <form action="<c:url value='/loai-phong'/>" method="post"> --%>
        <form action="/Royal_Hotel/loai-phong" method="post">
          <div class="searchbooking">
            <div class="searchform">
              <div class="input">
                <h4>Date Checkin</h4>
                <input type="date" id="datecheckin" />
              </div>

              <div class="input">
                <h4>Date Checkout</h4>
                <input type="date" id="datecheckout" />
              </div>

              <div class="input">
                <h4>Rooms</h4>
                <div class="btn-quantity-room">
                  <i class="fa-solid fa-hotel"></i>
                  <input type="number" id="room" min="0" max="100" />
                </div>
              </div>

              <div class="btn-search">
                <button type="submit">
                  <i class="fa-solid fa-magnifying-glass"></i>
                  <p class="search-text">Search</p>
                </button>
              </div>
            </div>
          </div>
        </form>
      </div>
      <!--aboutus-->
      <div class="aboutus">
        <video autoplay loop muted plays-inline>
          <source src="<c:url value='/template/web/assets/video/aboutus.mp4'/>" type="video/mp4" />
        </video>
        <div class="context-about">
          <h2>About us</h2>
          <p>
            Committed to everyone seeking energy and excitement, we offer
            endless possibilities to unwind and reenergize.
          </p>
          <div class="group">
            <dl>
              <dt>Weekdays:</dt>
              <dd><span>8:00–20:00</span></dd>
            </dl>
            <dl>
              <dt>Weekends:</dt>
              <dd><span>9:00–18:00</span></dd>
            </dl>
          </div>
          <div class="btn_context">
            <button>Read more</button>
          </div>
        </div>
      </div>

      <!--hotelpool-->
      <div class="hotelpool">
        <div class="hotelpool-sub-container">
          <div class="context-pool">
            <h3>Indoor Hotel Pool</h3>
            <p>
              The indoor heated pool has vaulted wood beam ceilings. The
              whirlpool features bay windows and overlooks the pond and the
              north face of the local beauty spot. For the safety and health
              reasons, children must be accompanied by an adult when visiting
              the pool.
            </p>
            <p>
              The serene pool at Royal Villas spa resort and hotel boasts sleek
              décor that features striking floor-to-ceiling teak columns set
              against a cool black tile floor. Poolside dining is also
              available, featuring a selection of dishes from any cuisine you
              desire that are both healthy and delicious. Daily aqua aerobics
              classes help keep guests fit while on the road.
            </p>
            <div class="btn_pool">
              <button>Read more</button>
            </div>
          </div>
          <img src="<c:url value='/template/web/assets/img/hotelpool.jpg'/>" />
        </div>
      </div>
      <!--ourgallery-->
      <div class="ourgallery">
        <div class="header_text">
          <p>Our Gallery</p>
        </div>
        <img src="<c:url value='/template/web/assets/img/ourgallery.jpg'/>" />
      </div>
    </div>
</body>

</html>