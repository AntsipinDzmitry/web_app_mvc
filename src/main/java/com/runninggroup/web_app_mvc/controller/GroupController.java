package com.runninggroup.web_app_mvc.controller;

import com.runninggroup.web_app_mvc.dto.GroupDTO;
import com.runninggroup.web_app_mvc.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GroupController {
    private GroupService groupService;
    @Autowired
    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }
    @GetMapping("/groups")
    public String listGroups(Model model){
        List<GroupDTO> groups = groupService.findAllGroups();
        model.addAttribute("groups", groups);
        return "groups-list";
    }
}
