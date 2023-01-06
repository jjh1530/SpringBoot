package kr.bit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.bit.entity.BootBoard;
import kr.bit.service.BootBoardService;

@Controller
public class BootBoardController {

	@Autowired
	BootBoardService bootBoardService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<BootBoard> list = bootBoardService.getList();
		model.addAttribute("list", list);
		
		return "list"; // /WEB-INF/board/list.jsp
	}
	
	@GetMapping("/register") 
	public String register() {
		
		return "register";
	}
	
	@PostMapping("/register")
	public String register(BootBoard vo) {
		
		bootBoardService.register(vo);
		
		return "redirect:/list";
	}
	
	@GetMapping("/get")
	public @ResponseBody BootBoard get(Long idx) {
		BootBoard vo = bootBoardService.get(idx);
		return vo;
	}
}
