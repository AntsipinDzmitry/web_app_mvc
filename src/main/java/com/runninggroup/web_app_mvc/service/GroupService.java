package com.runninggroup.web_app_mvc.service;

import com.runninggroup.web_app_mvc.dto.GroupDTO;

import java.util.List;

public interface GroupService {
    List<GroupDTO> findAllGroups();
}
