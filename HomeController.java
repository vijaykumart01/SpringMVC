package springMvc;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	  @RequestMapping("/home")
	public String home(Model model)
			
	{
		System.out.println("helllofjfj");
		model.addAttribute("name","vijay Kumar");
		model.addAttribute("id",885);
		
		
		List<String> friends =new ArrayList<String>(); 
		friends.add("varsha");
		friends.add("vijay Kumar");
		friends.add("made with each other");
		friends .add("nice couple");
		
		model.addAttribute("f",friends);
		
		return "index";
		
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("helllo i am bout");
		return "about";
	}

	@RequestMapping("/help")
public ModelAndView help() {
	
	System.out.println("can you help me bro-----");
	
	ModelAndView modelandView =new ModelAndView();
	modelandView.addObject("name","VijayVarsha");
	LocalDateTime now=LocalDateTime.now();
	modelandView.addObject("time",now);
	
	List<Integer> list=new ArrayList<Integer>();
	list.add(44);
	list.add(489);
	list.add(43);
	list.add(4774);
	modelandView.addObject("marks",list);
	modelandView.setViewName("help");
	return modelandView;
	
}
	

}
