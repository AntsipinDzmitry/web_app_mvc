package com.runninggroup.web_app_mvc.repository;

import com.runninggroup.web_app_mvc.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GroupRepository extends JpaRepository<Group, Long> {
    Optional<Group> findByContent(String url);
}
