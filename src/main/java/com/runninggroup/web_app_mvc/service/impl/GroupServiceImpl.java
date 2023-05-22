package com.runninggroup.web_app_mvc.service.impl;

import com.runninggroup.web_app_mvc.dto.GroupDTO;
import com.runninggroup.web_app_mvc.models.Group;
import com.runninggroup.web_app_mvc.repository.GroupRepository;
import com.runninggroup.web_app_mvc.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class GroupServiceImpl implements GroupService {
    private GroupRepository groupRepository;

    @Autowired
    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public List<GroupDTO> findAllGroups() {
        List<Group> groups = groupRepository.findAll();
        return groups.stream().map((group)->mapToGroupDTO(group)).collect(Collectors.toList());
    }
    private GroupDTO mapToGroupDTO(Group group){
        GroupDTO groupDTO = GroupDTO.builder()
                .id(group.getId())
                .content(group.getContent())
                .title(group.getTitle())
                .photoUrl(group.getPhotoUrl())
                .createdOn(group.getCreatedOn())
                .updatedOn(group.getUpdatedOn())
                .build();

        return groupDTO;
    }
}
