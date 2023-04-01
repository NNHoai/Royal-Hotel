package com.fa.mock.Controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fa.mock.Model.admin.PriceByTime;
import com.fa.mock.Model.web.RoomType;
import com.fa.mock.Services.admin.PriceService;


@Controller(value ="controllerOfPrice")
public class PriceController {
	@Autowired
	PriceService price;
	
	@RequestMapping(value = "/admin/pricebytime", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("admin/listprice");
		mav.addObject("PriceByTime",price.getDataPrice());	
		return mav;
	}
	@RequestMapping(value = "/admin/newprice", method = RequestMethod.POST)
	public ModelAndView insertPrice(HttpServletRequest req) {
		PriceByTime bt = new PriceByTime(req.getParameter("ID"),req.getParameter("Reason"),Float.parseFloat(req.getParameter("persent")),req.getParameter("start"),req.getParameter("end"));
		ModelAndView mav = new ModelAndView("admin/listprice");;
		price.insertPrice(bt);
		mav.addObject("PriceByTime",price.getDataPrice());
		return mav;
	}
	@RequestMapping(value = "/admin/editprice", method = RequestMethod.GET)
	public ModelAndView getUpdatePrice(HttpServletRequest req) {
		String id = req.getParameter("id");
		PriceByTime pt = price.getPriceByID(id);
		ModelAndView mav = new ModelAndView("admin/editPrice");
		mav.addObject("PriceByTime",pt);
		return mav;
	}
	@RequestMapping(value = "/admin/editprice", method = RequestMethod.POST)
	public ModelAndView updatePrice(HttpServletRequest req) {
		PriceByTime pt = new PriceByTime(req.getParameter("ID"),req.getParameter("Reason"),Float.parseFloat(req.getParameter("persent")),req.getParameter("start"),req.getParameter("end"));
		ModelAndView mav = new ModelAndView("admin/listprice");
		price.updatePrice(pt);
		mav.addObject("PriceByTime", price.getDataPrice());	
		return mav;
	}
	@RequestMapping(value = "/admin/deleteprice", method = RequestMethod.POST)
	public ModelAndView deletePrice(HttpServletRequest req) {
		String id = req.getParameter("id");
		PriceByTime pt = price.getPriceByID(id);
		ModelAndView mav = new ModelAndView("admin/listprice");
		price.DeletePrice(pt);
		mav.addObject("PriceByTime",price.getDataPrice());	
		return mav;
	}
	@RequestMapping(value = "/admin/priceType", method = RequestMethod.GET)
	public ModelAndView newprice() {
		ModelAndView mav = new ModelAndView("admin/exam");
		mav.addObject("Roomtype",price.getDataRoomType());	
		return mav;
	}
	@RequestMapping(value = "/admin/roomtype", method = RequestMethod.GET)
	public ModelAndView Roomtype() {
		ModelAndView mav = new ModelAndView("admin/roomtype");
		mav.addObject("Roomtype",price.getDataRoomT());	
		return mav;
	}
	@RequestMapping(value = "/admin/editroomtype", method = RequestMethod.GET)
	public ModelAndView getUpdateprice(HttpServletRequest req) {
		String id = req.getParameter("id");
		RoomType pt = price.getTypeByID(id);
		ModelAndView mav = new ModelAndView("admin/editRoomtype");
		mav.addObject("Roomtype",pt);
		return mav;
	}
	@RequestMapping(value = "/admin/editroomtype", method = RequestMethod.POST)
	public ModelAndView updateRoomtype(HttpServletRequest req) {
		RoomType pt = new RoomType(req.getParameter("id"),req.getParameter("RoomType"),Float.parseFloat(req.getParameter("Price")),req.getParameter("Description"),req.getParameter("idPrice"));
		ModelAndView mav = new ModelAndView("admin/roomtype");
		price.updateRoomtype(pt);
		mav.addObject("Roomtype", price.getDataRoomT());	
		return mav;
	
	}
	@RequestMapping(value = "/admin/editidprice", method = RequestMethod.POST)
	public ModelAndView updateIdprice(HttpServletRequest req) {
		String id = req.getParameter("id");
		RoomType pt = price.getID(id);
		ModelAndView mav = new ModelAndView("admin/listprice");
		price.updateIDprice(pt);
		mav.addObject("PriceByTime",price.getDataPrice());	
		return mav;
	}
	@RequestMapping(value = "/admin/editidprice", method = RequestMethod.GET)
	public ModelAndView getUpdateId(HttpServletRequest req) {
		String id = req.getParameter("id");
		RoomType pt = price.getTypeByID(id);
		ModelAndView mav = new ModelAndView("admin/editRoomtype");
		mav.addObject("PriceByTime",pt);
		return mav;
	}
	
	
}
