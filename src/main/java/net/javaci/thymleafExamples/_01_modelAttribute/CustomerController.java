package net.javaci.thymleafExamples._01_modelAttribute;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("customer")
public class CustomerController {
	
	private List<Customer> customers = new ArrayList<>();
	
	@GetMapping("/")
	// @RequestMapping(path = "/", method = RequestMethod.GET)
	public String renderListPage(Model model) {
		model.addAttribute("customer", new Customer());
		model.addAttribute("customers", customers);
		return "customer";
	}

	@PostMapping("/add")
	public String handleAdd(@ModelAttribute Customer customer) {
		System.out.println(customer);
		customers.add(customer);
		return "redirect:/customer/";
	}
	
	@GetMapping("/jsonList")
	@ResponseBody
	public List<Customer> returnJsonData() {
		return customers;
	}
	
	@PutMapping("/jsonList")
	@ResponseBody
	public List<Customer> returnJsonDataFromPut() {
		return customers;
	}

}
