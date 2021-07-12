package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.EmpDao;
import com.model.Employee;
import com.model.UserModel;

@Controller
public class EmpController {

	@Autowired
	private EmpDao empDao;

	@RequestMapping("/empform")
	public ModelAndView showform() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("command", new Employee());
		mv.setViewName("empform");
		return mv;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Employee emp) {
		ModelAndView mv = new ModelAndView();
		if (!emp.getfName().isEmpty() && !emp.getlName().isEmpty() && !emp.getEmail().isEmpty()
				&& !emp.getPassword().isEmpty() && !String.valueOf(emp.getAge()).isEmpty()) {
			empDao.save(emp);
		}
		mv.setViewName("redirect:/viewemp");
		return mv;
	}

	@RequestMapping("/viewemp")
	public ModelAndView viewmp() {
		ModelAndView mv = new ModelAndView();
		List<Employee> list = empDao.getEmployees();
		mv.addObject("list", list);
		mv.setViewName("viewemp");
		return mv;
	}

	@RequestMapping(value = "/editemp/{id}")
	public ModelAndView edit(@PathVariable int id) {
		ModelAndView mv = new ModelAndView();
		Employee emp = empDao.getEmpById(id);
		mv.addObject("command", emp);
		mv.setViewName("empeditform");
		return mv;
	}

	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("emp") Employee emp) {
		ModelAndView mv = new ModelAndView();
		empDao.update(emp);
		mv.setViewName("redirect:/viewemp");
		return mv;
	}

	@RequestMapping(value = "/deleteemp/{id}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id) {
		ModelAndView mv = new ModelAndView();
		empDao.delete(id);
		mv.setViewName("redirect:/viewemp");
		return mv;
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("login", new UserModel());
		mv.setViewName("login");
		return mv;
	}

	@RequestMapping(value = "/loginPage", method = RequestMethod.POST)
	public ModelAndView loginPage(@ModelAttribute("user") UserModel user) {
		ModelAndView mv = new ModelAndView();
		Employee emp = empDao.validUser(user);
		if (null != emp) {
			mv.addObject("firstName", emp.getfName());
			mv.setViewName("welcome");
		} else {
			mv.addObject("message", "Username or Password is wrong!!");
			mv.setViewName("login");
		}
		return mv;
	}

	@RequestMapping(value = "/viewmp1/{pageId}")
	public ModelAndView getPage(@PathVariable int pageId) {
		ModelAndView mv = new ModelAndView();
		int total = 5;

		pageId = (pageId - 1) * total;

		List<Employee> list = empDao.getPagination(pageId, total);
		mv.addObject("msg", list);
		mv.setViewName("viewmp1");
		return mv;
	}

}
