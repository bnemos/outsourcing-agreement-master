package kg.megalab.outsourcingagreement.services.impl;

import kg.megalab.outsourcingagreement.models.Projects;
import kg.megalab.outsourcingagreement.repo.ProjectsRepo;
import kg.megalab.outsourcingagreement.services.ProjectsService;
import org.springframework.stereotype.Service;

@Service
public class ProjectsServiceImpl implements ProjectsService {

    private ProjectsRepo projectsRepo;

    public ProjectsServiceImpl(ProjectsRepo projectsRepo){
        this.projectsRepo=projectsRepo;
    }

    @Override
    public Projects saveProject(Projects projects) {
        projects = projectsRepo.save(projects);
        return null;
    }
}
