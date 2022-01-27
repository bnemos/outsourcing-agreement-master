package kg.megalab.outsourcingagreement.controllers;

import kg.megalab.outsourcingagreement.models.Projects;
import kg.megalab.outsourcingagreement.services.ProjectsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/projects")
public class ProjectController {
    ProjectsService projectsService;

    @PostMapping("/save")
    public Projects saveProject(@RequestBody Projects projects){
        return projectsService.saveProject(projects);
    }
}
